package com.example;

import java.time.LocalDate;

public record Pasajero(String nombre,
		String primerApellido, 
		String segundoApellido, 
		LocalDate fechaNacimiento, 
		Genero genero) implements Comparable<Pasajero>{

	@Override
	public int compareTo(Pasajero o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
