package br.org.faetectcc2018.resource;

import br.org.faetectcc2018.dto.CandidatoDTO;
import br.org.faetectcc2018.model.Candidato;
import br.org.faetectcc2018.repository.CandidatoRepository;
import br.org.faetectcc2018.resource.retrofit.CandidatoRestService;
import br.org.faetectcc2018.resource.retrofit.RestPageImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import retrofit2.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class CandidatoResourceTest {

    @Autowired
    private CandidatoRestService candidatoRestService;
    @Autowired
    private CandidatoRepository candidatoRepository;

    private final String siglaUf = "MG";
    private final Integer cargoCodigo = 6;
    private final String cargoDescricao = "DEPUTADO FEDERAL";
    private final String nome = "Aécio Neves";

    @Before
    public void setUp() {
        final Candidato candidato = new Candidato.Builder().comNome(nome).comSiglaUf(siglaUf).comCargoCodigo(cargoCodigo).comCargoDescricao(cargoDescricao).build();
        candidatoRepository.save(candidato);
    }

    @Test
    public void findByCargoAndUf_CargoCorretoUfCorretaVariosDados() {
        final String uf = "SP";
        final Integer cargo = 3;
        final String nome1 = "Ana Maria da Silva Silveira";
        final String nome2 = "João Dória";
        Candidato candidato1 = new Candidato.Builder().comNome(nome2).comSiglaUf(uf).comCargoCodigo(cargo).comCargoDescricao("GOVERNADOR").build();
        Candidato candidato2 = new Candidato.Builder().comNome(nome1).comSiglaUf(uf).comCargoCodigo(cargo).comCargoDescricao("GOVERNADOR").build();
        Candidato candidato3 = new Candidato.Builder().comNome("José Henrique Neto").comSiglaUf(uf).comCargoCodigo(6).comCargoDescricao("DEPUTADO FEDERAL").build();
        Candidato candidato4 = new Candidato.Builder().comNome("Maria Eduarda Marques").comSiglaUf("RJ").comCargoCodigo(cargo).comCargoDescricao("GOVERNADOR").build();
        candidatoRepository.saveAll(Arrays.asList(candidato1, candidato2, candidato3, candidato4));
        Response<RestPageImpl<CandidatoDTO>> response = null;

        try {
            response = candidatoRestService.findByCargoAndUf(uf, cargo, 0, 20, null, null).execute();
        } catch (IOException e) {
            fail(e.getMessage());
        }

        assertEquals("Status diferente de 200", HttpStatus.OK.value(), response.code());
        assertNotNull("Nenhum candidato foi encontrado", response.body());
        assertEquals("Quantidade de itens não corresponde a busca", 2, response.body().getContent().size());
        assertEquals("Deveria está em ordem alfabética", nome1, response.body().getContent().get(0).getNome());
        assertEquals("Deveria está em ordem alfabética", nome2, response.body().getContent().get(1).getNome());
    }

    @Test
    public void findByCargoAndUf_CargoCorretoUfCorreta() {
        Response<RestPageImpl<CandidatoDTO>> response = null;

        try {
            response = candidatoRestService.findByCargoAndUf(siglaUf, cargoCodigo, 0, 20, null, null).execute();
        } catch (IOException e) {
            fail(e.getMessage());
        }

        assertEquals("Status diferente de 200", HttpStatus.OK.value(), response.code());
        assertNotNull("Nenhum candidato foi encontrado", response.body());
        assertEquals("Quantidade de itens não corresponde a busca", 1, response.body().getContent().size());
        assertEquals("Candidato encontrado não corresponde ao candidato salvo", nome, response.body().getContent().get(0).getNome());
    }

    @Test
    public void findByCargoAndUf_CargoIncorretoUfCorreta() {
        Response<RestPageImpl<CandidatoDTO>> response = null;

        try {
            response = candidatoRestService.findByCargoAndUf(siglaUf, 99, 0, 20, null, null).execute();
        } catch (IOException e) {
            fail(e.getMessage());
        }

        assertEquals("Status diferente de 404 NOT FOND", HttpStatus.NOT_FOUND.value(), response.code());
        assertNull("O Corpo da requisição não estava vazio", response.body());
    }

    @Test
    public void findByCargoAndUf_CargoCorretoUfIncorreta() {
        Response<RestPageImpl<CandidatoDTO>> response = null;

        try {
            response = candidatoRestService.findByCargoAndUf("ER", cargoCodigo, 0, 20, null, null).execute();
        } catch (IOException e) {
            fail(e.getMessage());
        }

        assertEquals("Status diferente de 404 NOT FOND", HttpStatus.NOT_FOUND.value(), response.code());
        assertNull("O Corpo da requisição não estava vazio", response.body());
    }

    @Test
    public void find_IdCorreto() {
        Response<Candidato> response = null;

        try {
            response = candidatoRestService.find(1L).execute();
        } catch (IOException e) {
            fail(e.getMessage());
        }

        assertEquals("Status diferente de 200", HttpStatus.OK.value(), response.code());
        assertNotNull("Nenhum candidato foi encontrado", response.body());
        assertEquals("Candidato encontrado não corresponde ao candidato salvo", nome, response.body().getNmCandidato());
    }

    @Test
    public void find_IdIncorreto() {
        Response<Candidato> response = null;

        try {
            response = candidatoRestService.find(99L).execute();
        } catch (IOException e) {
            fail(e.getMessage());
        }

        assertEquals("Status diferente de 404 NOT FOUND", HttpStatus.NOT_FOUND.value(), response.code());
        assertNull("Nenhum candidato foi encontrado", response.body());
    }

    @Test
    public void findEstados_ComDado() {
        Response<List<String>> response = null;

        try {
            response = candidatoRestService.findEstados().execute();
        } catch (IOException e) {
            fail(e.getMessage());
        }

        assertEquals("Era esperado um status 200 OK", HttpStatus.OK.value(), response.code());
        assertNotNull("Era esperado um corpo", response.body());
        assertEquals("Lista não contém a quantidade correta de objetos", 1, response.body().size());
        assertEquals("O estado encontrado não era o esperado", siglaUf, response.body().get(0));
    }

    @Test
    public void findEstados_ComVariosDados() {
        Candidato candidato1 = new Candidato.Builder().comSiglaUf("AC").build();
        Candidato candidato2 = new Candidato.Builder().comSiglaUf("AC").build();
        Candidato candidato3 = new Candidato.Builder().comSiglaUf("SP").build();
        Candidato candidato4 = new Candidato.Builder().comSiglaUf("GO").build();
        Candidato candidato5 = new Candidato.Builder().comSiglaUf("GO").build();
        candidatoRepository.saveAll(Arrays.asList(candidato1, candidato2, candidato3, candidato4, candidato5));
        Response<List<String>> response = null;

        try {
            response = candidatoRestService.findEstados().execute();
        } catch (IOException e) {
            fail(e.getMessage());
        }

        assertEquals("Era esperado um status 200 OK", HttpStatus.OK.value(), response.code());
        assertNotNull("Era esperado um corpo", response.body());
        assertEquals("Lista não contém a quantidade correta de objetos", 4, response.body().size());
        assertEquals("Deveria está em ordem alfabética", "AC", response.body().get(0));
        assertEquals("Deveria está em ordem alfabética", "GO", response.body().get(1));
        assertEquals("Deveria está em ordem alfabética", "MG", response.body().get(2));
        assertEquals("Deveria está em ordem alfabética", "SP", response.body().get(3));
    }

    @Test
    public void findEstados_ComDadosNulos() {
        List<Candidato> candidatoList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            candidatoList.add(new Candidato.Builder().comNome("Zé Ninguém").comSiglaUf(null).build());
        }
        candidatoRepository.saveAll(candidatoList);
        Response<List<String>> response = null;

        try {
            response = candidatoRestService.findEstados().execute();
        } catch (IOException e) {
            fail(e.getMessage());
        }

        assertEquals("Era esperado um status 200 OK", HttpStatus.OK.value(), response.code());
        assertNotNull("Era esperado um corpo", response.body());
        assertEquals("Lista não contém a quantidade correta de objetos", 1, response.body().size());
        assertEquals("O estado encontrado não era o esperado", siglaUf, response.body().get(0));
    }
}