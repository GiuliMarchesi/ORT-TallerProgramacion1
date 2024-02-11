package ort.tp1.guia3.ej09;

public class Pase extends MedioDePago {
	
	private final double PORCENTAJE_DESC1 = 15;
	private final double PORCENTAJE_DESC2= 12;
	private int diasDemoraCobro;
	
	
	public Pase(int diasDemoraCobro) {
		super();
		this.diasDemoraCobro = diasDemoraCobro;
	}


	@Override
	public double descuento(double importe) {
		double importeFinal = 0;
		if(this.diasDemoraCobro > 5) {
			importeFinal = importe * (PORCENTAJE_DESC2/100);
		}else {
			importeFinal = importe * (PORCENTAJE_DESC1/100);
		}
		return importeFinal;
	}

}
