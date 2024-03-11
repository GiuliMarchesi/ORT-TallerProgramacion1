package ort.tp1.guia4.ej03;

import java.util.Arrays;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

	public static void main(String[] args) {
			
			Jugador[] jugadores = new Jugador[23];
			
	        // Jugadores titulares
	        jugadores[0] = new Jugador(1, "Titular1", Posicion.ARQUERO);
	        jugadores[1] = new Jugador(2, "Titular2", Posicion.DEFENSOR);
	        jugadores[2] = new Jugador(3, "Titular3", Posicion.DEFENSOR);
	        jugadores[3] = new Jugador(4, "Titular4", Posicion.DEFENSOR);
	        jugadores[4] = new Jugador(5, "Titular5", Posicion.DEFENSOR);
	        jugadores[5] = new Jugador(6, "Titular6", Posicion.MEDIOCAMPISTA);
	        jugadores[6] = new Jugador(7, "Titular7", Posicion.MEDIOCAMPISTA);
	        jugadores[7] = new Jugador(8, "Titular8", Posicion.MEDIOCAMPISTA);
	        jugadores[8] = new Jugador(9, "Titular9", Posicion.DELANTERO);
	        jugadores[9] = new Jugador(10, "Titular10", Posicion.DELANTERO);
	        jugadores[10] = new Jugador(11, "Titular11", Posicion.DELANTERO);

	        // Jugadores suplentes
	        jugadores[11] = new Jugador(12, "Suplente1", Posicion.ARQUERO);
	        jugadores[12] = new Jugador(13, "Suplente2", Posicion.DEFENSOR);
	        jugadores[13] = new Jugador(14, "Suplente3", Posicion.DEFENSOR);
	        jugadores[14] = new Jugador(15, "Suplente4", Posicion.DEFENSOR);
	        jugadores[15] = new Jugador(16, "Suplente5", Posicion.DEFENSOR);
	        jugadores[16] = new Jugador(17, "Suplente6", Posicion.MEDIOCAMPISTA);
	        jugadores[17] = new Jugador(18, "Suplente7", Posicion.MEDIOCAMPISTA);

	        // Jugadores reservas
	        jugadores[18] = new Jugador(19, "Reserva1", Posicion.DEFENSOR);
	        jugadores[19] = new Jugador(20, "Reserva2", Posicion.DEFENSOR);
	        jugadores[20] = new Jugador(21, "Reserva3", Posicion.DEFENSOR);
	        jugadores[21] = new Jugador(22, "Reserva4", Posicion.DEFENSOR);
	        jugadores[22] = new Jugador(23, "Reserva5", Posicion.DEFENSOR);
	        
	        Selection seleccion = new Selection(jugadores);
	        
	        System.out.println(Arrays.toString(seleccion.cantJugadoresPorPosicion()));
	        System.out.println(Arrays.toString(seleccion.obtenerReservas()));
	        
	        seleccion.cambio(2, 300);
	}

}