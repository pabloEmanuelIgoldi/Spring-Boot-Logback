package com.applogback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class ApplogbackApplication {

	public static void main(String[] args) {

		try {
			log.info("INICIA APLICACION--> ApplogbackApplication.");
			SpringApplication.run(ApplogbackApplication.class, args);
			log.info("INICIO EXITOSO DE LA APLICACION.");
		} catch (Exception e) {
			log.error("ERROR AL INICIAR LA APLICACION.");
		}
	}
}