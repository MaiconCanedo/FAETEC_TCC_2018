package br.org.faetectcc2018.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private final ResponseMessage m404 = responseMessage(404, "Não Encontrado");
    private final ResponseMessage m403 = responseMessage(403, "Não Autorizado");
    private final ResponseMessage m401 = responseMessage(401, "Não Autorizado");

    private ResponseMessage responseMessage(Integer code, String message) {
        return new ResponseMessageBuilder().code(code).message(message).build();
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)
                .globalResponseMessage(RequestMethod.GET, Arrays.asList(m401, m403, m404))

                .select()
                .apis(RequestHandlerSelectors.basePackage("br.org.faetectcc2018.resource"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "TCC FAETEC TI 2018",
                "TRABALHO DE CONCLUSÃO DE CURSO FAETEC TI 2018",
                "Versão 1.0",
                "https://github.com/MaiconCanedo/FAETEC_TCC_2018",
                new Contact("Maicon Canedo", "https://github.com/MaiconCanedo/FAETEC_TCC_2018.git", "maicon.canedo2013@outlook.com"),
                "Permitido uso para estudantes",
                "https://github.com/MaiconCanedo/FAETEC_TCC_2018",
                Collections.emptyList()
        );
    }
}
