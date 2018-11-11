package br.org.faetectcc2018.resource;

import br.org.faetectcc2018.dto.TipoBemDTO;
import br.org.faetectcc2018.model.BemCandidato;
import br.org.faetectcc2018.repository.BemCandidatoRepository;
import br.org.faetectcc2018.resource.retrofit.BemCandidatoRestService;
import br.org.faetectcc2018.resource.retrofit.RestPageImpl;
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
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class BemCandidatoResourceTest {

    @Autowired
    private BemCandidatoRestService bemCandidatoRestService;
    @Autowired
    private BemCandidatoRepository bemCandidatoRepository;

    @Test
    public void findPage_UmDado() throws IOException {
        final Integer codigo = 1;
        final String descricao = "Apartamento";
        BemCandidato bemCandidato = new BemCandidato.Builder().comTipoBemCodigo(codigo).comTipoBemDescricao(descricao).buiild();
        bemCandidatoRepository.save(bemCandidato);
        Response<RestPageImpl<BemCandidato>> response = null;

        try {
            response = bemCandidatoRestService.findPage(null, null, null, null).execute();
        } catch (IOException e) {
            fail(e.getMessage());
        }

        assertEquals("Deveria retornar um Http code 200 OK", HttpStatus.OK.value(), response.code());
        assertNotNull("Deveria retornar um corpo", response.body());
        assertEquals("Objeto encontrado não era o esperado", codigo, response.body().getContent().get(0).getCdTipoBemCandidato());
        assertEquals("Objeto encontrado não era o esperado", descricao, response.body().getContent().get(0).getDsTipoBemCandidato());
    }

    @Test
    public void findPage_Vazio() throws IOException {
        Response<RestPageImpl<BemCandidato>> response = bemCandidatoRestService.findPage(null, null, null, null).execute();

        assertEquals("Deveria retornar um Http code 404 NOT FOUND", HttpStatus.NOT_FOUND.value(), response.code());
        assertNull("Deveria retornar um corpo", response.body());
    }

    @Test
    public void findPage_Dados()  {
        final Integer codigo = 1;
        final Integer codigo1 = 2;
        final String descricao = "Apartamento";
        final String descricao1 = "Barco";
        final BemCandidato bemCandidato = new BemCandidato.Builder().comTipoBemCodigo(codigo1).comTipoBemDescricao(descricao1).buiild();
        final BemCandidato bemCandidato1 = new BemCandidato.Builder().comTipoBemCodigo(codigo).comTipoBemDescricao(descricao).buiild();
        bemCandidatoRepository.saveAll(Arrays.asList(bemCandidato, bemCandidato1));
        Response<RestPageImpl<BemCandidato>> response = null;

        try {
            response = bemCandidatoRestService.findPage(null, null, null, null).execute();
        } catch (IOException e) {
            fail(e.getMessage());
        }

        assertEquals("Deveria retornar um Http code 200 OK", HttpStatus.OK.value(), response.code());
        assertNotNull("Deveria retornar um corpo", response.body());
        assertEquals("Deveria está em ordem alfabética", descricao, response.body().getContent().get(0).getDsTipoBemCandidato());
        assertEquals("Deveria está em ordem alfabética", descricao1, response.body().getContent().get(1).getDsTipoBemCandidato());
    }

//    @Test
//    public void find() throws {
//        Optional<BemCandidato> bemCandidato = Optional.ofNullable(bemCandidatoRestService.find(1L).execute().body());
//
//        assertTrue(bemCandidato.isPresent());
//    }
//
    @Test
    public void findTipoDeBem_UmDado() {
        final Integer codigo = 1;
        final String descricao = "Apartamento";
        BemCandidato bemCandidato = new BemCandidato.Builder().comTipoBemCodigo(codigo).comTipoBemDescricao(descricao).buiild();
        bemCandidatoRepository.save(bemCandidato);
        Response<List<TipoBemDTO>> response = null;

        try {
            response = bemCandidatoRestService.findTipoDeBem().execute();
        } catch (IOException e) {
            fail(e.getMessage());
        }

        assertEquals("Deveria retornar um Http code 200 OK", HttpStatus.OK.value(), response.code());
        assertNotNull("Deveria retornar um corpo", response.body());
        assertEquals("Objeto encontrado não era o esperado", codigo, response.body().get(0).getCodigo());
        assertEquals("Objeto encontrado não era o esperado", descricao, response.body().get(0).getDescricao());
    }

    @Test
    public void findTipoDeBem_Dados() {
        final Integer codigo = 1;
        final Integer codigo1 = 2;
        final String descricao = "Apartamento";
        final String descricao1 = "Barco";
        final BemCandidato bemCandidato = new BemCandidato.Builder().comTipoBemCodigo(codigo1).comTipoBemDescricao(descricao1).buiild();
        final BemCandidato bemCandidato1 = new BemCandidato.Builder().comTipoBemCodigo(codigo).comTipoBemDescricao(descricao).buiild();
        bemCandidatoRepository.saveAll(Arrays.asList(bemCandidato, bemCandidato1));
        Response<List<TipoBemDTO>> response = null;

        try {
            response = bemCandidatoRestService.findTipoDeBem().execute();
        } catch (IOException e) {
            fail(e.getMessage());
        }

        assertEquals("Deveria retornar um Http code 200 OK", HttpStatus.OK.value(), response.code());
        assertNotNull("Deveria retornar um corpo", response.body());
        assertEquals("Deveria está em ordem alfabética", descricao, response.body().get(0).getDescricao());
        assertEquals("Deveria está em ordem alfabética", descricao1, response.body().get(1).getDescricao());
    }

    @Test
    public void findTipoDeBem_Vazio() {
        Response<List<TipoBemDTO>> response = null;

        try {
            response = bemCandidatoRestService.findTipoDeBem().execute();
        } catch (IOException e) {
            fail(e.getMessage());
        }

        assertEquals("Deveria retornar um Http code 404 NOT FOUND", HttpStatus.NOT_FOUND.value(), response.code());
        assertNull("Deveria retornar um corpo", response.body());
    }

    public void findTipoDeBem_DadoNulo() {
        BemCandidato bemCandidato = new BemCandidato.Builder().buiild();
        Response<List<TipoBemDTO>> response = null;
        bemCandidatoRepository.save(bemCandidato);

        try {
            response = bemCandidatoRestService.findTipoDeBem().execute();
        } catch (IOException e) {
            fail(e.getMessage());
        }

        assertEquals("Deveria retornar um Http code 404 NOT FOUND", HttpStatus.NOT_FOUND.value(), response.code());
        assertNull("Deveria retornar um corpo", response.body());
    }
}