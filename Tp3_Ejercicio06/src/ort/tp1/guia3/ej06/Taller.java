package ort.tp1.guia3.ej06;

import java.util.ArrayList;
import java.util.List;

public class Taller {
	public int cantServiciosPosibles(List<Bicicleta> bicis) {
		int cont = 0;
		for (Bicicleta bicicleta : bicis) {
			if (bicicleta.cumpleRequisitos()) {
				cont++;
			}
		}	
		return cont;
	}
}
