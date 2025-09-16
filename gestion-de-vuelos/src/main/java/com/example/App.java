package com.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {

		// Crear un vuelo a cada uno de los destinos que tengo en el enum Destino

		/* Vuelo con destino a BARCELONA */

		Vuelo vuelo1 = Vuelo.builder().destino(Destino.BARCELONA).precio(120.0)
				.fechaSalida(LocalDate.of(2025, Month.SEPTEMBER, 16)).horaSalida(LocalTime.of(14, 10))
				.fechaLlegada(LocalDate.of(2025, Month.SEPTEMBER, 17)).horaLlegada(LocalTime.of(20, 0)).numeroPlazas(2)
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
				.fechaSalida(LocalDate.of(2025, Month.SEPTEMBER, 17)).horaSalida(LocalTime.of(18, 10))
				.fechaLlegada(LocalDate.of(2025, Month.SEPTEMBER, 18)).horaLlegada(LocalTime.of(21, 0)).numeroPlazas(3)
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
				.fechaSalida(LocalDate.of(2025, Month.OCTOBER, 13)).horaSalida(LocalTime.of(8, 10))
				.fechaLlegada(LocalDate.of(2025, Month.OCTOBER, 13)).horaLlegada(LocalTime.of(14, 0)).numeroPlazas(2)
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
		System.out.println("================");
		System.out.println("Vuelos completos");
		// vuelosCompletos.stream().forEach(vuelo -> System.out.println(vuelo));
		vuelosCompletos.stream().forEach(System.out::println);

		// Punto 2 del ejercicio
		// 2. Obtener un listado de los vuelos que tienen fecha de salida prevista para
		// el
		// día de hoy.
		List<Vuelo> vuelosDeHoy = listadeVuelos.stream()
				.filter(vuelo -> vuelo.getFechaSalida().isEqual(LocalDate.now())).toList();

		System.out.println("=============");
		System.out.println("Vuelos de hoy");
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

		System.out.println("=========================");
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
		
		System.out.println("======================");
		System.out.println("Vuelos de mas de 1 dia");
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
		// salir en los últimos 10 días del mes en curso.

		List<Vuelo> vuelosUltimosDiasDelMes = listadeVuelos.stream()
				.filter(vuelo -> vuelo.getFechaSalida().with(TemporalAdjusters.lastDayOfMonth()).minusDays(10).isBefore(
						vuelo.getFechaSalida()) && vuelo.getFechaSalida().getMonth().equals(LocalDate.now().getMonth()))
				.toList();

		System.out.println("===============================");
		System.out.println("Vuelos de los ultimos 10 dias del mes en curso");
		vuelosUltimosDiasDelMes.stream().forEach(System.out::println);

		// Punto 7

		// Crear una colección que almacene los pasajeros, por el genero y la edad del
		// pasajero

		Map<Genero, Map<Long, List<Pasajero>>> pasajerosPorGeneroYEdad;

		pasajerosPorGeneroYEdad = listadeVuelos.stream().flatMap(vuelo -> vuelo.getPasajeros().stream())
				.collect(Collectors.groupingBy(Pasajero::genero,
						Collectors.groupingBy(
								pasajero -> ChronoUnit.YEARS.between(pasajero.fechaNacimiento(), LocalDate.now()),
								Collectors.toList())));

		System.out.println("Solucion al punto 7");
		pasajerosPorGeneroYEdad.entrySet().forEach(entry -> {
			System.out.println("Genero: " + entry.getKey());
			entry.getValue().entrySet().forEach(entry2 -> {
				System.out.println("Edad: " + entry2.getKey());
				System.out.println("Pasajeros: " + entry2.getValue());
			});
		});

//		Map<Genero,Map<Long, List<Pasajero>>> pasajerosPorGeneroYEdad;
//		
//		pasajerosPorGeneroYEdad = listadeVuelos.stream()
//				.flatMap(vuelo -> vuelo.getPasajeros().stream())
//				.collect(Collectors.groupingBy(pasajero -> pasajero.genero(), 
//						Collectors.groupingBy(pasajero -> ChronoUnit.YEARS.between(pasajero.fechaNacimiento(), 
//								LocalDate.now()), Collectors.toList())));
//		
//		System.out.println("========================");
//		System.out.println("Pasajeros por genero y edad");
//		pasajerosPorGeneroYEdad.entrySet().forEach(entry -> {
//			System.out.println("Genero: " + entry.getKey());
//			
//			System.out.println("Pasajero " + entry.getValue());
//		});

		// Punto 8

		// Mostrar la colección anterior ordenada por el nombre y los apellidos de los
		// pasajeros en orden natural.
		System.out.println("=======================");
		System.out.println("Ordenados por orden Natural");
		pasajerosPorGeneroYEdad.entrySet().forEach(entry -> {
			System.out.println("Del genero: " + entry.getKey());
			Map<Long, List<Pasajero>> pasajerosPorEdad = entry.getValue();
			pasajerosPorEdad.entrySet().forEach(entry2 -> {
				System.out.println("Edad:" + entry2.getKey());
				entry2.getValue().stream().sorted().forEach(System.out::println);
			});
		});

		// Esto repite pasajeros porque una coleccion ( List ) admite pasajeros
		// duplicados
//		List<Pasajero> todosLosPasajeros = pasajerosPorGeneroYEdad.values().stream()
//				.flatMap(mapaEdad -> mapaEdad.values().stream()).flatMap(List::stream).collect(Collectors.toList());
//
//		// 2. Ordenamos la lista aplanada usando el orden natural de la clase Pasajero
//		// (el que definiste con el método compareTo).
//		todosLosPasajeros.sort(Comparator.naturalOrder());
		// Collections.sort(todoslosPasajeros);
//		// O de forma más concisa:
//		// todosLosPasajeros.sort(null);
//
//		// 3. Imprimimos los nombres y apellidos de los pasajeros ya ordenados
//		System.out.println("========================");
//		System.out.println("Pasajeros ordenados por orden natural (apellido, nombre):");
//		todosLosPasajeros.forEach(pasajero -> System.out
//				.println(pasajero.primerApellido() + " " + pasajero.segundoApellido() + ", " + pasajero.nombre()));

		// Punto 9

		// Mostrar la colección del punto 7 ordenada en orden alfabético inverso por el
		// primer apellido, sin modificar el orden natural del record Pasajero.

		System.out.println("=======================");
		System.out.println("Ordenados por orden inverso");
		pasajerosPorGeneroYEdad.entrySet().forEach(entry -> {
			System.out.println("Del genero: " + entry.getKey());
			Map<Long, List<Pasajero>> pasajerosPorEdad = entry.getValue();
			pasajerosPorEdad.entrySet().forEach(entry2 -> {
				System.out.println("Edad:" + entry2.getKey());
				entry2.getValue().stream().sorted(Comparator.comparing(Pasajero::primerApellido).reversed())
						.forEach(System.out::println);
			});
		});

		// 1. Aplanamos el mapa anidado en una única lista de pasajeros.
//		List<Pasajero> todosLosPasajeros2 = pasajerosPorGeneroYEdad.values().stream()
//				.flatMap(mapaEdad -> mapaEdad.values().stream()).flatMap(List::stream).collect(Collectors.toList());
//
//		// 2. Ordenamos la lista aplanada usando un Comparator externo.
//		// Este Comparator ordena por el primer apellido y luego invierte el resultado.
//		todosLosPasajeros2.sort(Comparator.comparing(Pasajero::primerApellido).reversed());
//
//		// 3. Imprimimos los nombres y apellidos de los pasajeros ya ordenados.
//		System.out.println("========================");
//		System.out.println("Pasajeros ordenados por primer apellido (orden inverso):");
//		todosLosPasajeros2.forEach(pasajero -> System.out
//				.println(pasajero.primerApellido() + " " + pasajero.segundoApellido() + ", " + pasajero.nombre()));

		// Punto 10

		// Obtener una colección que almacene el nombre y el apellido de los
		// pasajeros, agrupado por las horas de duración de su viaje.

		// Generamos el mapa agrupando pasajeros por la duración del vuelo.
		System.out.println("==========================");
		System.out.println("Listado de Nombres y Apellidos por duracion del viaje");
		Map<Long, List<String>> nombreYApellidoPorDuracionDelViaje;

		nombreYApellidoPorDuracionDelViaje = listadeVuelos.stream()
				.collect(Collectors.groupingBy(Vuelo::getDuration,
						Collectors.flatMapping(vuelo -> vuelo.getPasajeros().stream(),
								Collectors.mapping(pasajero -> pasajero.nombre() + " " + pasajero.primerApellido(),
										Collectors.toList()))));

		System.out.println(nombreYApellidoPorDuracionDelViaje);

//		Map<Long, List<Pasajero>> pasajerosAgrupadosPorDuracion = listadeVuelos.stream()
//				// 1. Aplanamos la lista de vuelos en un flujo de pares clave-valor
//				.flatMap(vuelo -> vuelo.getPasajeros().stream()
//						.map(pasajero -> Map.entry(vuelo.getDuration(), pasajero)))
//				// 2. Recolectamos el flujo en un mapa usando el colector groupingBy.
//				.collect(Collectors.groupingBy(Map.Entry::getKey,
//						Collectors.mapping(Map.Entry::getValue, Collectors.toList())));
//
//		// Imprimimos el resultado para verificar.
//		System.out.println("Mapa de pasajeros agrupados por duración del viaje (en horas):");
//		pasajerosAgrupadosPorDuracion.forEach((horas, pasajeros) -> {
//			System.out.println("==============================");
//			System.out.println("Duración del viaje: " + horas + " horas.");
//			pasajeros.forEach(
//					pasajero -> System.out.println("  - " + pasajero.nombre() + " " + pasajero.primerApellido()));
//		});

		// Punto 11

		// Mostrar el listado de pasajeros ordenado de mayor a menor por la duración
		// del viaje.

		Map<Long, List<String>> nombreYApellidoPorDuracionDelViajeOrdenado;
		nombreYApellidoPorDuracionDelViajeOrdenado = new TreeMap<>(Comparator.reverseOrder());

		nombreYApellidoPorDuracionDelViajeOrdenado.putAll(nombreYApellidoPorDuracionDelViaje);

		System.out.println("=====================");
		System.out.println("Lista ordenada de mayor a menor por la duracion del viaje");
		System.out.println(nombreYApellidoPorDuracionDelViajeOrdenado);

//		List<Map.Entry<Long, Pasajero>> pasajerosPorDuracion = listadeVuelos.stream()
//				// 1. Aplanamos la lista de vuelos en un flujo de pasajeros
//				// y creamos una entrada de mapa (duracion -> pasajero) para cada uno
//				.flatMap(vuelo -> vuelo.getPasajeros().stream()
//						.map(pasajero -> Map.entry(vuelo.getDuration(), pasajero)))
//				// 2. Ordenamos el flujo de entradas de mapa por la clave (la duración)
//				// en orden inverso (mayor a menor)
//				.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
//				// 3. Recolectamos el resultado en una nueva lista
//				.collect(Collectors.toList());
//
//		// Imprimimos la lista ordenada
//		System.out.println("========================");
//		System.out.println("Pasajeros ordenados de mayor a menor duración de viaje:");
//		pasajerosPorDuracion.forEach(entry -> {
//			System.out.println("Duración: " + entry.getKey() + " horas - Pasajero: " + entry.getValue().primerApellido()
//					+ " " + entry.getValue().nombre());
//		});

		// Punto 12
		// Recuperar el vuelo que tiene la máxima duración y mostrar sus pasajeros
		// agrupados por género y edad del pasajero
		System.out.println("vuelo de maxima duracion");
		Optional<Vuelo> vueloMaxDuracionOpt = listadeVuelos.stream()
				.max((v1, v2) -> Long.valueOf(v1.getDuration()).compareTo(Long.valueOf(v2.getDuration())));

		if (vueloMaxDuracionOpt.isPresent()) {
			final Vuelo vueloMaxDuracion = vueloMaxDuracionOpt.get();
			System.out.println(vueloMaxDuracion);

			Map<Genero, Map<Long, List<Pasajero>>> pasajeroPorGeneroYEdadPt12 = listadeVuelos.stream()
					.filter(vuelo -> vuelo.equals(vueloMaxDuracion)).flatMap(v -> v.getPasajeros().stream())
					.collect(Collectors.groupingBy(Pasajero::genero, Collectors.groupingBy(
							p -> ChronoUnit.YEARS.between(p.fechaNacimiento(), LocalDate.now()), Collectors.toList())));
			System.out.println("============");
			System.out.println("Respuesta al pt 12");
			System.out.println(pasajeroPorGeneroYEdadPt12);
		}

//		Optional<Vuelo> vueloMasLargo = listadeVuelos.stream().max(Comparator.comparing(Vuelo::getDuration));
//
//		// Paso 2: Si el vuelo existe, obtenemos sus pasajeros y los agrupamos
//		vueloMasLargo.ifPresent(vuelo -> {
//			Map<Genero, Map<Long, List<Pasajero>>> pasajerosAgrupados = vuelo.getPasajeros().stream()
//					.collect(Collectors.groupingBy(Pasajero::genero,
//							Collectors.groupingBy(
//									pasajero -> ChronoUnit.YEARS.between(pasajero.fechaNacimiento(), LocalDate.now()),
//									Collectors.toList())));
//
//			// Mostramos el resultado
//			System.out.println("========================================");
//			System.out.println("Pasajeros del vuelo con duración máxima (" + vuelo.getDuration() + " horas):");
//			pasajerosAgrupados.entrySet().forEach(entry -> {
//				System.out.println("  - Género: " + entry.getKey());
//				entry.getValue().entrySet().forEach(entry2 -> {
//					System.out.println("    > Edad: " + entry2.getKey());
//					System.out.println("      Pasajeros: " + entry2.getValue().stream()
//							.map(p -> p.nombre() + " " + p.primerApellido()).collect(Collectors.joining(", ")));
//				});
//			});
//		});

		// Punto 13
		// Enviar un mensaje a los pasajeros cuyo vuelo saldrá en las próximas
		// 3 horas.

		// Capturamos el momento actual para la comparación
		LocalDateTime ahora = LocalDateTime.now();

		System.out.println("========================================");
		System.out.println("Enviando mensajes a los pasajeros con vuelos en las próximas 3 horas...");
		System.out.println("Hora actual: " + ahora);

		listadeVuelos.stream()
				// Corregimos la comparación uniendo la fecha y la hora del vuelo
				.filter(vuelo -> LocalDateTime.of(vuelo.getFechaSalida(), vuelo.getHoraSalida()).isAfter(ahora)
						&& LocalDateTime.of(vuelo.getFechaSalida(), vuelo.getHoraSalida()).isBefore(ahora.plusHours(3)))
				.peek(vuelo -> System.out.println("Vuelo destino a: " + vuelo.getDestino())) // Depurar codigo y poner
																								// resultados entre
																								// medias

				// Aplanamos la lista de pasajeros
				.flatMap(vuelo -> vuelo.getPasajeros().stream())

				// Y finalmente 'enviamos' el mensaje
				.forEach(pasajero -> System.out.println("Mensaje enviado a " + pasajero.nombre() + " "
						+ pasajero.primerApellido() + ": Su vuelo está programado para salir pronto. ¡Prepárese!"));

		// Punto 14
		// // Enviar un mensaje a los pasajeros cuyo vuelo saldrá en los próximos
		// 3 dias.

		System.out.println("========================================");
		System.out.println("Enviando mensajes a los pasajeros con vuelos en los próximos 3 dias...");
		System.out.println("Hora actual: " + ahora);

//listadeVuelos.stream()
//		// Corregimos la comparación uniendo la fecha y la hora del vuelo
//		.filter(vuelo -> LocalDateTime.of(vuelo.getFechaSalida(), vuelo.getHoraSalida()).isAfter(ahora)
//				&& LocalDateTime.of(vuelo.getFechaSalida(), vuelo.getHoraSalida()).isBefore(ahora.plusDays(3)))
//		.peek(vuelo -> System.out.println("Vuelo destino a: " + vuelo.getDestino()))
//		
//		// Aplanamos la lista de pasajeros    
//		.flatMap(vuelo -> vuelo.getPasajeros().stream())
//
//		// Y finalmente 'enviamos' el mensaje
//		.forEach(pasajero -> System.out.println("Mensaje enviado a " + pasajero.nombre() + " "
//				+ pasajero.primerApellido() + ": Su vuelo está programado para salir pronto. ¡Prepárese!"));

// Solucion de Tahiel
		listadeVuelos.stream().filter(
				v -> (v.getFechaSalida().isEqual(LocalDate.now()) || v.getFechaSalida().isAfter(LocalDate.now()))
						&& v.getFechaSalida().isBefore(LocalDate.now().plusDays(3)))
				.peek(vuelo -> System.out.println("Vuelo destino a: " + vuelo.getDestino()))
				.flatMap(vuelo -> vuelo.getPasajeros().stream())

				.forEach(pasajero -> System.out
						.println("Mensaje enviado a " + pasajero.nombre() + " " + pasajero.primerApellido()
								+ ": Su vuelo está programado para salir en los próximos dias. ¡Prepárese!"));

		// Punto 15
		// Crear una colección que almacene el listado de pasajeros agrupado por el día
		// en que tiene lugar su vuelo,
		// considerando que el vuelo tiene lugar en el mes en curso. Al mostrar la
		// colección resultante, mostrar
		// el nombre del día de la semana en español.

		System.out.println("==========================");
		System.out.println("Coleccion de pasajeros agrupado por dia de vuelo en el mes en curso");

		Locale espaniol = Locale.of("es", "ES");
		LocalDate hoy = LocalDate.now();
		Month mesActual = hoy.getMonth();
		int anioActual = hoy.getYear();

//		Map<DayOfWeek, List<Pasajero>> pasajerosPorDia;
//
//		pasajerosPorDia = listadeVuelos.stream()
//				.filter(vuelo -> vuelo.getFechaSalida().getMonth() == mesActual
//						&& vuelo.getFechaSalida().getYear() == anioActual)
//
//				// Aplanamos la lista de pasajeros
//				.flatMap(v -> v.getPasajeros().stream().map(p -> Map.entry(v.getFechaSalida().getDayOfWeek(), p)))
//
//				// Agrupamos por dia de la semana
//				.collect(Collectors.groupingBy(Map.Entry::getKey,
//						Collectors.mapping(Map.Entry::getValue, Collectors.toList())));
//
//		pasajerosPorDia.forEach((dia, pasajeros) -> {
//			String diaEnEspaniol = dia.getDisplayName(TextStyle.FULL, espaniol);
//			System.out.println(diaEnEspaniol);
//			pasajeros.forEach(p -> System.out.println(p.nombre()));
//		});

//			Map<LocalDate, List<Pasajero>> pasajerosPorDia = listadeVuelos.stream()
//					.filter(v -> v.getFechaSalida().getMonth().equals(mesActual))
//					.collect(Collectors.groupingBy(Vuelo::getFechaSalida,
//							Collectors.flatMapping(v -> v.getPasajeros().stream(), 
//									Collectors.toList())));

		Map<DayOfWeek, List<Pasajero>> pasajerosPorDia = listadeVuelos.stream()
				.filter(v -> v.getFechaSalida().getMonth().equals(mesActual))
				.collect(Collectors.groupingBy(v -> v.getFechaSalida().getDayOfWeek(),
						Collectors.flatMapping(v -> v.getPasajeros().stream(), 
								Collectors.toList())));
		
			pasajerosPorDia.entrySet().forEach(entry -> {
			System.out.println("Viaje del dia: " + entry.getKey().getDisplayName(TextStyle.FULL, espaniol)
					+ " ");
			entry.getValue().stream().forEach(System.out::println);
			});

		// Punto 16
		// Crear una colección de los vuelos que no están previstos para el mes en curso
		// y mostrar el nombre del mes para el cual está prevista su fecha de salida, en
		// español.

		System.out.println("==========================");
		System.out.println("Coleccion de vuelos agrupados por mes de salida");

		Map<Month, List<Vuelo>> vuelosPorMes = listadeVuelos.stream()
				.filter(v -> !v.getFechaSalida().getMonth().equals(mesActual))
				.collect(Collectors.groupingBy(v -> v.getFechaSalida().getMonth()));

		vuelosPorMes.forEach((mes, vuelos) -> {
			// Convierte el objeto Month a su nombre en español al imprimir
			System.out.println("Mes: " + mes.getDisplayName(TextStyle.FULL, espaniol));
			vuelos.forEach(vuelo -> System.out.println("Vuelos con destino a: " + vuelo.getDestino()));
		});

		// Por que no????
//				vuelosPorMes.entrySet().forEach(entry -> {
//				System.out.println("Viaje del mes: " + entry.getKey().getDisplayName(TextStyle.FULL, espaniol)
//						+ " ");
//				entry.getValue().stream().forEach(System.out::println);
//				});
//			
//				System.out.println("El programa ha finalizado");
	}
}
