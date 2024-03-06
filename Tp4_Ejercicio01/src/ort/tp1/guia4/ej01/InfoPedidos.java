package ort.tp1.guia4.ej01;

public class InfoPedidos {
	
	private double montoPedido;
	private String apellidoCajero;
	private int nivelBateria;
	public InfoPedidos(double montoPedido, String apellidoCajero, int nivelBateria) {
		super();
		this.montoPedido = montoPedido;
		this.apellidoCajero = apellidoCajero;
		this.nivelBateria = nivelBateria;
	}
	@Override
	public String toString() {
		return "InfoPedidos [montoPedido=" + montoPedido + ", apellidoCajero=" + apellidoCajero + ", nivelBateria="
				+ nivelBateria + "]";
	}
	
	
	
	
}
