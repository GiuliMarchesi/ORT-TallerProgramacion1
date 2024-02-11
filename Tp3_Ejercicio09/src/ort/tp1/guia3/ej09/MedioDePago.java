package ort.tp1.guia3.ej09;

public abstract class MedioDePago {
	private String descripcion;
	
	public abstract double descuento(double importe);
}
