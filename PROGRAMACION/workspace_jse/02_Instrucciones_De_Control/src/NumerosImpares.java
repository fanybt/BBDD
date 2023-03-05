
public class NumerosImpares {

	public static void main(String[] args) {
		int x = 1 * 3 * 5 * 7 * 9 * 11 * 13 * 15 * 17 * 19;
		System.out.println(x);
		int y = 1;
		for (int i = 0; i < 20; i++) {
			if (i % 2 != 0) {
				y *= i;
			}
		}
		System.out.println(y);
		
	}
	}


