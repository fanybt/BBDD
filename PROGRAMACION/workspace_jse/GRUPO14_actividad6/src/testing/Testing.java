package testing;

import java.util.List;

import modelo.javabeans.Administrativo;
import modelo.javabeans.Alumno;
import modelo.javabeans.Instituto;
import modelo.javabeans.Persona;
import modelo.javabeans.Profesor;

public class Testing {

	public static void main(String[] args) {
		Profesor profesor = new Profesor ("50224800","Antonio","Tulipanes","915428796","Lengua");
		Alumno alumno = new Alumno ("2258964C","Diego","C/Sol","912428796","1ºBachillerato");
		Administrativo administrativo= new Administrativo("1125889X", "Sara","C/Pez", "918547878","Imprimir");
		Profesor profesor1 = new Profesor ("50211100","Alba","Tulipanes","915428796","Lengua");
		Alumno alumno1 = new Alumno ("212564C","Alvaro","C/Sol","912428796","1ºBachillerato");
		Administrativo administrativo1= new Administrativo("112333X", "Susana","C/Pez", "918547878","Imprimir");
		
		Instituto instituto=new Instituto();
		instituto.altaPersona(alumno1);
		instituto.altaPersona(profesor1);
		instituto.altaPersona(administrativo1);
		instituto.altaPersona(alumno);
		instituto.altaPersona(administrativo);
		instituto.altaPersona(profesor);
		
		
		System.out.println(instituto.buscarPersona("50224800").toString());
		List<Persona> resultado = instituto.buscarTodas();
		
		System.out.println("buscar todas : "  );
		for(Persona item : resultado) {
			System.out.println(item.toString());
		}
		
		instituto.aliminarPersona(administrativo1);
		
	
		
		List<Persona> resultadoTipo = instituto.buscarPersonasPorTipo("Profesor");
		System.out.println("buscar por tipo : "  );
		for(Persona item : resultadoTipo) {
			System.out.println(item.toString());
		}
		for(Persona item : resultadoTipo) {
			if(item instanceof Profesor) {
				System.out.println(((Profesor)item).ponerNotas());
			}else if(item instanceof Alumno) {
				System.out.println(((Alumno)item).hacerExamen());
			}else if (item instanceof Administrativo) {
				System.out.println(((Administrativo)item).gestionarMatricula());
			}
			
		}
		
	
		

	}

}
