package principales;

import java.util.Scanner;

import daos.ClienteDao;
import daos.ClienteDaoImplMy8;
import javabeans.Cliente;

public class GestionClientes {

	public static void main(String[] args) {
		//MENÚ
		Scanner leer = new Scanner (System.in);
		int opc = 0, num1 = 0, num2 = 0;
		ClienteDao cdao = new ClienteDaoImplMy8();
		Cliente cliente = new Cliente("C4444444", "Luis", "Morales", "Ciudad Real", 1437, 20);
		
		opc = pintarMenu();//invocamos el método
		while (opc != 5) {
			
			switch (opc) {
			case 1:
				System.out.println(cdao.altaCliente(cliente));
				System.out.println("CLIENTE C4444444 DADO DE ALTA");
				break;
			case 2:
				System.out.println("BUSCAR UNO, EL A22222222");
				System.out.println(cdao.buscarUno("A22222222"));
				break;
			case 3:
				System.out.println("BUSCAR TODOS");
				for (Cliente ele: cdao.buscarTodos())
					System.out.println(ele);
				break;
			case 4:
				System.out.println("ELIMINAR UNO, EL CLIENTE C4444444");
				System.out.println(cdao.eliminarCliente(cliente));
				break;
			default:
				System.out.println("Opción errónea");
				break;
		
			}
			
			opc = pintarMenu();
		}
		
		System.out.println("FIN DE PROGRAMA");

	}
	
	public static int pintarMenu() {
		Scanner leer = new Scanner(System.in);
		int opcion = 0;
		
		System.out.println("1.- Alta del cliente");
		System.out.println("2.- Buscar un cliente");
		System.out.println("3.- Mostrar Todos");
		System.out.println("4.- Eliminar un cliente");
		System.out.println("5.- Salir");
		
		System.out.println("Teclea una opción del 1 al 4, 5 para salir.");
		opcion = leer.nextInt();

		while (opcion<1 || opcion>5) {
			System.out.println("Teclea opciones del 1 al 5.");
			opcion = leer.nextInt();
		}
		
		//Si teclea del 1 al 5 devuelvo la opción.
		return opcion;
		
	}

}
