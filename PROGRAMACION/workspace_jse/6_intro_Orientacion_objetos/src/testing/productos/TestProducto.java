package testing.productos;
import javabeans.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto p2 = new Producto(4, "Prestamo hipotecario", 15_000,"Hipotecarios" );
		
		p2.setDescripcion("hipo 15");
		p2.setFamilia("hipotecario");
		System.out.println("la descripcion de p2 : " + p2.getDescripcion());
		System.out.println(p2.toString());
		
		
		
	}

}
