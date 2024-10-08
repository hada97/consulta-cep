package com.curso.consumo_api.springdoc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfigurations {

    @Bean
    public OpenAPI customOpenAPI() {

        return new OpenAPI()
                .info(new Info()
                        .title( "API Consulta CEP")
                        .version("v1")
                        .description("[GitHub](https://github.com/hada97/consulta-cep)\n\n"
                        ));
    }
}
