package br.org.faetectcc2018.resource;

import br.org.faetectcc2018.dto.TipoBemDTO;
import br.org.faetectcc2018.model.BemCandidato;
import br.org.faetectcc2018.resource.retrofit.BemCandidatoRestService;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class BemCandidatoResourceTest {

    @Autowired
    private Retrofit retrofit;

    private BemCandidatoRestService bemCandidatoRestService;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void findPage() throws IOException {
        Optional<Page<BemCandidato>> bensCandidatos = Optional.ofNullable(bemCandidatoRestService.findPage(0, null, null, null).execute().body());

        assertTrue(bensCandidatos.isPresent());
    }

    @Test
    public void find() throws IOException {
        Optional<BemCandidato> bemCandidato = Optional.ofNullable(bemCandidatoRestService.find(1L).execute().body());

        assertTrue(bemCandidato.isPresent());
    }

    @Test
    public void findTipoDeBem() throws IOException {
        Optional<List<TipoBemDTO>> tipoBemCandidatoList = Optional.ofNullable(bemCandidatoRestService.findTipoDeBem().execute().body());

        assertTrue(tipoBemCandidatoList.isPresent());
        tipoBemCandidatoList.get().forEach(System.out::println);
    }
}