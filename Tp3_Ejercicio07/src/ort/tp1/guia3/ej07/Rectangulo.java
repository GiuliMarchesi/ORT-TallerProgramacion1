package ort.tp1.guia3.ej07;

public class Rectangulo extends Figura {

	private double altura = 9;
	private double base = 12;

	public double calcularPerimetro() {
		return altura * 2 + base * 2;
	}

	public double calcularArea() {
		return base * altura;
	}

}