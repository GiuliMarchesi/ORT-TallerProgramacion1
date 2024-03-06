package ort.tp1.guia4.ej01;

public class Robot {
	
	private final int BATERIA_BAJA = 20;
	
	private String codigo;
	private int nivelBateria;
	
	
	public Robot(String codigo, int nivelBateria) {
		setCodigo(codigo);
        setNivelBateria(nivelBateria);
    }


	public String getCodigo() {
		return codigo;
	}


	public int getNivelBateria() {
		return nivelBateria;
	}
	
	public void setCodigo(String codigo) {
        if (codigo == null || codigo.isEmpty()) {
            throw new IllegalArgumentException("El código no puede ser nulo o vacío.");
        }
        this.codigo = codigo;
    }
	
    public void setNivelBateria(int nivelBateria) {
        if (nivelBateria < 0 || nivelBateria > 100) {
            throw new IllegalArgumentException("El nivel de batería debe estar entre 0 y 100.");
        }
        this.nivelBateria = nivelBateria;
    }
	
	public boolean isBateriaBaja() {
		return this.nivelBateria <= 20;
	}


	public boolean tieneCodigo(String codigo) {
		return this.codigo.equals(codigo);
	}
	
}
