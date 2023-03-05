package testing;

import modelo.javabeans.Administrativo;
import modelo.javabeans.Alumno;
import modelo.javabeans.Profesor;

public class TestPrimero {

	public static void main(String[] args) {
		
		Profesor profesor = new Profesor ("50224800","Antonio","Tulipanes","915428796","Lengua");
		Alumno alumno = new Alumno ("2258964C","Diego","C/Sol","912428796","1ºBachillerato");
		Administrativo administrativo= new Administrativo("1125889X", "Sara","C/Pez", "918547878","Imprimir");
		
		System.out.println(profesor.toString());
		System.out.println(profesor.trabajar());
		
		System.out.println(alumno.toString());
		System.out.println(alumno.trabajar());
		
		System.out.println(administrativo.toString());
		System.out.println(administrativo.trabajar());
		
		System.out.println(alumno.llamar(profesor));
		System.out.println(profesor.ponerNotas());
		System.out.println(alumno.hacerExamen());
		System.out.println(administrativo.gestionarMatricula());
		
		
		
	}

}
