package parcial;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class PuntoAtraque implements Manifestable {

	private Nave nave;


	public boolean estacionar(Nave nave) {
		boolean sePudo = false;
		if(estaDisponible()) {
			this.nave = nave;
			sePudo = true;
		}
		return sePudo;
	}

	public boolean estaDisponible() {
		return this.nave == null;
	}

	@Override
	public void imprimirManifiesto() {
		if(!estaDisponible()) {
			this.nave.imprimirManifiesto();
		}
		
	}

}