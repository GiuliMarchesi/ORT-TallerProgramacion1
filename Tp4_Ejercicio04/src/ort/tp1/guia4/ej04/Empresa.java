package ort.tp1.guia4.ej04;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Reserva> reservas;
	
	

	public Empresa(ArrayList<Reserva> reservas) {
		this.reservas = new ArrayList<>(reservas);
	}

	public int cantVecerRecorrida(Estacion estacion) {
		int cantPersonas = 0;
		for (Reserva reserva : reservas) {
			if(reserva.tieneEstacion(estacion)) {
				cantPersonas++;
			}
		}
		return cantPersonas;
	}

	public double recaudacionTotal() {
		double montoTotal = 0;
		for (Reserva reserva : reservas) {
			montoTotal+= reserva.precioReserva();
		}
		return montoTotal;
	}

}