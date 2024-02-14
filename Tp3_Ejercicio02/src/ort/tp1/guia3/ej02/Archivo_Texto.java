package ort.tp1.guia3.ej02;

public class Archivo_Texto extends Archivo {
	
	private String codificacion;
	private boolean estaCifrado;
	
	public Archivo_Texto(String nombre, double peso, String localizacion, String codifiacion) {
		super(nombre, peso, localizacion);
		this.codificacion = codificacion;
	}
	
	
	public void encriptar() {
		String resultado;
		if(this.estaCifrado){
			resultado = "El archivo ya esta cifrado";
		}else {
			this.estaCifrado = true;
			resultado = "El archivo fue cifrado";
		}
		System.out.println(resultado);
	}
		
	

}
