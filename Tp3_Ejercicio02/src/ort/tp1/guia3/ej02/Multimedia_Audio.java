package ort.tp1.guia3.ej02;

public class Multimedia_Audio extends Archivo_Multimedia {
	
	private FormatoAudio formato;
	private String artista;
	private String album;
	
	
	public Multimedia_Audio(String nombre, double peso, String localizacion, double duracion, 
			FormatoAudio formato, String artista, String album) {
		super(nombre, peso, localizacion, duracion);
		this.formato = formato;
		this.artista = artista;
		this.album = album;
	}
}
