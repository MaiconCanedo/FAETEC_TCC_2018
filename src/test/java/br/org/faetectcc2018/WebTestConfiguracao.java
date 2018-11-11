package br.org.faetectcc2018;

import br.org.faetectcc2018.resource.retrofit.BemCandidatoRestService;
import br.org.faetectcc2018.resource.retrofit.CandidatoRestService;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

@Configuration
public class WebTestConfiguracao {

    @Autowired
    private ObjectMapper objectMapper;

    @Value("${server.port}")
    private String port;

    @Bean
    public Retrofit retrofit() {
        return new Retrofit.Builder()
                .baseUrl("http://localhost:"  + port)
                .addConverterFactory(JacksonConverterFactory.create(objectMapper))
                .client(new OkHttpClient.Builder().build())
                .build();
    }

    @Bean
    public CandidatoRestService candidatoRestService() {
        return retrofit().create(CandidatoRestService.class);
    }

    @Bean
    public BemCandidatoRestService bemCandidatoRestService() {
        return retrofit().create(BemCandidatoRestService.class);
    }
}