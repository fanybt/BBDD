package javabeans;

public class Producto {
	
	private int idProducto;
	private String descripcion;
	private double precioUnitario;
	private String familia;
	
	public Producto() {
		
	}

	public Producto(int idProducto, String descripcion, double precioUnitario, String familia) {
		super();
		this.idProducto = idProducto;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.familia = familia;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", descripcion=" + descripcion + ", precioUnitario="
				+ precioUnitario + ", familia=" + familia + "]";
	}
     
	
	
	
}
