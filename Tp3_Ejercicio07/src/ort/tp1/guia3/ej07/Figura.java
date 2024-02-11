package ort.tp1.guia3.ej07;


public abstract class Figura {

	private String color;

	public abstract double calcularPerimetro();

	public abstract double calcularArea();
	
	public void mostrarInfo() {
		System.out.println("Datos de " + this.getClass().getSimpleName());
		System.out.println("Color: " + this.color);
		System.out.println("Perimetro " + calcularPerimetro());
		System.out.println("Area " + calcularArea());
	};

}