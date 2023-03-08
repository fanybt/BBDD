package Principal;

import java.util.Scanner;

import daos.ClienteDao;
import daos.ClienteDaoSQL;
import javabeans.Cliente;

public class GestionClientes {
	public static void main(String[] args) {
	      /*  Scanner in = new Scanner(System.in);
	        int opcion = 0;

	        do {
	            System.out.println("¿Qué quieres hacer?");
	            System.out.println("1. Alta cliente \n 2. Buscar cliente \n 3. Mostrar todos \n 4. Eliminar cliente \n 5.Salir");
	            opcion = in.nextInt();
	            switch (opcion){
	                case 1:
	                    altaCliente();
	                	break;
	                case 2:
	                    buscarCliente();
	                	break;
	                case 3:
	                    buscarTodos();
	                	break;
	                case 4:
	                    eliminarCliente();
	                	break;
	                case 5:
	                    System.out.println("SALIR");
	                default:
	                    System.out.println("Opción incorrecta");
	            }
	        }while (opcion != 5);
	    }*/
	            ClienteDao clidao=new ClienteDaoSQL();
	            Cliente c1= new Cliente("A12212252","Pedro" ,"Martin","C/tul",2000000.00, 200);//funciona
	           // cldao.altaCliente(c1);
	           for(Cliente ele : clidao.buscarTodos()) {
	        	   System.out.println(ele);// funciona//
	        	   }
	           
	        	   System.out.println(clidao.buscarUna("A12212252")); // funciona //
	        	   System.out.println(clidao.eliminarCliente("12212252"));//funciona//
	           }
	
	             
	

	        
	
}
