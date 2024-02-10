package ort.tp1.guia3.ej06;

public class Bicicleta {
	
	private static final int MAX_KMS = 2000;
	private String marca;
	private String modelo;
	private int cantkms;

	
	public Bicicleta(String marca, String modelo, int cantkms) {
		this.marca = marca;
		this.modelo = modelo;
		this.cantkms = cantkms;
	}

	public boolean cumpleRequisitos() {
		return cantkms <= MAX_KMS;
	}

}
