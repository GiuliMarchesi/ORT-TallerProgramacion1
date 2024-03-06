package ort.tp1.guia4.ej01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Restaurante {
	private final int CANT_CAJEROS = 5; 
	private final int CANT_DESPACHADORES = 8; 
	
	private Cajero[] cajeros;
	private Robot[] robots;
	private ArrayList<Pedido> pedidos;
	
	
	public Restaurante(ArrayList<Pedido> pedidos, Robot[] robots, Cajero[] cajeros) {
		this.pedidos = new ArrayList<>(pedidos);
		this.robots = Arrays.copyOf(robots, robots.length);
		this.cajeros = Arrays.copyOf(cajeros, cajeros.length);
	} 
	
	
	public double[] montoPorCajero() {
		double[]montoPorCajero = new double[CANT_CAJEROS];
		for (Pedido p : pedidos) {
			montoPorCajero[p.getIdCajero()] += p.getMonto();
		}	
		return montoPorCajero;
	}
	
	public InfoPedidos[] informeDePedidos() {
		InfoPedidos[] informes = new InfoPedidos[pedidos.size()];
		for (int i = 0; i < pedidos.size(); i++) {
			try {
				informes[i] = pedidoToInforme(pedidos.get(i));
			}catch(RuntimeException e) {		
			}	 
		}
		return informes;
	}
	
	private InfoPedidos pedidoToInforme(Pedido pedido) {
		double monto = pedido.getMonto();
		String apellido = cajeros[pedido.getIdCajero()].getApellido();
		int iRobot = buscarRobot(pedido.getCodigoRobot());
		int bateria = this.robots[iRobot].getNivelBateria();

		return new InfoPedidos(monto, apellido, bateria);
	}


	private int buscarRobot(String codigo) {
		int i = this.robots.length - 1;
		while (i >= 0 && !this.robots[i].tieneCodigo(codigo)) {
			i--;
		}
		if (i < 0) {
			throw new RuntimeException ("No se encuentra robot con codigo: " + codigo);
		}
		return i;
	}

	public void mostrarPedidosConMasRiesgo () {
		for (Pedido p : pedidos) {
			try {
				int iRobot = buscarRobot(p.getCodigoRobot());
				if (this.robots[iRobot].isBateriaBaja()) {
					System.out.println("El robot del siguiente pedido corre"
							+ " riesgo de no ser entregado por bajo nivel de bateria " + p.toString());
				}
			}catch(RuntimeException e) {		
			}
			
		}
	}
}
	


