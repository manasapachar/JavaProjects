package demo;

public class EvenAndOdd {

	public static void main(String[] args) {
		
		System.out.println("Even numbers between 1 and 100: ");

		for (int a = 1; a <= 100; a++) {
		
			if (a % 2 == 0) {
			
				System.out.println(a + " ");
			}
			
		
		}
		
		System.out.println("\nOdd numbers between 1 and 100: ");
		
		for (int a = 1; a <= 100; a++) {
		
			if (a % 2 != 0) {
			
				System.out.println(a + " ");
			
			}
		}
	}

}
