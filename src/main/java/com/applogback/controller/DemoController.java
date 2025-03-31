package com.applogback.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@RestController
@RequestMapping("/api/v1/test")
public class DemoController {

	@GetMapping()
	public String getMethodName() {
		log.debug("Mensaje DEBUG: útil para depuración");
		log.info("Mensaje INFO: proceso exitoso");
		log.warn("Mensaje WARN: posible problema detectado");
		log.error("Mensaje ERROR: fallo crítico en la aplicación");
		return "EL TEST PARA VERIFICAR LOS NIVELES DE REGISTRO SE EJECUTO CORRECTAMENTE. RECUERDE: DEBUG < INFO < WARN < ERROR.";		
	}


}
