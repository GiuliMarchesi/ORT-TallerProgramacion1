package ort.tp1.guia3.ej02;

public class Multimedia_Video extends Archivo_Multimedia {
	
	private FormatoVideo formato;
	private Dimension dimension;

	public Multimedia_Video(String nombre, double peso, String localizacion, double duracion, FormatoVideo formato, Dimension dimension) {
		super(nombre, peso, localizacion, duracion);
		this.formato = formato;
		this.dimension = dimension;
	}
}
