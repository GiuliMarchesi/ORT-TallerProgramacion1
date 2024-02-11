package ort.tp1.guia3.ej07;

import java.util.ArrayList;

public class GrupoDeFiguras {

	private ArrayList<Figura> figuras = new ArrayList<>();

	public void agregarFiguras(Figura figura) {
		this.figuras.add(figura);
	}
	
	public void mostrarInfoDeFiguras() {
		for (Figura figura : figuras) {
			figura.mostrarInfo();
		}
	}

}