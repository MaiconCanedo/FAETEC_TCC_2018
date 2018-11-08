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
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class BemCandidatoResourceTest {

    @Autowired
    private ObjectMapper objectMapper;
    private Retrofit retrofit;
    private OkHttpClient.Builder httpClient;
    private BemCandidatoRestService bemCandidatoRestService;
    private static final String BASE_URL = "http://localhost:8080";

    @Before
    public void setUp() throws Exception {
        httpClient = new OkHttpClient.Builder();
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(JacksonConverterFactory.create(objectMapper))
                .client(httpClient.build())
                .build();
        bemCandidatoRestService = retrofit.create(BemCandidatoRestService.class);
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