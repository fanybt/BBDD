package cursoasigantura;

public class MainCursos {

	public static void main(String[] args) {
		
		Curso daw = new Curso ("daw",10);
		Asignatura programacion = new Asignatura("programacion",20);
		Asignatura bbdd = new Asignatura("bbdd",15);
		
		daw.agregarasignatura(bbdd);
		daw.agregarasignatura(programacion);
		daw.mostrarDatos();

	}

}
