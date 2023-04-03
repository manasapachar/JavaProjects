package demo;

public class SumOfFirst25Naturalnumber {

	public static void main(String[] args) {
		
		
		int sum = 0;
		
		// excutes until the condition return true
		
		for (int i = 1; i<= 25; i++)
			
		{
			
			sum = sum + i;
			
			
		}

		System.out.println("sum of first 25 natural numbers == " + sum);
		
	}

}
