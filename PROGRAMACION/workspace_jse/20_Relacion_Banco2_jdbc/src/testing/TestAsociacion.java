package testing;

import modelo.javabeans.Cliente;
import modelo.javabeans.Cuenta;
import modelo.javabeans.Oficina;

public class TestAsociacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Oficina of1= new Oficina(9282, "Madrid2", "calle del pez , 3 , Madrid", "914167899");
		Cliente cli1= new Cliente("72345665B","Angel", "Uria Benitez", "madrid", "ab@ii.es", of1);
		Cuenta cuenta1= new Cuenta(1000,"ahorro", 2000, cli1);
		Cuenta cuenta2= new Cuenta(2000, "corriente", 4000, new Cliente("88776655A", "Sara", "Perez Alvarez", "sevilla", "saraee@.es", of1));

		
		
		System.out.println("codigo de cuenta y saldo  : " + cuenta2.getIdCuenta()+ "-"+ cuenta2.getSaldo());
		System.out.println("nombre y apellidos del cliente  : " + cuenta2.getCliente().getNombre()+ cuenta2.getCliente().getApellidos());
		System.out.println("telefono oficina del cliente de la cuenta 2 : " + cuenta2.getCliente().getOficina().getTelefono());

	}

}
