package parcial;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class NaveCrusier extends NaveComercial {

	private int cantPasajeros;

	private double porcPasajeros() {
		return this.cantPasajeros * 100 / (this.cantPasajeros + getCantTriuplantes());
	}

	public void completarManifiesto() {
		System.out.println("Porcentaja de Pasajeros: " + porcPasajeros());
	}

	public boolean puedeEstacionar() {
		return this.cantPasajeros > 0;
	}

//	@Override
//	public void impirmirManifiesto() {
//		super.imprimirManifiesto();		
//	}

}