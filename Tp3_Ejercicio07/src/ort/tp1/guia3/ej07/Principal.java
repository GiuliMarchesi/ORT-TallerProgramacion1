package ort.tp1.guia3.ej07;



public class Principal {

	public static void main(String[] args) {
		
		Figura r = new Rectangulo();
		Figura c = new Circunferencia();
		Figura te = new TrianguloEquilatero();

//		System.out.println(r.calcularArea());
//		System.out.println(c.calcularArea());
//		System.out.println(te.calcularArea());
		
		
		GrupoDeFiguras gFiguras = new GrupoDeFiguras();
		
		gFiguras.agregarFiguras(r);
		gFiguras.agregarFiguras(c);
		gFiguras.agregarFiguras(te);
		
		gFiguras.mostrarInfoDeFiguras();
	}

}
