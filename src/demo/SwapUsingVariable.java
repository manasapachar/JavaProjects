package demo;

public class SwapUsingVariable {

	public static void main(String[] args) {
		  
		int  x = 10;
		int y = 20;
		System.out.println("x = " + x);		
		System.out.println("y = " + y);
		
		int z = y;
		    y = x;
		    x = z;
		    
		    System.out.println("x = " + x);		
			System.out.println("y = " + y);
		
		
	}

}
