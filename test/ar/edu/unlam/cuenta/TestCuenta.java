package ar.edu.unlam.cuenta;

import org.junit.Assert;
import org.junit.Test;

public class TestCuenta {
	
	@Test
	public void testExtraerDeCuentaSueldo(){
		
		CuentaSueldo Cuenta = new CuentaSueldo();
		
		Cuenta.setSaldo(4000.00);
		Cuenta.setImporte(500.00);
		Cuenta.extraer(Cuenta.getImporte());
		
		//Double importeAextraer = Cuenta.getImporte();
		//Cuenta.extraer(importeAextraer);
		
		Double actual=Cuenta.getSaldo();
		Double expected=3500.00;
		Assert.assertEquals(expected, actual);
		
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");
		System.out.println("Extraje de Cuenta Sueldo $: ");
		System.out.println(Cuenta.getImporte());
		System.out.println("Saldo actual $: ");
		System.out.println(Cuenta.getSaldo());
		System.out.println("---------------------------------------");
		
		
	}

	
	
	@Test
	public void testDepositarEnCuentaSueldo(){
		CuentaSueldo Cuenta = new CuentaSueldo();
		
		Cuenta.setSaldo(4000.00);
		Cuenta.setImporte(500.00);
		Cuenta.depositar(Cuenta.getImporte());
		
		Double actual=Cuenta.getSaldo();
		Double expected=4500.00;
		Assert.assertEquals(expected, actual);
		
		System.out.println("---------------------------------------");
		
		System.out.println("Se depositaron en Cuenta Sueldo $: ");
		System.out.println(Cuenta.getImporte());
		System.out.println("Saldo actual $: ");
		System.out.println(Cuenta.getSaldo());
		
		
		System.out.println("---------------------------------------");
		
	}
	
	
	@Test
	public void testDepositarEnCajaDeAhorro(){
		Cuenta miCuenta = new CajaDeAhorro();
		
		miCuenta.setSaldo(4000.00);
		miCuenta.setImporte(500.00);
		miCuenta.depositar(miCuenta.getImporte());
		
		Double actual=miCuenta.getSaldo();
		Double expected=4500.00;
		Assert.assertEquals(expected, actual);
		
		System.out.println("---------------------------------------");
		
		System.out.println("Se depositaron en Caja De Ahorro $: ");
		System.out.println(miCuenta.getImporte());
		System.out.println("Saldo actual $: ");
		System.out.println(miCuenta.getSaldo());
		
		System.out.println("---------------------------------------");
		
		
	}
	
	@Test
	public void testExtraerDesdeCajaDeAhorro(){
		Cuenta miCuenta = new CajaDeAhorro();
		
		miCuenta.setSaldo(4000.00);
		miCuenta.setImporte(500.00);

		Double importeAextraer1 = miCuenta.getImporte();
		miCuenta.extraer(importeAextraer1);
		
		Double importeAextraer2 = miCuenta.getImporte();;
		miCuenta.extraer(importeAextraer2);
		
		Double importeAextraer3 = miCuenta.getImporte();
		miCuenta.extraer(importeAextraer3);
		
		Double importeAextraer4 = miCuenta.getImporte();
		miCuenta.extraer(importeAextraer4);
		
		Double importeAextraer5 = miCuenta.getImporte();
		miCuenta.extraer(importeAextraer5);
		
		Double importeAextraer6 = miCuenta.getImporte();
		miCuenta.extraer(importeAextraer6);
		
		Double actual = miCuenta.getSaldo();
		Double expected = 994.00;
		Assert.assertEquals(expected, actual);
		
		System.out.println("---------------------------------------");
		
		System.out.println("Se Exrajeron de Caja De Ahorro (x 6 Extracciones)$: ");
		System.out.println(miCuenta.getImporte());
		System.out.println("Saldo actual $: ");
		System.out.println(miCuenta.getSaldo());
		
		System.out.println("---------------------------------------");
		
		
	}
	

	@Test

	public void saldoInsuficiente() {
		
		Cuenta cuenta = new CuentaCorriente();
		
		cuenta.depositar(500.0);

		boolean saldoInsuficiente= false;

	try {

	cuenta.extraer(4000.0);

	} catch (RuntimeException
	 e) {

	saldoInsuficiente =
	true;

	}

	Assert.assertEquals(true,
	 saldoInsuficiente);

	}


	}


	
	

