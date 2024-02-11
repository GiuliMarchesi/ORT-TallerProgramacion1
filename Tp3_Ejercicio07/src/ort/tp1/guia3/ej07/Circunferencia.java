package ort.tp1.guia3.ej07;

public class Circunferencia extends Figura {

	private double radio = 15;

	public double calcularPerimetro() {
		return 2 * Math.PI * radio;
	}

	public double calcularArea() {
		return Math.PI * radio * radio;
	}

}