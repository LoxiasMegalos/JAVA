
public class Multiplo3 {

	public static void main(String[] args) {
		for(int numero = 1; numero <= 100; numero++) {
			if(numero % 3 == 0)
				System.out.print(numero + " ");
		}
		
		System.out.println();
		
		for(int numero = 0; numero <= 100; numero+=3) {
			if(numero != 0)
				System.out.print(numero + " ");
		}
	}
}
