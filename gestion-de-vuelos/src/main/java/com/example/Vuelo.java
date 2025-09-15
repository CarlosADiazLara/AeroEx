package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Vuelo {
	
	private Destino destino;
	private double precio;
	private LocalDate fechaSalida;
	private LocalTime horaSalida;
	private LocalDate fechaLlegada;
	private LocalTime horaLlegada;
	private int numeroPlazas;
	private List<Pasajero> pasajeros;

	
	
	public long getDuration() {
		return ChronoUnit.HOURS.between(LocalDateTime.of(fechaSalida, horaSalida), LocalDateTime.of(fechaLlegada, horaLlegada));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
