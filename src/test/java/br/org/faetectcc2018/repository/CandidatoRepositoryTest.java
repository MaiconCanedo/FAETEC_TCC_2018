package br.org.faetectcc2018.repository;

import br.org.faetectcc2018.dto.CargoDTO;
import br.org.faetectcc2018.model.Candidato;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.springframework.data.domain.Sort.Direction.ASC;
import static org.springframework.data.domain.PageRequest.of;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class CandidatoRepositoryTest {

    @Autowired
    private CandidatoRepository candidatoRepository;

    @Test
    public void findBySgUfAndDistinctByCdCargo_SiglasUfCorretasEIguais() {
        final String cargoDescricao1 = "DEPUTADO FEDERAL";
        final String cargoDescricao2 = "GOVERNADOR";

        final Candidato candidato1 = new Candidato.Builder()
                .comNome("Wilson Fisk")
                .comCargoCodigo(5)
                .comCargoDescricao(cargoDescricao2)
                .comSiglaUf("RJ")
                .build();

        final Candidato candidato2 = new Candidato.Builder()
                .comNome("Slade Wilson")
                .comCargoCodigo(6)
                .comCargoDescricao(cargoDescricao1)
                .comSiglaUf("RJ")
                .build();
        candidatoRepository.saveAll(Arrays.asList(candidato1, candidato2));

        final List<CargoDTO> cargos = candidatoRepository.findBySgUfAndDistinctByCdCargo("RJ");

        assertFalse("Nenhum objeto encontrado", cargos.isEmpty());
        assertEquals("Quantidade de dados salvos nao corresponde", 2, cargos.size());
        assertEquals("Objeto encontrado nao corresponde a ordem alfabetica", cargoDescricao1, cargos.get(0).getDescricao());
        assertEquals("Objeto encontrado nao corresponde a ordem alfabetica", cargoDescricao2, cargos.get(1).getDescricao());
    }

    @Test
    public void findBySgUfAndDistinctByCdCargo_SiglasUfCorretasMasDivergentes() {
        final String cargoDescricao = "GOVERNADOR";

        final Candidato candidato1 = new Candidato.Builder()
                .comNome("Wilson Fisk")
                .comCargoCodigo(5)
                .comCargoDescricao(cargoDescricao)
                .comSiglaUf("RJ")
                .build();

        final Candidato candidato2 = new Candidato.Builder()
                .comNome("Slade Wilson")
                .comCargoCodigo(6)
                .comCargoDescricao("DEPUTADO FEDERAL")
                .comSiglaUf("AL")
                .build();
        candidatoRepository.saveAll(Arrays.asList(candidato1, candidato2));

        final List<CargoDTO> cargos = candidatoRepository.findBySgUfAndDistinctByCdCargo("RJ");

        assertFalse("Nenhum objeto encontrado", cargos.isEmpty());
        assertEquals("Quantidade de dados salvos nao corresponde", 1, cargos.size());
        assertEquals("Objeto encontrado nao eh do estado especificado", cargoDescricao, cargos.get(0).getDescricao());
    }

    @Test
    public void findBySgUfAndDistinctByCdCargo_SiglasUfIncorreta() {
        final Candidato candidato1 = new Candidato.Builder()
                .comNome("Wilson Fisk")
                .comCargoCodigo(5)
                .comCargoDescricao("GOVERNADOR")
                .comSiglaUf("RJ")
                .build();

        final Candidato candidato2 = new Candidato.Builder()
                .comNome("Slade Wilson")
                .comCargoCodigo(6)
                .comCargoDescricao("DEPUTADO FEDERAL")
                .comSiglaUf("AL")
                .build();
        candidatoRepository.saveAll(Arrays.asList(candidato1, candidato2));

        final List<CargoDTO> cargos = candidatoRepository.findBySgUfAndDistinctByCdCargo("ER");

        assertTrue("Objeto encontrado, mesmo informando sigla incorreta", cargos.isEmpty());
    }

    @Test
    public void findEstados_CandidatosNotNull() {
        final Candidato candidato1 = new Candidato.Builder()
                .comNome("Manuel Deodoro da Fonseca")
                .comCargoCodigo(1)
                .comCargoDescricao("PRESIDENTE")
                .comSiglaUf("RJ")
                .build();

        final Candidato candidato2 = new Candidato.Builder()
                .comNome("Floriano Vieira Peixoto")
                .comCargoCodigo(1)
                .comCargoDescricao("PRESIDENTE")
                .comSiglaUf("AL")
                .build();
        candidatoRepository.saveAll(Arrays.asList(candidato1, candidato2));

        final List<String> estados = candidatoRepository.findEstados();

        assertFalse("Nenhum objeto foi encontrado", estados.isEmpty());
        assertEquals("Quantidade de objetos salvos nao corresponde", 2, estados.size());
        assertEquals("Estado nao corresponde ao estado salvo e ordenado em ordem alfabetica", "AL", estados.get(0));
        assertEquals("Estado nao corresponde ao estado salvo e ordenado em ordem alfabetica", "RJ", estados.get(1));
    }

    @Test
    public void findBySgUfAndDsCargo_SiglaUfCorretaCargoDescricaoCorreta() {
        final String nome = "Manuel Deodoro da Fonseca";
        final String siglaUF = "RJ";
        final String cargoDescricao = "PRESIDENTE";

        final Candidato candidato = new Candidato.Builder()
                .comNome(nome)
                .comCargoCodigo(1)
                .comCargoDescricao(cargoDescricao)
                .comSiglaUf(siglaUF)
                .build();
        candidatoRepository.save(candidato);

        final Page<Candidato> candidatoPage = candidatoRepository.findBySgUfAndDsCargo(siglaUF, cargoDescricao, of(0, 20, ASC, "nmCandidato"));
        assertFalse("Nenhum objeto foi encontrado", candidatoPage.getContent().isEmpty());
        assertEquals("Tamanho da lista é incoerente", 1, candidatoPage.getTotalElements());
        assertEquals("Objeto encontrado não corresponde", nome, candidatoPage.getContent().get(0).getNmCandidato());
    }

    @Test
    public void findBySgUfAndDsCargo_TestarOrdemAlfabeticaSiglaUfCorretaCargoDescricaoCorreta() {
        final String siglaUF = "RJ";
        final String nome1 = "Dilma Vana Rousseff";
        final String nome2 = "Luiz Inacio Lula da Silva";
        final String cargoDescricao = "PRESIDENTE";

        final Candidato candidato1 = new Candidato.Builder()
                .comNome(nome2)
                .comCargoCodigo(1)
                .comCargoDescricao(cargoDescricao)
                .comSiglaUf(siglaUF)
                .build();

        final Candidato candidato2 = new Candidato.Builder()
                .comNome(nome1)
                .comCargoCodigo(1)
                .comCargoDescricao(cargoDescricao)
                .comSiglaUf(siglaUF)
                .build();

        candidatoRepository.saveAll(Arrays.asList(candidato1, candidato2));

        final Page<Candidato> candidatoPage = candidatoRepository.findBySgUfAndDsCargo(siglaUF, cargoDescricao, of(0, 20, ASC, "nmCandidato"));
        assertFalse("Nenhum objeto foi encontrado", candidatoPage.getContent().isEmpty());
        assertEquals("Tamanho da lista é incoerente", 2, candidatoPage.getTotalElements());
        assertEquals("Objeto encontrado não corresponde a ordem alfabetica", nome1, candidatoPage.getContent().get(0).getNmCandidato());
        assertEquals("Objeto encontrado não corresponde a ordem alfabetica", nome2, candidatoPage.getContent().get(1).getNmCandidato());
    }

    @Test
    public void findBySgUfAndDsCargo_SiglaUfIncorretaCargoDescricaoCorreto() {
        final String nome = "Manuel Deodoro da Fonseca";
        final String siglaUF = "RJ";
        final String cargoDescricao = "PRESIDENTE";
        final Candidato candidato = new Candidato.Builder()
                .comNome(nome)
                .comCargoCodigo(1)
                .comCargoDescricao("PRESIDENTE")
                .comSiglaUf(siglaUF)
                .build();
        candidatoRepository.save(candidato);

        final Page<Candidato> candidatoPage = candidatoRepository.findBySgUfAndDsCargo("ER", cargoDescricao, of(0, 20, ASC, "nmCandidato"));
        assertTrue("Objeto foi encontrado, mesmo informando sigla incorreta", candidatoPage.getContent().isEmpty());
    }

    @Test
    public void findBySgUfAndDsCargo_SiglaUfCorretaCargoDescricaoIncorreta() {
        final String nome = "Manuel Deodoro da Fonseca";
        final String siglaUF = "RJ";
        final String cargoDescricao = "PRESIDENTE";
        final Candidato candidato = new Candidato.Builder()
                .comNome(nome)
                .comCargoCodigo(1)
                .comCargoDescricao("PRESIDENTE")
                .comSiglaUf(siglaUF)
                .build();
        candidatoRepository.save(candidato);

        final Page<Candidato> candidatoPage = candidatoRepository.findBySgUfAndDsCargo(siglaUF, "Descricao Incorreta", of(0, 20, ASC, "nmCandidato"));
        assertTrue("Objeto foi encontrado, mesmo informando a descricao do cargo errada", candidatoPage.getContent().isEmpty());
    }
}