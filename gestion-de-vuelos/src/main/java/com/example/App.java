package com.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
    		
    		if (pasajerosVuelo1.size() < vuelo1.getNumeroPlazas()) {
    			pasajerosVuelo1.add(pasajero);
    		} else {
    			System.out.println("El vuelo 1, a BARCELONA, esta completo ya, no admite mas pasajeros");
    		}
    	}
    	
    	// En esta punto podemos agregar la lista de pasajeros al vuelo 1
    	vuelo1.setPasajeros(pasajerosVuelo1);
    	
    	// vuelo 2 destino Valencia
    	
    	Vuelo vuelo2 = Vuelo.builder()
    			.destino(Destino.VALENCIA)
    			.precio(100).fechaSalida(LocalDate.of(2025, Month.SEPTEMBER, 10))
    			.horaSalida(LocalTime.of(14, 10))
    			.fechaLlegada(LocalDate.of(2025, Month.SEPTEMBER, 10))
    			.horaLlegada(LocalTime.of(16, 0))
    			.numeroPlazas(2)
    			.build();
    	 // Crear la lista de pasajeros del vuelo 2 
    	List<Pasajero>listaEsperaPasajerosVuelo2 = null;
    	
    	// Añadir pasajeros
    	Pasajero pasajero22 = new Pasajero ("Mauricio", "Mendez", "Da Corte", LocalDate.of(1993, Month.FEBRUARY, 3), Genero.HOMBRE);
    	
    	Pasajero pasajero23 = new Pasajero("Ramon Eduardo", "Hernandez", "Mendoza", LocalDate.of(1989, Month.SEPTEMBER, 1), Genero.HOMBRE);
    	
    	Pasajero pasajero24 = new Pasajero("Tahiel", "Soksz", "Andino", LocalDate.of(1990, Month.JULY, 5), Genero.HOMBRE);
    	
    	// Añadir a la lista de pasajeros del vuelo 2
    	listaEsperaPasajerosVuelo2 = Arrays.asList(pasajero22, pasajero23, pasajero24);
    	
    	// crear la lista de pasajeros del vuelo 2
    	List<Pasajero> pasajerosVuelo2 = new ArrayList<Pasajero>();
    	
    	// Recorrer la lista de pasajeros y enviar el mensaje
    	for(Pasajero pasajero : listaEsperaPasajerosVuelo2) {
    		
    		if (pasajerosVuelo2.size() < vuelo2.getNumeroPlazas()) {
    			pasajerosVuelo2.add(pasajero);
    		} else {
    			System.out.println("El vuelo 2, a VALENCIA, esta completo ya, no admite mas pasajeros");
    		}
    	}
    	
    	vuelo2.setPasajeros(pasajerosVuelo2);
    	
    	// Vuelo 3 
    	
    	Vuelo vuelo3 = Vuelo.builder()
    			.destino(Destino.PARIS)
    			.precio(200).fechaSalida(LocalDate.of(2025, Month.SEPTEMBER, 11))
    			.horaSalida(LocalTime.of(14, 10))
    			.fechaLlegada(LocalDate.of(2025, Month.SEPTEMBER, 11))
    			.horaLlegada(LocalTime.of(15, 40))
    			.numeroPlazas(1)
    			.build();
    	 
    	// Crear la lista de pasajeros del vuelo 3 
    	List<Pasajero>listaEsperaPasajerosVuelo3 = null;
    	
    	
    	// Añadir pasajeros
    	Pasajero pasajero33 = new Pasajero ("Andres", "Rojas", "Diaz", LocalDate.of(1994, Month.JUNE, 7), Genero.HOMBRE);
    	
    	Pasajero pasajero34 = new Pasajero("Luis Eduardo", "Quicios", "Juarez", LocalDate.of(1985, Month.SEPTEMBER, 1), Genero.HOMBRE);
    	
    	Pasajero pasajero35 = new Pasajero("Pedro", "Torres", "Andrade", LocalDate.of(1982, Month.MAY, 10), Genero.HOMBRE);
    	
    	// Añadir a la lista de pasajeros del vuelo 3
    	listaEsperaPasajerosVuelo3 = Arrays.asList(pasajero33, pasajero34, pasajero35);
    	
    	// crear la lista de pasajeros del vuelo 2
    	List<Pasajero> pasajerosVuelo3 = new ArrayList<Pasajero>();
    	
    	for(Pasajero pasajero : listaEsperaPasajerosVuelo3) {
    		
    		if (pasajerosVuelo3.size() < vuelo3.getNumeroPlazas()) {
    			pasajerosVuelo3.add(pasajero);
    		} else {
    			System.out.println("El vuelo 3, a PARIS, esta completo ya, no admite mas pasajeros");
    		}
    	}
    	
    	vuelo3.setPasajeros(pasajerosVuelo3);
    	
    	
    	List<Vuelo> listadeVuelos = Arrays.asList(vuelo1, vuelo2, vuelo3);
    	
    	
    	List<Vuelo> vuelosCompletos = listadeVuelos.stream().filter(vuelo -> vuelo.getPasajeros().size() == vuelo.getNumeroPlazas())
    	.collect(Collectors.toList());
    	
    	System.out.println("========================");
    	System.out.println("Vuelos con plazas completas");
    	System.out.println(vuelosCompletos);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
