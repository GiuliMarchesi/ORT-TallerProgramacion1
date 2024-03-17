package parcial;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class Nave implements Manifestable {

	private int cantTriuplantes;
	private String ultimoPlaneta;
	private String planetaOrigen;

	public abstract boolean puedeEstacionar();

	public abstract void completarManifiesto();

	public void imprimirManifiesto() {
		System.out.println("Cantidad de Tripulantes: " + this.cantTriuplantes + "\n Planeta de Origen: " 
	+ this.planetaOrigen + "\n Ultimo Planeta Visitado: " + this.ultimoPlaneta);
		completarManifiesto();
	}
	
	public int getCantTriuplantes() {
		return this.cantTriuplantes;
	}

}