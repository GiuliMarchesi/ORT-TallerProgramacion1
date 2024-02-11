package ort.tp1.guia3.ej09;

public class Vehiculo {
	String patente;
	CategoriaVehiculo categoria;
	
	public double obtenerImporteBase() {
		return this.categoria.getTarifaBase();
	}


}
