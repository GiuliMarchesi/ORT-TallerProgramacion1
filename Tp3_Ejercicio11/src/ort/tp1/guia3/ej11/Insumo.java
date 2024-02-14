package ort.tp1.guia3.ej11;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Insumo implements Facturable {
	
	private String nombre;
	private double precioLista;
	private double porcGanancia;
	private TipoInsumo tipo;

	public double montoFacturado() {
		double precio = Matematica.sumarPorcentaje(precioLista, porcGanancia);
		return Matematica.sumarPorcentaje(precio, Facturable.IVA);
	}
	

}