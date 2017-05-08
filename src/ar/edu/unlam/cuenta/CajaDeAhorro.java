package ar.edu.unlam.cuenta;

public class CajaDeAhorro extends Cuenta {
	private Integer cantidadExtracciones=0;

	@Override
	public Double extraer(Double importe) {
		this.saldo = saldo - importe;
		//cambie this.importe por this saldo
		this.cantidadExtracciones = cantidadExtracciones +1;

		if (cantidadExtracciones >= 5) {
		//me parece que aca deberia ser may >=s
			this.saldo = saldo - 6.00;
			cantidadExtracciones = 0;
		}
		return saldo;
	}

}
