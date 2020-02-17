package com.example.demo.servicio;

import org.springframework.stereotype.Service;

@Service
public class pruebasServicio {
	
	public String metodoInicio(String mensaje) {
		mensaje.concat(" FUNCIONA LA INVOCACION.");
		return mensaje;
	}
}
