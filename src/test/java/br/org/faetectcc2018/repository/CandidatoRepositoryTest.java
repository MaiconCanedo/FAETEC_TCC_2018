package br.org.faetectcc2018.repository;

import br.org.faetectcc2018.dto.CargoDTO;
import br.org.faetectcc2018.model.Candidato;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class CandidatoRepositoryTest {

    @Autowired
    private CandidatoRepository candidatoRepository;

    @Test
    public void findBySgUfAndDistinctByCdCargo_ComDadosSalvos() {
        Candidato candidato1 = new Candidato.Builder()
                .comCargoCodigo(5)
                .comCargoDescricao("GOVERNADOR")
                .comSiglaUf("RJ")
                .build();

        Candidato candidato2 = new Candidato.Builder()
                .comCargoCodigo(6)
                .comCargoDescricao("DEPUTADO FEDERAL")
                .comSiglaUf("AL")
                .build();
        candidatoRepository.saveAll(Arrays.asList(candidato1, candidato2));

        Optional<List<CargoDTO>> cargos = Optional.ofNullable(candidatoRepository.findBySgUfAndDistinctByCdCargo("RJ"));

        assertTrue("Nenhum objeto encontrado", cargos.isPresent());
    }

    @Test
    public void findBySgUfAndDistinctByCdCargo_SemDadosSalvos() {
        Optional<List<CargoDTO>> cargos = Optional.ofNullable(candidatoRepository.findBySgUfAndDistinctByCdCargo("RJ"));

        assertFalse("Objeto encontrado, mesmo sem dados salvos no banco", cargos.isPresent());
    }

    @Test
    public void findEstados_ComEstados() {
        Candidato candidato1 = new Candidato.Builder()
                .comNome("Manuel Deodoro da Fonseca")
                .comCargoCodigo(1)
                .comCargoDescricao("PRESIDENTE")
                .comSiglaUf("RJ")
                .build();

        Candidato candidato2 = new Candidato.Builder()
                .comNome("Floriano Vieira Peixoto")
                .comCargoCodigo(1)
                .comCargoDescricao("PRESIDENTE")
                .comSiglaUf("AL")
                .build();
        candidatoRepository.saveAll(Arrays.asList(candidato1, candidato2));

        Optional<List<String>> estados = Optional.ofNullable(candidatoRepository.findEstados());

        assertTrue("Nenhum estado foi encontrado", estados.isPresent());
        assertEquals("Quantidade de estados salvos nao corresponde", 2, estados.get().size());
        assertEquals("Estado nao corresponde ao estado salvo e ordenado em ordem alfabetica", "AL", estados.get().get(0));
        assertEquals("Estado nao corresponde ao estado salvo e ordenado em ordem alfabetica", "RJ", estados.get().get(1));
    }

    @Test
    public void findEstados_SemEstados() {
        Optional<List<String>> estados = Optional.ofNullable(candidatoRepository.findEstados());

        assertFalse("Objeto encontrado, mesmo sem dados salvos", estados.isPresent());
    }

    @Test
    public void findBySgUfAndCdCargoOrderByNmCandidato_ComDados() {
        candidatoRepository.findBySgUfAndCdCargo("RJ", 6, PageRequest.of(0, 20, Sort.Direction.ASC, "nmCandidato"));
    }

    @Test
    public void findBySgUfAndCdCargoOrderByNmCandidato_SemDados() {
        Page<Candidato> candidatoPage = candidatoRepository.findBySgUfAndCdCargo("RJ", 6, PageRequest.of(0, 20, Sort.Direction.ASC, "nmCandidato"));
    }

    @Test
    public void findAll_SemDados() {
        Optional<List<Candidato>> candidatoList = Optional.ofNullable(candidatoRepository.findAll());
        assertFalse("", candidatoList.isPresent());
    }
}