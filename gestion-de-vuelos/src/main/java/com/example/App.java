package com.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



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
    
    	
    	listaEsperaPasajerosVuelo1.stream().forEach(pasajero -> {
    		if (pasajerosVuelo1.size() < vuelo1.getNumeroPlazas()) {
    			pasajerosVuelo1.add(pasajero);
    		} else {
    			System.out.println("El vuelo 1, a BARCELONA, esta completo ya, no admite mas pasajeros");
    		}
    	});
    	
    	vuelo1.setPasajeros(pasajerosVuelo1);
    	
    	
    	/*Vuelo 2 a VALENCIA*/
    	Vuelo vuelo2 = Vuelo.builder()
    			.destino(Destino.VALENCIA)
    			.precio(100.0)
    			.fechaSalida(LocalDate.of(2025, Month.SEPTEMBER, 12))
    			.horaSalida(LocalTime.of(18, 10))
    			.fechaLlegada(LocalDate.of(2025, Month.SEPTEMBER, 12))
    			.horaLlegada(LocalTime.of(21, 0))
    			.numeroPlazas(3)
    			.build();
    	
    	// Crear la lista de espera de pasajeros con destino a Valencia
    	
    	List<Pasajero> listaEsperaPasajerosVuelo2 = null;
    	
    	// Pasajero 1 de la lista de espera
    	
    	Pasajero pasajero12 = new Pasajero("Alberto", "Diaz", "Lara", LocalDate.of(2000, Month.APRIL, 1), Genero.HOMBRE);
    	
    	// Pasajero 2 de la lista de espera
    	
    	Pasajero pasajero22 = new Pasajero("Junior", "Vega", "Monteds", LocalDate.of(2005, Month.SEPTEMBER, 1), Genero.HOMBRE);
    	
    	
    	
    	listaEsperaPasajerosVuelo2 = Arrays.asList(pasajero12, pasajero22);
    	
    	
    	// Listado de pasajeros del vuelo 2
    	
    	List<Pasajero> pasajerosVuelo2 = new ArrayList<Pasajero>();
    	
    	
    	// Hay que recorrer la lista de espera e ir agregando un pasajero a la lista de pasajeros del vuelo 1
    
    	
    	listaEsperaPasajerosVuelo2.stream().forEach(pasajero -> {
    		if (pasajerosVuelo2.size() < vuelo2.getNumeroPlazas()) {
    			pasajerosVuelo2.add(pasajero);
    		} else {
    			System.out.println("El vuelo 2, a Valencia, esta completo ya, no admite mas pasajeros");
    		}
    	});
    	
    	vuelo2.setPasajeros(pasajerosVuelo2);
    	
    	/*Vuelo 3 a PARIS*/
    	
    	Vuelo vuelo3 = Vuelo.builder()
    			.destino(Destino.PARIS)
    			.precio(200.0)
    			.fechaSalida(LocalDate.of(2025, Month.SEPTEMBER, 13))
    			.horaSalida(LocalTime.of(8, 10))
    			.fechaLlegada(LocalDate.of(2025, Month.SEPTEMBER, 13))
    			.horaLlegada(LocalTime.of(14, 0))
    			.numeroPlazas(2)
    			.build();
    	
    	// Crear la lista de espera de pasajeros con destino a Paris
    	
    	List<Pasajero> listaEsperaPasajerosVuelo3 = null;
    	
    	// Pasajero 1 de la lista de espera
    	
    	Pasajero pasajero13 = new Pasajero("Roberta", "Diaz", "Lara", LocalDate.of(2000, Month.APRIL, 1), Genero.MUJER);
    	
    	// Pasajero 2 de la lista de espera
    	
    	Pasajero pasajero23 = new Pasajero("Juan", "Vega", "Montes", LocalDate.of(2005, Month.SEPTEMBER, 1), Genero.MUJER);
    	
    	
    	
    	listaEsperaPasajerosVuelo3 = Arrays.asList(pasajero13, pasajero23);
    	
    	
    	// Listado de pasajeros del vuelo 3
    	
    	List<Pasajero> pasajerosVuelo3 = new ArrayList<Pasajero>();
    	
    	
    	// Hay que recorrer la lista de espera e ir agregando un pasajero a la lista de pasajeros del vuelo 1
    
    	
    	listaEsperaPasajerosVuelo3.stream().forEach(pasajero -> {
    		if (pasajerosVuelo3.size() < vuelo3.getNumeroPlazas()) {
    			pasajerosVuelo3.add(pasajero);
    		} else {
    			System.out.println("El vuelo 3, a Paris, esta completo ya, no admite mas pasajeros");
    		}
    	});
    	
    	vuelo3.setPasajeros(pasajerosVuelo3);
    	
    	
    	// Crear lista de vuelos a Destinos Diferentes
    	
    	List<Vuelo> listadeVuelos = Arrays.asList(vuelo1, vuelo2, vuelo3);
    	
    	// Primer punto del ejercicio
    	// 1. Obtener un listado de los vuelos que tienen el número de plazas completo.
    	
    	List<Vuelo> vuelosCompletos = listadeVuelos.stream()
    			.filter(vuelo -> vuelo.getPasajeros().size() == vuelo.getNumeroPlazas())
    			.collect(Collectors.toList());
    	
    	//Mostrar los vuelos completos
    	System.out.println("vuelos completos");
    	//vuelosCompletos.stream().forEach(vuelo -> System.out.println(vuelo));
    	vuelosCompletos.stream().forEach(System.out::println);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
