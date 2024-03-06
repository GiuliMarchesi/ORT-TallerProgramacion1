package ort.tp1.guia4.ej01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		
		Cajero[] cajeros = new Cajero[5];

        cajeros[0] = new Cajero("Lopez", 24);
        cajeros[1] = new Cajero("Garcia", 36);
        cajeros[2] = new Cajero("Martinez", 48);
        cajeros[3] = new Cajero("Rodriguez", 60);
        cajeros[4] = new Cajero("Fernandez", 72);
        
        Robot[] robots = new Robot[8];
        robots[0] = new Robot("R001", 95);
        robots[1] = new Robot("R002", 30);
        robots[2] = new Robot("R003", 65);
        robots[3] = new Robot("R004", 10);
        robots[4] = new Robot("R005", 50);
        robots[5] = new Robot("R006", 80);
        robots[6] = new Robot("R007", 15);
        robots[7] = new Robot("R008", 70);
        
        
        ArrayList<Pedido> listaPedidos = new ArrayList<>();

        // Agregar 8 instancias de Pedido a la lista
        listaPedidos.add(new Pedido("Pendiente", "Cliente1", 100.0, 0, "R001"));
        listaPedidos.add(new Pedido("En proceso", "Cliente2", 150.0, 2, "R002"));
        listaPedidos.add(new Pedido("Finalizado", "Cliente3", 200.0, 3, "R003"));
        listaPedidos.add(new Pedido("Pendiente", "Cliente4", 120.0, 4, "R004"));
        listaPedidos.add(new Pedido("En proceso", "Cliente5", 180.0, 3, "R010"));
        listaPedidos.add(new Pedido("Finalizado", "Cliente6", 220.0, 4, "R006"));
        listaPedidos.add(new Pedido("Pendiente", "Cliente7", 130.0, 2, "R007"));
        listaPedidos.add(new Pedido("En proceso", "Cliente8", 170.0, 1, "R008"));
        
        Restaurante res = new Restaurante(listaPedidos, robots, cajeros);        
        
        double montos [] = res.montoPorCajero();
        
        System.out.println(Arrays.toString(montos));
        
//      UtilVectores.mostrarVector(montos);
        
        try {
        	UtilVectores.mostrarVector(res.informeDePedidos());
        }catch(RuntimeException e) {
        	System.out.println(e.getMessage());
        }

        res.mostrarPedidosConMasRiesgo();
    }
	
	
}


