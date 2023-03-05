package Envolventes;

public class TestEnvolventes {

	public static void main(String[] args) {
		//variable num de tipo"clase"Integer//
		Integer num =7;
		//Dato básico int//
		int entero=num;
		System.out.println(num + "-"+entero);
		// si le doy valor a entero lo hago a inversa//
		entero = 97;
		num=entero;
		System.out.println(num + "-"+entero);
		
		// cuando por ejemplo nos pasan una edad desde fuera (formulario web)//
		//viene como un String//
		String edad="62";
		//  y ahora lo querria convertir a entero , asi ;//
		//entero = edad;//
		/*
		 * pero da error por que no puede convertir de String a entero y entonces
		 * usamos la envolvente 
		 */
		entero=Integer.parseInt("62");
		//le pasas un String y te devuelve un entero cuando tienes un int//
		System.out.println(num + "-"+entero);
		//Para pasar un String a entero cuando tienes un String//
		num=Integer.valueOf(edad);
		System.out.println(num + "-"+entero);
		// si pones num. que es una variable de tipo Integer se ven los métodos con//
		//punto verde y los estáticos//
		
	}

}
