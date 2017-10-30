package uade.ioo.modelo;

import java.util.Date;

public class ChequePropio extends Cheque {
	private int numero;
	private Date fechaEmision;
	private double monto;
	
	public ChequePropio(int numero, Date fechaEmision, double monto) {
		super(numero, fechaEmision);
		this.monto = monto;		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

}
