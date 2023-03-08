package javabeans;

import java.util.Objects;

public class Departamento {
	// variables propias que coinciden con las de la tabla de la bbdd
    private int id;
    private String nombre, direccion;

    public Departamento() {
    }

    public Departamento(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		return id == other.id;
	}
    
}


