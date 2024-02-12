package prueba;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class PalomaMensajera extends Ave implements EnviadorDeMensaje {

	public void volar() {
		// Método a resolver...
	}

	public void enviarMensaje(String mensaje) {
		volar();
		System.out.println("Paloma entregando mensaje: " + mensaje + TERMINADOR);
	}

}