package com.applogback.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))  // tipo de anotaciones	
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo());
	}
	
	
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Documentación API DEMO LOG BACK.")
                .description("Descripción detallada de los endpoints")
                .version("1.0")
                .build();
    }
}
