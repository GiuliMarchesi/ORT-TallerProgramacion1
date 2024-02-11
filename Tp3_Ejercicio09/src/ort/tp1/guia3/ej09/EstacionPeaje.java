package ort.tp1.guia3.ej09;

import java.util.ArrayList;
import java.util.List;

public class EstacionPeaje {
	
	private List<Cabina> Cabinas = new ArrayList<>();
	private String ID; 
	private String descripcion;

	
	public static int dameHoraActual() {
		return 6;
	}
	
	
	public int cabinasConEfectivo() {
		int cont = 0;
		for (Cabina cabina : Cabinas) {
			if(cabina.isEfectivo()) {
				cont++;
			}
		}
		return cont;
	}
}
