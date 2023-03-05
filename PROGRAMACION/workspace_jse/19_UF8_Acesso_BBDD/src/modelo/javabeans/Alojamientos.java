package modelo.javabeans;

import java.util.Objects;

import com.mysql.cj.protocol.Resultset;

public class Alojamientos {
	private int codAlojamiento;
	private String categoria;
	public Alojamientos() {
		super();
	}
	
	public int getCodAlojamiento() {
		return codAlojamiento;
	}
	public void setCodAlojamiento(int codAlojamiento) {
		this.codAlojamiento = codAlojamiento;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(codAlojamiento);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alojamientos other = (Alojamientos) obj;
		return codAlojamiento == other.codAlojamiento;
	}
	@Override
	public String toString() {
		return "Alojamientos [codAlojamiento=" + codAlojamiento + ", categoria=" + categoria + "]";
	}
	
	// siempre constructor con nada y GyS con todo y equals y hascode con idAlojamiento y to String //
	

}
