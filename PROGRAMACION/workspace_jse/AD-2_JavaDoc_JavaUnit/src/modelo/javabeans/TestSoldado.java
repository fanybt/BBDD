package modelo.javabeans;
/**
 * Clase Test Soldado . En ella podremos crear soldados , dotarles de balas ,decir si estan muertos o no ,
 * hacer que disparen , seleccionar el soldado al que va a disparar , ver si estan muertos y cuantas balas les quedan .
 * @author fanyb.
 *
 */


public class TestSoldado {
	/**
	 * Metodo main donde creamos soldados les damos balas , decimos si estan muertos o no y si disparan y 
	 * a quien disparan.
	 * @param args del metodo estatico main.
	 */

	public static void main(String[] args) {
		/**
		 * Creamos los soldados y les dotamos de balas .
		 */
		
		 Soldado solespanol1=new Soldado(false, 20);
		 Soldado solespanol2=new Soldado(false, 10);
		 
		 Soldado solinglesl=new Soldado(false, 15);
		 Soldado solingles2=new Soldado(false, 6);
		 /**
		  * Decimos que los soldados pueden disparar y cuantas balas tienen .
		  */
		 
		 System.out.println("Puede disparar solEspañol1 : " + solespanol1.puedeDisparar()+" "+"tiene : "+ solespanol1.getNumeroBalas()+ "balas");
		 System.out.println("Puede disparar solEspañol2 : " + solespanol2.puedeDisparar()+" "+"tiene : "+ solespanol2.getNumeroBalas()+ "balas");
		 System.out.println("Puede disparar solIngles1 : " + solinglesl .puedeDisparar()+" "+"tiene : "+ solinglesl.getNumeroBalas()+ "balas");
		 System.out.println("Puede disparar solIngles2 : " + solingles2.puedeDisparar()+" "+"tiene : "+ solingles2.getNumeroBalas()+ "balas");
		 
		 /**
		  * Declaramos que los soldados Españoles disparan a los Ingleses .
		  */
		 System.out.println("Soldados Españoles disparan a los soldados Ingleses ");
		 /**
		  * Decimos que si soldadoEspañol1 y soldadoEspañol2 pueden disparar que disparen a soldadosIngleses 1 y 2 .
		  * Y decimos que si ellos no disparan entonces seran los Ingleses los que disparen a los Españoles .
		  */
			if (solespanol1.puedeDisparar()&solespanol2.puedeDisparar() ) {
				solespanol1.disparar(solingles2);
				solespanol2.disparar(solinglesl);
			}else if(solinglesl.puedeDisparar()&solingles2.puedeDisparar()){
				solinglesl.disparar(solespanol1);
				solingles2.disparar(solespanol2);
			}
			
			/**
			 * Preguntamos si están muertos los soldados Españoles o los Ingleses y cuantas balas les queda a cada uno .
			 */

			System.out.println("¿Está muerto los saldados ingleses? " + solinglesl.isEstaMuerto()+ " y " + solingles2.isEstaMuerto());
			System.out.println("¿Está muerto los saldados Españoles? " + solespanol1.isEstaMuerto()+ " y " + solespanol2.isEstaMuerto());
			System.out.println("¿Cuantas balas les quedan a los Ingleses? " + "soldadoIngles1 : "+ solinglesl.getNumeroBalas()+ " y soldadoIngles2 " + solingles2.getNumeroBalas());
			System.out.println("¿Cuantas balas les quedan a los   saldados Españoles? " +"SoldadEspañol1 :"+ solespanol1.getNumeroBalas()+ " y SoldadoEspanol2 :" + solespanol2.getNumeroBalas());
			
			
	}
	        
	

}
