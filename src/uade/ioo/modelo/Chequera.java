package uade.ioo.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Chequera {
private int numero;
private Date fechaEmision;
List<ChequePropio> cPropio;

public Chequera(int numero,Date fechaEmision){
	this.numero = numero;
	this.fechaEmision = fechaEmision;
	this.cPropio = new ArrayList<ChequePropio>();
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

public int ultimoNumero(){
	return numero;
}

}
