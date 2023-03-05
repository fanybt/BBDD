import java.util.Scanner;

public class GestionClientes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("¿Qué quieres hacer?");
            System.out.println("1. Alta cliente \n 2. Buscar cliente \n 3. Mostrar todos \n 4. Eliminar cliente \n Salir");
            opcion = in.nextInt();
            switch (opcion){
                case 1:
                    altaCliente();
                case 2:
                    buscarCliente();
                case 3:
                    mostrarTodos();
                case 4:
                    eliminarCliente();
                case 5:
                    System.out.println("SALIR");
                default:
                    System.out.println("Opción incorrecta");
            }
        }while (opcion != 5);
    }

    private static void buscarCliente() {
    }

    private static void mostrarTodos() {
    }

    private static void eliminarCliente() {
    }

    private static void altaCliente() {
    }
}