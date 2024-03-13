package ort.tp1.guia3.ej09;

public enum CategoriaVehiculo {
	AUTO(100),
	MOTO(50),
	CAMION(200);

	private double tarifaBase;
	
	//constructor
	CategoriaVehiculo(double tarifaBase) {
		this.tarifaBase = tarifaBase;
	}
	
	public double getTarifaBase() {
        return tarifaBase;
    }
}
