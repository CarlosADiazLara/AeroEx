package com.example;

import java.time.LocalDate;

public record Pasajero(String nombre,
		String primerApellido, 
		String segundoApellido, 
		LocalDate fechaNacimiento, 
		Genero genero) {

}
