
public class Ejercicio02MetodosString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*
	 * 	String opcion = "uy";
	 */
		
		/*switch (opcion) {

		case "alta":
		System.out.println("en alta");
		
		break;
		case "baja":
			System.out.println("tramitando baja ");
			
			break;
				
			default:
				System.out.println("opcion incorrecta ");
		
				*/
		
		String nombre = "tomas";
		nombre = nombre.toUpperCase();
		System.out.println("el nombre ahora esta : " + nombre );
		System.out.println(nombre.toUpperCase());
		
		
		/*
		 * recorrer un String caracter a caracter 
		 */
		
		for (int  i=0; i<nombre.length(); i++)
			System.out.println(nombre.charAt(i));
			/*
			 * para recorrerlo del reves 
			 */
		for (int  i=nombre.length()-1;i>=0; i--)
			System.out.println(nombre.charAt(i));
		
		
		System.out.println(nombre.charAt(1)=='O');
		
		System.out.println(nombre.endsWith("AS"));
		
		System.out.println(nombre.startsWith("TO"));
		System.out.println(nombre.substring(2));
		nombre = "";
		//System.out.println(nombre.isEmpty());
		
		/*
		 * como dar la vuelta a una cadena de caracteres
		 */
		
		System.out.println("dar la vuelta a una cadena ");
		
		String cadena = "hola me llamo esteban";
		String cadenaReverse = "";
		
		for (int  i=cadena.length()-1;i>=0; i--)
			cadenaReverse += cadena.charAt(i);
			System.out.println(cadenaReverse);

		
	}
	

}

		