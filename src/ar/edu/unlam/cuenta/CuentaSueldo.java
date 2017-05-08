package ar.edu.unlam.cuenta;

public class CuentaSueldo extends Cuenta {

	@Override
	//Aca modifique este metodo con valor de retorno porque no me daba.
	public Double extraer(Double importe) {
		if (importe < saldo) {
			this.saldo = saldo - importe;
			//Aca estaba this.importe y no me daba. Ahora da!
			return saldo;
		}
		return saldo;
	}
}
