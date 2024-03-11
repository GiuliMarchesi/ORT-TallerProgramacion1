package ort.tp1.guia4.ej04;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public enum Estacion {

	BUENOS_AIRES,
	ALBERTI,
	CHIVILCOY,
	SUIPACHA,
	MERCEDES,
	LUJAN,
	BRAGADO;

	static boolean sonCabeceras(Estacion partida, Estacion destino) {
		return partida.ordinal() == 0 && destino.ordinal() == values().length - 1;
	}

}