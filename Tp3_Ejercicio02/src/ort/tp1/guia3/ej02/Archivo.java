package ort.tp1.guia3.ej02;

public abstract class Archivo  {
	
	private String nombre;
	private double peso;
	private String localizacion;
	private boolean estaAbierto;
	
	public Archivo(String nombre, double peso, String localizacion) {
		this.nombre = nombre;
		this.peso = peso;
		this.localizacion = localizacion;
	}


	public void abrirArchivo() {
		String resultado;
		if(this.estaAbierto){
			this.estaAbierto = false;
			resultado = "El archivo fue cerrado";
		}else {
			this.estaAbierto = true;
			resultado = "El archivo fue abierto";
		}
		System.out.println(resultado);
	}
		
	
	public void moverArchivo(String nuevaUbicacion) {
		setLocalizacion(nuevaUbicacion);
	}


	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	

}
