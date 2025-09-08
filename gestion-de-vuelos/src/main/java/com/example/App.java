package com.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
	
	
    public static void main(String[] args) {
    	
    	// Crear un vuelo a cada uno de los destinos que tengo en el enum Destino
    	
    	/* Vuelo con destino a BARCELONA */
    	
    	Vuelo vuelo1 = Vuelo.builder()
    			.destino(Destino.BARCELONA)
    			.precio(120.0)
    			.fechaSalida(LocalDate.of(2025, Month.SEPTEMBER, 9))
    			.horaSalida(LocalTime.of(17, 10))
    			.fechaLlegada(LocalDate.of(2025, Month.SEPTEMBER, 9))
    			.horaLlegada(LocalTime.of(20, 0))
    			.numeroPlazas(2)
    			.build();
    	
    	// Crear la lista de espera de pasajeros con destino a BARCELONA
    	
    	List<Pasajero> listaEsperaPasajerosVuelo1 = null;
    	
    	// Pasajero 1 de la lista de espera
    	
    	Pasajero pasajero11 = new Pasajero("Carlos Alberto", "Diaz", "Lara", LocalDate.of(2000, Month.APRIL, 1), Genero.HOMBRE);
    	
    	// Pasajero 2 de la lista de espera
    	
    	Pasajero pasajero21 = new Pasajero("Gilberto Junior", "Vega", "Monteds", LocalDate.of(2005, Month.SEPTEMBER, 1), Genero.HOMBRE);
    	
    	// Pasajero 3 de la lista de espera
    	
    	Pasajero pasajero31 = new Pasajero("Belepo", "Boriba", "Bokesa", LocalDate.of(1995, Month.NOVEMBER, 10), Genero.HOMBRE);
    	
    	listaEsperaPasajerosVuelo1 = Arrays.asList(pasajero11, pasajero21, pasajero31);
    	
    	
    	// Listado de pasajeros del vuelo 1
    	
    	List<Pasajero> pasajerosVuelo1 = new ArrayList<Pasajero>();
    	
    	
    	// Hay que recorrer la lista de espera e ir agregando un pasajero a la lista de pasajeros del vuelo 1
    	
    	for(Pasajero pasajero : listaEsperaPasajerosVuelo1) {
    		
    		if (pasajerosVuelo1.size() <= vuelo1.getNumeroPlazas()) {
    			pasajerosVuelo1.add(pasajero);
    		} else {
    			System.out.println("El vuelo esta completo ya");
    		}
    	}
    	
    	// En esta punto podemos agregar la lista de pasajeros al vuelo 1
    	vuelo1.setPasajeros(pasajerosVuelo1);
    	
    	
    	
    }
}
