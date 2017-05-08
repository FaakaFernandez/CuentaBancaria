package ar.edu.unlam.cuenta;

public class CuentaCorriente extends Cuenta{

	private final Double porcentajeComision = 0.05;
	private final Double giroDescubierto = 150.0;

	public Double getPorcentajeComision() {
		return porcentajeComision;
	}

	public Double getGiroDescubierto() {
		return giroDescubierto;
	}

	public void extraer(Double monto) throws RuntimeException {
		Double dineroAExtraer = monto;
		Double saldoActual = this.getSaldo();
		Double giroDescubierto = this.getGiroDescubierto();

		if (saldoActual >= dineroAExtraer) {
			this.setSaldo(saldoActual - dineroAExtraer);
		} else if ((saldoActual + giroDescubierto) >= dineroAExtraer) {
			Double comision = (dineroAExtraer - saldoActual) * porcentajeComision;

			this.setSaldo(saldoActual - dineroAExtraer - comision);
		} else {
			throw new RuntimeException();
		}
	}
}

