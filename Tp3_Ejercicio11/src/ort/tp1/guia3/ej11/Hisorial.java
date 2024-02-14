package ort.tp1.guia3.ej11;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Hisorial {

	private ArrayList<Facturable> facturables;

	public int cantServiciosSimples() {
		int cont = 0;
		for (Facturable facturable : facturables) {
			if(facturable instanceof ServicioReparacion) {
				//((ServicioReparacion) facturable).isSimple();
				ServicioReparacion sdr = (ServicioReparacion) facturable;
				if (sdr.isSimple()) {
					cont++;	
				}
			}
		}
		return cont;
	}

	public double montoTotalFacturado() {
		double totalFacturado = 0;
		for (Facturable factura : facturables) {
			totalFacturado += factura.montoFacturado();
		}
		return totalFacturado;
	}

}