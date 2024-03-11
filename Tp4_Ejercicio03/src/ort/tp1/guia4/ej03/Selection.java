package ort.tp1.guia4.ej03;

import java.util.Arrays;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Selection {
	
	public static final int SUPLENTES = 7;
	public static final int TITULARES = 11;
	public static final int PLANTEL = 23;
	private Jugador[] jugadores;

	
	public Selection(Jugador []jugadores) {
		this.jugadores = Arrays.copyOf(jugadores, jugadores.length);
	}
	
	
	public int[] cantJugadoresPorPosicion() {
		int [] porPosicion = new int [Posicion.values().length];
		for (int i = 0; i < porPosicion.length; i++) {
			for (Jugador j : jugadores) {
				if(i == j.getPosicion().ordinal()) {
					porPosicion[i] += 1;
				}
			}
		}

		return porPosicion;
	}
	

	public Jugador[] obtenerReservas() {
		Jugador[] reservas = new Jugador[PLANTEL - TITULARES - SUPLENTES];
		int idx = 0; 
		for (int j = this.jugadores.length - 1; j >= (PLANTEL - reservas.length); j--) {
			reservas[idx] = jugadores[j];
			idx ++;
		}
		
		return reservas;
	}

	public void cambioPorLesion(int nro, String apellido) {
		try {
			int pos = buscarPorCamiseta(nro);
			int numero = jugadores[pos].getNumero();
			Posicion posicion = jugadores[pos].getPosicion();
			Jugador reemplazante = new Jugador(numero, apellido, posicion);
			jugadores[pos] = reemplazante;
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
	}

	public void cambio(int nro1, int nro2) {
		if (nro1 != nro2) {
			try {
				int pos1 = buscarPorCamiseta(nro1);
				int pos2 = buscarPorCamiseta(nro2);
				Jugador aux = jugadores[pos1];
				jugadores[pos1] = jugadores[pos2];
				jugadores[pos2] = aux;
			}catch(RuntimeException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

	private int buscarPorCamiseta(int nro1) {
		int i = this.jugadores.length - 1; 
		while (i >= 0 && !this.jugadores[i].esJugador(nro1)) {
			i--;
		}
		if (i < 0) {
			throw new RuntimeException ("No se encontro al jugador con la camiseta nro: " + nro1);
		}
		return i;
	}

}