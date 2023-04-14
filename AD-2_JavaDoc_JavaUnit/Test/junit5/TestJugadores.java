package junit5;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.javabeans.Jugador;

class TestJugadores {
	
	 public int dorsal;
	public int numeroTarjetasAmarillas;
	public int numeroTarjetasRojas;
	Jugador jugador=new Jugador();
	Jugador jugador1=new Jugador();
	Jugador jugador2=new Jugador();
	@Test
	public void ponerDorsal() {
		 int dorsal=8;
		if (dorsal>= 1 && dorsal<=30) {
			
			jugador.ponerDorsal(dorsal);
			}
		     
			assertEquals(8,jugador.getDorsal());
		}

	@Test
	public void ponerDorsalNo() {
		 int dorsal=0;
		if (dorsal>= 1 && dorsal<=30) {
			
			jugador.ponerDorsal(dorsal);
			}
		     
			assertEquals(0,jugador.getDorsal());
		}
	
    @Test
    public void estaExpulsado(){
    	boolean expulsado=false;
	   if(numeroTarjetasAmarillas==2 ||  numeroTarjetasRojas==1) {
		   jugador.estaExpulsado();
	   } 
		jugador2.setNumeroTarjetasAmarillas(2);
		jugador2.setNumeroTarjetasRojas(0);
		
	  
	  assertTrue(jugador2.estaExpulsado());
    }
	  

    @Test
    public void estaExpulsado2(){
    	boolean expulsado=false;
	   if(numeroTarjetasAmarillas==2 ||  numeroTarjetasRojas==1) {
		   jugador.estaExpulsado();
	   } 
		jugador2.setNumeroTarjetasAmarillas(0);
		jugador2.setNumeroTarjetasRojas(1);
		
	  
	  assertTrue(jugador2.estaExpulsado());
    }
	  
    @Test
    public void NoEstaExpulsado(){
    	boolean expulsado=false;
	   if(numeroTarjetasAmarillas==2 ||  numeroTarjetasRojas==1) {
		   jugador.estaExpulsado();
	   } 
		jugador2.setNumeroTarjetasAmarillas(0);
		jugador2.setNumeroTarjetasRojas(0);
		
	  
	  assertFalse(jugador2.estaExpulsado());
    }
	    
		 
	 
}

	
	


