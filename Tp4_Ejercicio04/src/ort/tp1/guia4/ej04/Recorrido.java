package ort.tp1.guia4.ej04;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Recorrido {

	public static final int DESCUENTO_CABECERAS = 20;
	public static final int PRECIO_ESTACION = 50;
	private Estacion partida;
	private Estacion destino;

	private boolean cabeDescuento() {
		return Estacion.sonCabeceras(this.partida, this.destino);
	}

	private double descuentoPorCabeceras(double monto) {
		return monto * (100 - DESCUENTO_CABECERAS) / 100;
	}

	public int estacionesRecorridas() {
		int estaciones = this.destino.ordinal() - partida.ordinal();
		return estaciones;
	}

	public boolean tieneEstacion(Estacion estacion) {
		return estacion.ordinal() >= this.partida.ordinal() && estacion.ordinal()<= this.destino.ordinal() ;
	}

	public double montoTotal() {
		double montoTotal = estacionesRecorridas() * PRECIO_ESTACION;
		if(cabeDescuento()) {
			montoTotal = descuentoPorCabeceras(montoTotal);
		}
				
		return montoTotal;
	}

}