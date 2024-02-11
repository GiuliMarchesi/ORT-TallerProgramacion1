package ort.tp1.guia3.ej09;

public class Cabina {
	
	private int numeroCabina;
	
	private MedioDePago medioDePago;
	
	private int horaActual = EstacionPeaje.dameHoraActual();
	
	private boolean horaPicoManana = horaActual > 6 && horaActual < 10;
	
	private boolean horaPicoTarde = horaActual > 17 && horaActual < 20;
	
	private double extraPorHoraPico = 0.8;
	
	
	public Cabina(int numeroCabina, MedioDePago medioDePago) {
		this.numeroCabina = numeroCabina;
		this.medioDePago = medioDePago;
	}
	
	public double cobrar(Vehiculo vehiculo) {
		double importe = vehiculo.obtenerImporteBase();
		double importeFinal = this.medioDePago.descuento(importe);
		if (isHoraPico()) {
			importeFinal = importeHoraPico(importeFinal);
		}
		return importeFinal;
	}
	
	public boolean isHoraPico() {
		return horaPicoManana || horaPicoTarde;
	}
	
	public boolean isEfectivo() {
		return this.medioDePago.getClass().getSimpleName().equals("Efectivo");
	}
	
	private double importeHoraPico(double importe) {
		double extraPorHoraPico = importe * this.extraPorHoraPico;
		return importe += extraPorHoraPico;
	}
	


}
