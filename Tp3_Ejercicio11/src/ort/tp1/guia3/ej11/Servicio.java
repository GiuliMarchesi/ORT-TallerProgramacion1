package ort.tp1.guia3.ej11;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class Servicio implements Facturable {

	private int cantHoras;

	public double montoFacturado() {
		return Matematica.sumarPorcentaje(getPrecio(), IVA / 2);
	}

	public double getPrecio() {
		return cantHoras * getValorHora();
	}

	public abstract double getValorHora();

}