package ort.tp1.guia3.ej02;

public class Archivo_Multimedia extends Archivo{
	
	private double duracion;
	private boolean estaEnReproduccion;
	
	public Archivo_Multimedia(String nombre, double peso, String localizacion, double duracion) {
		super(nombre, peso, localizacion);
		this.duracion = duracion;
	}
	
	public void reproducirParar() {
		String resultado;
		if (this.estaEnReproduccion) {
			this.estaEnReproduccion = false;
			resultado = "Se paro la reproduccion";
		}else {
			this.estaEnReproduccion = true;
			resultado = "En reproducción";
		}
		System.out.println(resultado);
	}

}
