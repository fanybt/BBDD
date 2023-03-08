package javabeans;

import java.util.Objects;

public class Perfil {
	 // variables propias que coinciden con las de la tabla de la bbdd
    private int id_perfil;
    private String nombre;

    public Perfil() {
    }

    public Perfil(int id_perfil, String nombre) {
        this.id_perfil = id_perfil;
        this.nombre = nombre;
    }

    public int getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(int id_perfil) {
        this.id_perfil = id_perfil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

	@Override
	public String toString() {
		return "Perfil [id_perfil=" + id_perfil + ", nombre=" + nombre + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_perfil);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perfil other = (Perfil) obj;
		return id_perfil == other.id_perfil;
	}
    
}


