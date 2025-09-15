package com.example;

import java.time.LocalDate;

public record Pasajero(String nombre, String primerApellido, String segundoApellido, LocalDate fechaNacimiento,
		Genero genero) implements Comparable<Pasajero> {

	public int compareTo(Pasajero otro) {
		int resultado = this.primerApellido.compareTo(otro.primerApellido());
		return resultado != 0 ? resultado
				: (resultado = this.segundoApellido.compareTo(otro.segundoApellido())) != 0 ? resultado
						: this.nombre.compareTo(otro.nombre());
		
		
		
		
		
		
		
		
		
		
	}

}
