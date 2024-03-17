package parcial;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Estacion {

	private ArrayList<PuntoAtraque> puntosAtraque;

	private PuntoAtraque buscarAtraqueLibre() {
		PuntoAtraque atraqueLibre = null;
		int i = 0;
		while(i < puntosAtraque.size() && !puntosAtraque.get(i).estaDisponible()) {
			i++;
		}
		if(i < puntosAtraque.size()) {
			atraqueLibre = puntosAtraque.get(i);
		}
		return atraqueLibre;
	}

	public boolean estacionarNave(Nave nave) {
		boolean naveEstacionada = false;
		if(nave.puedeEstacionar()) {
			PuntoAtraque atraqueLibre = buscarAtraqueLibre();
			if(atraqueLibre!=null) {
				naveEstacionada = atraqueLibre.estacionar(nave);
			}
		}
		return naveEstacionada;
	}
	

	public void imprimirManifiestos() {
		for (PuntoAtraque puntoAtraque : puntosAtraque) {
				puntoAtraque.imprimirManifiesto();			
		}
	}

}