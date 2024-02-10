package ort.tp1.guia3.ej06;

public class BicicletaElectrica extends Bicicleta {
	
	private static final int MAX_POT = 250;
	private int potencia;
	  
	public BicicletaElectrica(String marca, String modelo, int cantkms, int potencia) {
		super(marca, modelo, cantkms);
		this.potencia = potencia;
	}

	public boolean cumpleRequisitos() {
		return potencia <= MAX_POT;
	}
	
}
