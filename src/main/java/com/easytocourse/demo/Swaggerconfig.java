package com.easytocourse.demo;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class Swaggerconfig {

	private ApiInfo apiInfo() {
		return new ApiInfo("Employee REST API", "Get the information about Employee", "API EMP", "Employee",
				new Contact("Easytocourse", "www.example.com", "sample@gmail.com"), "License of API", "API license URL",
				Collections.emptyList());
	}

	@Bean
	public Docket api() {

		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.easytocourse.demo.controller"))
				.paths(PathSelectors.any()).build();
	}

}
