package parcial;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Carga implements Manifestable {

	private double volumen;
	private String description;

	public boolean volumenDeCargaSuperiorA(double volCarga) {
		return this.volumen > volCarga;
	}

	public void imprimirManifiesto() {
		System.out.println(this.description + " " + this.volumen);
		
	}

}