package testing.cuentas;
import javabeans.CuentaBancaria;

public class TestCuentas {

	public static void main(String[] args) {
		CuentaBancaria cuenta1 = new CuentaBancaria();
		cuenta1.setNombre("Tomas");
		cuenta1.setIdCuenta(1000);
		cuenta1.setApellidos("Escu Delgado");
		cuenta1.setTipoCuenta("Ahorro");
		cuenta1.setGenero('H');
		cuenta1.setSaldo(20_000);
		
		CuentaBancaria cuenta2 = new CuentaBancaria(2000, "Corriente","Sara","Varas",'m', 34_000);
		
		System.out.println(cuenta1.getSaldo());
		System.out.println("nombre de cuenta1 es :" +cuenta1.getNombre());
		System.out.println(cuenta1);
		
		cuenta2.ingresar(10_000);
		cuenta2.extraer(2000);
		System.out.println("saldo de cuenta 2 es : " + cuenta2.getSaldo());
		System.out.println(cuenta2.literalGenero());
		System.out.println("nombre de cuenta1 es :" +cuenta2.getNombre());
		System.out.println(cuenta2);
		
		
	}
	

}
