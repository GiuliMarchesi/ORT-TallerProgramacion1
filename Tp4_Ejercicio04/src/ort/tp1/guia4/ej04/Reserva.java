package ort.tp1.guia4.ej04;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Reserva {

	private int cantPersonas;
	private String codigo;
	private Recorrido recorrido;

	public double precioReserva() {
		return this.recorrido.montoTotal();
	}

	public boolean tieneEstacion(Estacion estacion) {
		return this.recorrido.tieneEstacion(estacion);
	}

}