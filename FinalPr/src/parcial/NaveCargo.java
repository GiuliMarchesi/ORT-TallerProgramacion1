package parcial;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class NaveCargo extends NaveComercial {

	public static final double VOL_MAX = 100;
	private Carga carga;

	private boolean volumenDeCargaSuperiorA(double double1) {
		return this.carga.volumenDeCargaSuperiorA(double1);
	}

	public void completarManifiesto() {
		this.carga.imprimirManifiesto();
	}

	public boolean puedeEstacionar() {
		return !volumenDeCargaSuperiorA(VOL_MAX);
	}
}