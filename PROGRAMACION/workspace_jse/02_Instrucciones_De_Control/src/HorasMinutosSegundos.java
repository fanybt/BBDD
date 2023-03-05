import java.util.Scanner;

public class HorasMinutosSegundos {

	public static void main(String[] args) {
		int hh=0, mm=0 ,ss=0;
		Scanner leer = new Scanner (System.in);
		System.out.println("dime la hora de 0 a 23");
		hh=leer.nextInt();
		System.out.println("dime los minutosde 0 a 59");
		mm=leer.nextInt();
		System.out.println("dime los segundos de 0 a 59");
		ss=leer.nextInt();
		System.out.println( hh + " : " + mm + " : "+ ss);
		
		ss+=1;
		
		if (ss>59) {
			mm+=1;
			ss =0;
		}else if(mm>59){
			  hh+=1;
			  mm=0;
			
		}else if(hh>23){
			hh=0;
			
		}
		System.out.println("la hora un segundo despues es : " + hh + " : " + mm + " : "+ ss );	
		
	}

}
