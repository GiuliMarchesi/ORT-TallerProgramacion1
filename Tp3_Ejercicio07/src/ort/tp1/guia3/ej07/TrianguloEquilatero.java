package ort.tp1.guia3.ej07;

public class TrianguloEquilatero extends Figura {

	private double lado = 14;

	public double calcularPerimetro() {
		return lado * 3;
	}

	public double calcularArea() {
		return (lado * lado * Math.sqrt(3)) / 4;
	}

}