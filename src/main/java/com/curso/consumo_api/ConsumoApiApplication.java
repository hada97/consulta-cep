package com.curso.consumo_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumoApiApplication.class, args);
		System.out.println("--------------------");
		System.out.println("Serviços em execução");
		System.out.println("--------------------");
	}

}
