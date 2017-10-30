package uade.ioo.modelo;

import java.util.Date;

public class Cheque {
	
private int numero;
private Date fechaEmision;

public Cheque(int numero, Date fechaEmision){
	this.numero = numero;
	this.fechaEmision = fechaEmision;
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

}
