package ar.edu.unlam.cuenta;

public class Cuenta {

	protected Double saldo;
	protected Double importe;
	


	public Double getSaldo() {
		return saldo;
	}
	
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}


	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}

	public void depositar(Double importe) {
		this.saldo = saldo + importe;
	}

	public Double extraer(Double importe) {
		return this.saldo = saldo - importe;
	}

}