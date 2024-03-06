package ort.tp1.guia4.ej01;

public class Pedido {
	
	private String estado;
	private String nombreCliente;
	private double montoAAbonar;
	private int idCajero;
	private String codigoRobot;
	
	public Pedido(String estado, String nombreCliente, double montoAAbonar, int idCajero, String codigoRobot) {
        setEstado(estado);
        setNombreCliente(nombreCliente);
        setMontoAAbonar(montoAAbonar);
        setIdCajero(idCajero);
        setCodigoRobot(codigoRobot);
    }

	public int getIdCajero() {
		return this.idCajero;
	}

	public double getMonto() {
		return this.montoAAbonar;
	}

	public String getCodigoRobot() {
		return codigoRobot;
	}
	
    // Setter para el estado
    public void setEstado(String estado) {
        if (estado == null || estado.isEmpty()) {
            throw new IllegalArgumentException("El estado no puede ser nulo o vacío.");
        }
        this.estado = estado;
    }

    // Setter para el nombre del cliente
    public void setNombreCliente(String nombreCliente) {
        if (nombreCliente == null || nombreCliente.isEmpty()) {
            throw new IllegalArgumentException("El nombre del cliente no puede ser nulo o vacío.");
        }
        this.nombreCliente = nombreCliente;
    }

    // Setter para el monto a abonar
    public void setMontoAAbonar(double montoAAbonar) {
        if (montoAAbonar <= 0) {
            throw new IllegalArgumentException("El monto a abonar debe ser mayor que cero.");
        }
        this.montoAAbonar = montoAAbonar;
    }

    // Setter para el ID del cajero
    public void setIdCajero(int idCajero) {
        if (idCajero < 0) {
            throw new IllegalArgumentException("El ID del cajero debe ser un número positivo.");
        }
        this.idCajero = idCajero;
    }

    // Setter para el código del robot
    public void setCodigoRobot(String codigoRobot) {
        if (codigoRobot == null || codigoRobot.isEmpty()) {
            throw new IllegalArgumentException("El código del robot no puede ser nulo o vacío.");
        }
        this.codigoRobot = codigoRobot;
    }

	@Override
	public String toString() {
		return "Pedido [estado=" + estado + ", nombreCliente=" + nombreCliente + ", montoAAbonar=" + montoAAbonar
				+ ", idCajero=" + idCajero + ", codigoRobot=" + codigoRobot + "]";
	}
	
	

}
