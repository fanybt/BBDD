package modelo.javabeans;

public class Familia {
	
  private int idFamilia;
  private String descripcion;
  
public Familia(int idFamilia, String descripcion) {
	super();
	this.idFamilia = idFamilia;
	this.descripcion = descripcion;
}
public Familia() {
	super();
}
public int getIdFamilia() {
	return idFamilia;
}
public void setIdFamilia(int idFamilia) {
	this.idFamilia = idFamilia;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
@Override
public String toString() {
	return "Familia [idFamilia=" + idFamilia + ", descripcion=" + descripcion + "]";
}
  
}
