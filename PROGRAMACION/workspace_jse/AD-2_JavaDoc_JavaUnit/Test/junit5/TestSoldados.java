package junit5;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

import modelo.javabeans.Soldado;

class TestSoldados {
	 private boolean estaMuerto=false;
	 public int numeroBalas;
	
	 Soldado solespanol2=new Soldado(false, 10);
	 
	 Soldado solinglesl=new Soldado(false, 15);
	 Soldado solingles2=new Soldado(false, 6);
	 
	 @Test
	 public void puedeDisparar() {
		
		   Soldado solespanol2=new Soldado(false, 10);
		 
				if (solespanol2.numeroBalas>0) {
					solespanol2.puedeDisparar();
					}
				
					assertTrue(solespanol2.puedeDisparar());
				}
	 @Test
	 public void puedeDispararFalse() {
		
		   Soldado solespanol2=new Soldado(false, 0);
		 
				if (solespanol2.numeroBalas>0) {
					solespanol2.puedeDisparar();
					}
				
					assertFalse(solespanol2.puedeDisparar());
				}
	 
	
	 
	 
	 @Test
	 public void disparar(Soldado solespanol21,Soldado solinglesl11) {
		 
		 Soldado solespanol21=new Soldado(false, 15);
		 Soldado solinglesl11=new Soldado(false, 10);
	    	
		 solespanol21.numeroBalas--;
		 solespanol21.disparar(soldadoingles11);
		 solinglesl1.estaMuerto=true;
		 
		 assertTrue(solinglesl.estaMuerto);
	    }
	                     
}
