package ejercicio_2;

public class Main {

	public static void main(String[] args) {
		Multimedia_Audio aA1 = new Multimedia_Audio("holaMundo", 150, "escritorio", 120, FormatoAudio.MP3, "yo", "ACDC");
		
		aA1.abrirArchivo();
		aA1.abrirArchivo();
		
		aA1.reproducirParar();
		aA1.reproducirParar();

	}

}
