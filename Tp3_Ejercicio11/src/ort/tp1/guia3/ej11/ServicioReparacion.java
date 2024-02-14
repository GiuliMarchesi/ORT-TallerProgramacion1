package ort.tp1.guia3.ej11;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ServicioReparacion extends Servicio {

	private int dificultad;
	public static final double INCR_DIF = 25;
	public static final int MIN_DIF = 3;
	public static final double VALOR_HORA = 180;

		@Override
	public double getPrecio() {
		double precio = super.getPrecio();
		if (!isSimple()) {
			Matematica.sumarPorcentaje(precio, INCR_DIF);
		}
		return precio;
	}

	public double getValorHora() {
		return VALOR_HORA;
	}
	
	public boolean isSimple() {
		return this.dificultad < MIN_DIF;
	}

}