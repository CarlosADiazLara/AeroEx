package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {

		// Crear un vuelo a cada uno de los destinos que tengo en el enum Destino

		/* Vuelo con destino a BARCELONA */

		Vuelo vuelo1 = Vuelo.builder().destino(Destino.BARCELONA).precio(120.0)
				.fechaSalida(LocalDate.of(2025, Month.OCTOBER, 21)).horaSalida(LocalTime.of(23, 00))
				.fechaLlegada(LocalDate.of(2025, Month.OCTOBER, 23)).horaLlegada(LocalTime.of(14, 00)).numeroPlazas(2)
				.build();

		// Crear la lista de espera de pasajeros con destino a BARCELONA

		List<Pasajero> listaEsperaPasajerosVuelo1 = null;

		// Pasajero 1 de la lista de espera

		Pasajero pasajero11 = new Pasajero("Carlos Alberto", "Diaz", "Lara", LocalDate.of(2000, Month.APRIL, 1),
				Genero.HOMBRE);

		// Pasajero 2 de la lista de espera

		Pasajero pasajero21 = new Pasajero("Gilberto Junior", "Vega", "Monteds", LocalDate.of(2005, Month.SEPTEMBER, 1),
				Genero.HOMBRE);

		// Pasajero 3 de la lista de espera

		Pasajero pasajero31 = new Pasajero("Belepo", "Boriba", "Bokesa", LocalDate.of(1995, Month.NOVEMBER, 10),
				Genero.HOMBRE);

		listaEsperaPasajerosVuelo1 = Arrays.asList(pasajero11, pasajero21, pasajero31);

		// Listado de pasajeros del vuelo 1

		List<Pasajero> pasajerosVuelo1 = new ArrayList<Pasajero>();

		// Hay que recorrer la lista de espera e ir agregando un pasajero a la lista de
		// pasajeros del vuelo 1

		listaEsperaPasajerosVuelo1.stream().forEach(pasajero -> {
			if (pasajerosVuelo1.size() < vuelo1.getNumeroPlazas()) {
				pasajerosVuelo1.add(pasajero);
			} else {
				System.out.println("El vuelo 1, a BARCELONA, esta completo ya, no admite mas pasajeros");
			}
		});

		vuelo1.setPasajeros(pasajerosVuelo1);

		/* Vuelo 2 a VALENCIA */
		Vuelo vuelo2 = Vuelo.builder().destino(Destino.VALENCIA).precio(100.0)
				.fechaSalida(LocalDate.of(2025, Month.SEPTEMBER, 12)).horaSalida(LocalTime.of(18, 10))
				.fechaLlegada(LocalDate.of(2025, Month.SEPTEMBER, 12)).horaLlegada(LocalTime.of(21, 0)).numeroPlazas(3)
				.build();

		// Crear la lista de espera de pasajeros con destino a Valencia

		List<Pasajero> listaEsperaPasajerosVuelo2 = null;

		// Pasajero 1 de la lista de espera

		Pasajero pasajero12 = new Pasajero("Alberto", "Diaz", "Lara", LocalDate.of(2000, Month.APRIL, 1),
				Genero.HOMBRE);

		// Pasajero 2 de la lista de espera

		Pasajero pasajero22 = new Pasajero("Junior", "Vega", "Monteds", LocalDate.of(2005, Month.SEPTEMBER, 1),
				Genero.HOMBRE);

		listaEsperaPasajerosVuelo2 = Arrays.asList(pasajero12, pasajero22);

		// Listado de pasajeros del vuelo 2

		List<Pasajero> pasajerosVuelo2 = new ArrayList<Pasajero>();

		// Hay que recorrer la lista de espera e ir agregando un pasajero a la lista de
		// pasajeros del vuelo 1

		listaEsperaPasajerosVuelo2.stream().forEach(pasajero -> {
			if (pasajerosVuelo2.size() < vuelo2.getNumeroPlazas()) {
				pasajerosVuelo2.add(pasajero);
			} else {
				System.out.println("El vuelo 2, a Valencia, esta completo ya, no admite mas pasajeros");
			}
		});

		vuelo2.setPasajeros(pasajerosVuelo2);

		/* Vuelo 3 a PARIS */

		Vuelo vuelo3 = Vuelo.builder().destino(Destino.PARIS).precio(200.0)
				.fechaSalida(LocalDate.of(2025, Month.SEPTEMBER, 13)).horaSalida(LocalTime.of(8, 10))
				.fechaLlegada(LocalDate.of(2025, Month.SEPTEMBER, 13)).horaLlegada(LocalTime.of(14, 0)).numeroPlazas(2)
				.build();

		// Crear la lista de espera de pasajeros con destino a Paris

		List<Pasajero> listaEsperaPasajerosVuelo3 = null;

		// Pasajero 1 de la lista de espera

		Pasajero pasajero13 = new Pasajero("Roberta", "Diaz", "Lara", LocalDate.of(2000, Month.APRIL, 1), Genero.MUJER);

		// Pasajero 2 de la lista de espera

		Pasajero pasajero23 = new Pasajero("Juana", "Vega", "Montes", LocalDate.of(2005, Month.SEPTEMBER, 1),
				Genero.MUJER);

		listaEsperaPasajerosVuelo3 = Arrays.asList(pasajero13, pasajero23);

		// Listado de pasajeros del vuelo 3

		List<Pasajero> pasajerosVuelo3 = new ArrayList<Pasajero>();

		// Hay que recorrer la lista de espera e ir agregando un pasajero a la lista de
		// pasajeros del vuelo 1

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
				.filter(vuelo -> vuelo.getPasajeros().size() == vuelo.getNumeroPlazas()).collect(Collectors.toList());

		// Mostrar los vuelos completos
		System.out.println("vuelos completos");
		// vuelosCompletos.stream().forEach(vuelo -> System.out.println(vuelo));
		vuelosCompletos.stream().forEach(System.out::println);

		// Punto 2 del ejercicio
		// 2. Obtener un listado de los vuelos que tienen fecha de salida prevista para
		// el
		// día de hoy.
		List<Vuelo> vuelosDeHoy = listadeVuelos.stream()
				.filter(vuelo -> vuelo.getFechaSalida().isEqual(LocalDate.now())).toList();

		System.out.println("vuelos de hoy");
		vuelosDeHoy.stream().forEach(System.out::println);

		// Punto 3
		// Obtener un listado de los vuelos cuya duración sea mayor de 10 horas.

//    	List<Vuelo> vuelosDeLargaDuracion = listadeVuelos.stream()
//    		    .filter(vuelo -> {
//    		        Duration duracion = Duration.between(vuelo.getHoraSalida(), vuelo.getHoraLlegada()).plusDays(
//    		            vuelo.getFechaLlegada().toEpochDay() - vuelo.getFechaSalida().toEpochDay());
//    		        return duracion.toHours() > 10;
//    		    })
//    		    .collect(Collectors.toList());
//    	
//    	System.out.println("vuelos de mas de 10 horas");
//    	vuelosDeLargaDuracion.stream().forEach(System.out::println);

//    	List<Vuelo> vuelosLargaDuracion = listadeVuelos.stream()
//    		    .filter(vuelo -> vuelo.getDuration() > 10)
//    		    .collect(Collectors.toList());
//    	System.out.println("Vuelos de mas de 10 horas");
//    	vuelosLargaDuracion.stream().forEach(System.out::println);

		List<Vuelo> vuelosLargaDuracion = listadeVuelos.stream()
				.filter(vuelo -> ChronoUnit.HOURS.between(
						LocalDateTime.of(vuelo.getFechaSalida(), vuelo.getHoraSalida()),
						LocalDateTime.of(vuelo.getFechaLlegada(), vuelo.getHoraLlegada())) > 10)
				.collect(Collectors.toList());

		System.out.println("Vuelos de mas de 10 horas");
		vuelosLargaDuracion.stream().forEach(System.out::println);

		// Punto 4
		// Obtener un listado de los vuelos que pueden demorar más de un día en llegar
		// a su destino.

//    		List<Vuelo> vuelosDeMasDeUnDia = listadeVuelos.stream()
//        		    .filter(vuelo -> ChronoUnit.HOURS
//        		    		.between(LocalDateTime.of(vuelo.getFechaSalida(), vuelo.getHoraSalida())
//        		    				,LocalDateTime.of(vuelo.getFechaLlegada(), vuelo.getHoraLlegada())) > 24)
//        		    .collect(Collectors.toList());
//
//        		System.out.println("Vuelos de mas de 1 dia");
//        		vuelosDeMasDeUnDia.stream().forEach(System.out::println);

		List<Vuelo> vuelosDeMasDeUnDia = listadeVuelos.stream().filter(vuelo -> vuelo.getDuration() > 24)
				.collect(Collectors.toList());
		System.out.println("Vuelos de mas de un dia");
		vuelosDeMasDeUnDia.stream().forEach(System.out::println);

		// Punto 5
		// Obtener una colección que almacene un listado de pasajeros agrupado por el
		// destino del vuelo

		Map<Destino, List<Pasajero>> pasajerosPorDestino;
		
		pasajerosPorDestino = listadeVuelos.stream().collect(Collectors.toMap(Vuelo::getDestino, Vuelo::getPasajeros));
			    
		System.out.println("===================");
		System.out.println("Pasajeros agrupados por destino");
		
		pasajerosPorDestino.entrySet().forEach(entry -> {
			System.out.println("Destino: " + entry.getKey());
			
			System.out.println("Pasajeros" + entry.getValue());
			
			
		});
		
		
		
		// Punto 6
		// Crear una colección que almacene los vuelos que están programados para 
		//salir en los últimos 10 días del mes en curso. 
		
		List<Vuelo> vuelosUltimosDiasDelMes = listadeVuelos.stream()
				.filter(vuelo -> vuelo.getFechaSalida().with(TemporalAdjusters.lastDayOfMonth())
						.minusDays(10).isBefore(vuelo.getFechaSalida()) &&
						vuelo.getFechaSalida().getMonth().equals(LocalDate.now().getMonth())).toList();
		
		System.out.println("===============================");
		System.out.println("Vuelos de los ultimos 10 dias del mes en curso");
		vuelosUltimosDiasDelMes.stream().forEach(System.out::println);
		
		
		
		// Punto 7
		
		 //Crear una colección que almacene  los pasajeros, por el genero y la edad del pasajero
		
		Map<Genero,Map<Long, List<Pasajero>>> pasajerosPorGeneroYEdad;
		
		pasajerosPorGeneroYEdad = listadeVuelos.stream()
				.flatMap(vuelo -> vuelo.getPasajeros().stream())
				.collect(Collectors.groupingBy(pasajero -> pasajero.genero(), 
						Collectors.groupingBy(pasajero -> ChronoUnit.YEARS.between(pasajero.fechaNacimiento(), 
								LocalDate.now()), Collectors.toList())));
		
		System.out.println("========================");
		System.out.println("Pasajeros por genero y edad");
		pasajerosPorGeneroYEdad.entrySet().forEach(entry -> {
			System.out.println("Genero: " + entry.getKey());
			
			System.out.println("Pasajero " + entry.getValue());
		});
		
		
		// Punto 8
		
		// Mostrar la colección anterior ordenada por el nombre y los apellidos de los 
		//pasajeros en orden natural. 
		
		
		// 1. Aplanamos la lista de pasajeros de todos los vuelos.
		List<Pasajero> allPasajeros = listadeVuelos.stream()
		    .flatMap(vuelo -> vuelo.getPasajeros().stream())
		    .collect(Collectors.toList());

		// 2. Ordenamos la lista usando un Comparator para lograr el orden natural.
		allPasajeros.sort(Comparator.comparing(Pasajero::primerApellido)
		    .thenComparing(Pasajero::segundoApellido)
		    .thenComparing(Pasajero::nombre));

		// 3. Imprimimos la lista ordenada.
		System.out.println("========================");
		System.out.println("Pasajeros ordenados por nombre y apellidos (orden natural):");
		allPasajeros.forEach(pasajero ->
		    System.out.println(pasajero.primerApellido() + " " + pasajero.segundoApellido() + ", " + pasajero.nombre())
		);
		
		
		// Punto 9 
		
		// Mostrar la colección del punto 7 ordenada en orden alfabético inverso por el 
		//primer apellido, sin modificar el orden natural de la clase Pasajero. 
		
		// 1. Aplanamos la lista de todos los pasajeros de todos los vuelos.
		List<Pasajero> pasajerosOrdenInverso = listadeVuelos.stream()
		    .flatMap(vuelo -> vuelo.getPasajeros().stream())
		    .collect(Collectors.toList());

		// 2. Ordenamos la lista de pasajeros por el primer apellido en orden inverso.
		allPasajeros.sort(Comparator.comparing(Pasajero::primerApellido).reversed());

		// 3. Imprimimos la lista ordenada.
		System.out.println("========================");
		System.out.println("Pasajeros ordenados por primer apellido (orden inverso):");
		pasajerosOrdenInverso.forEach(pasajero ->
		    System.out.println(pasajero.primerApellido() + " " + pasajero.segundoApellido() + ", " + pasajero.nombre())
		);
		
		
		// Punto 10
		
		//Obtener una colección que almacene el nombre y el apellido de los 
		//pasajeros, agrupado por las horas de duración de su viaje. 
		
		
		
	
		
		
		
		
		
	}
}
