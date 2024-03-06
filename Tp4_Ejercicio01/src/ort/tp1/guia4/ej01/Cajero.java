package ort.tp1.guia4.ej01;

import java.util.ArrayList;

public class Cajero {
	
	private static int contadorIds = 0;
	private int ID;
	private String apellido;
	private int mesesAntiguedad;

	
	public Cajero(String apellido, int mesesAntiguedad) {
		this.ID = contadorIds;
		contadorIds++;
        setApellido(apellido);
        setMesesAntiguedad(mesesAntiguedad);
    }

	public int getID() {
		return ID;
	}


	public String getApellido() {
		return apellido;
	}



    // Setter para el apellido
    public void setApellido(String apellido) {
        if (apellido == null || apellido.isEmpty()) {
            throw new IllegalArgumentException("Apellido no puede ser nulo o vacío.");
        }
        this.apellido = apellido;
    }

    // Setter para los meses de antigüedad
    public void setMesesAntiguedad(int mesesAntiguedad) {
        if (mesesAntiguedad < 0) {
            throw new IllegalArgumentException("Meses de antigüedad no pueden ser negativos.");
        }
        this.mesesAntiguedad = mesesAntiguedad;
    }
	
	
	
}
