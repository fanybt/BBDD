package testing;

import modelo.javabeans.Familia;
import modelo.javabeans.Producto;

public class TestAsociacionFamilias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Familia fam1 = new Familia(1,"Pantalones");
		
		Producto prod1 = new Producto(1,"Pantalon verde hombre", 125, fam1);
		Producto prod2 = new Producto(2, "falda vaquera mujer talla xs ", 70, new Familia(2, "falda"));
		
		fam1.setDescripcion("pantalon");
		System.out.println("la familia del producto1 : "+ prod1.getFamilia());
		System.out.println("la variable fam 1 : "+ fam1);
		System.out.println(" descripcion de la familia de prod 1 :" + prod1.getFamilia().getDescripcion());
	}

}
