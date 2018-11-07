package br.org.faetectcc2018.resources;

import br.org.faetectcc2018.model.Candidato;
import br.org.faetectcc2018.resources.retrofit.CandidatoRestService;
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
import java.util.Optional;

import static java.util.Optional.ofNullable;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class CandidatoResourceTest {

    @Autowired
    private ObjectMapper objectMapper;
    private Retrofit retrofit;
    private OkHttpClient.Builder httpClient;
    private CandidatoRestService candidatoRestService;
    private static final String BASE_URL = "http://localhost:8080";

    @Before
    public void setUp() throws Exception {
        httpClient = new OkHttpClient.Builder();

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(JacksonConverterFactory.create(objectMapper))
                .client(httpClient.build())
                .build();
        candidatoRestService = retrofit.create(CandidatoRestService.class);
    }

    @Test
    public void findPage() throws IOException {
        Optional<Page<Candidato>> candidatos = ofNullable(candidatoRestService.findPage(0, null, null, null).execute().body());

        assertTrue(candidatos.isPresent());
    }

    @Test
    public void find() throws IOException {
        Optional<Candidato> candidato = ofNullable(candidatoRestService.find(1L).execute().body());

        assertTrue(candidato.isPresent());
    }
}