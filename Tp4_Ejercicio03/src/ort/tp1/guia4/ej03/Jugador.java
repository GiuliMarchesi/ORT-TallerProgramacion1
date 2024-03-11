package ort.tp1.guia4.ej03;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Jugador {

	private int numero;
	private String apellido;
	private Posicion posicion;
	
	
	
	public Jugador(int numero, String apellido, Posicion posicion) {
		super();
		this.numero = numero;
		this.apellido = apellido;
		this.posicion = posicion;
	}


	public boolean esJugador(int nro) {
		return this.numero == nro;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
		
	}


	public int getNumero() {
		return numero;
	}


	public Posicion getPosicion() {
		return posicion;
	}


	public String getApellido() {
		return apellido;
	}


	@Override
	public String toString() {
		return "Jugador [numero=" + numero + ", apellido=" + apellido + ", posicion=" + posicion + "]";
	}

	
	
	

}