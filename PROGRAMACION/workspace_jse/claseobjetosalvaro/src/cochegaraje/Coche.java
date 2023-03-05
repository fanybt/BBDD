package cochegaraje;

public class Coche {

	String marca = " ";
	String modelo = " ";
	double precio = 0;
	int CV = 0;
	
	/*
	 * siempre se crea un constructor vacio y despues otros con lo que nos pidan 
	 */
	
	public Coche() {
		super();
	}
	public Coche(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}
	public Coche(String marca, String modelo, double precio, int cV) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		CV = cV;
	}
	/*
	 * debajo de los constructores y encima de los gs poner los metodos 
	 */
	public  void Mostrardatos() {
		System.out.println(" marca : " + marca);
		System.out.println("modelo : " + modelo);
		System.out.println("precio : " + precio);
		System.out.println(" CV : " + CV);
	}
	 
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCV() {
		return CV;
	}
	public void setCV(int cV) {
		CV = cV;
	} 
	
	
}
