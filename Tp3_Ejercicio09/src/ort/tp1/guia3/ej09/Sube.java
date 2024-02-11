package ort.tp1.guia3.ej09;

public class Sube extends MedioDePago {
	
	private final double PORCENTAJE_DESC = 10;
	private int diasDemoraCobro;

	@Override
	public double descuento(double importe) {
		return importe * (PORCENTAJE_DESC/100);
	}

}
