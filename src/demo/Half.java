package demo;

public class Half implements Function {
	
	
	int halfSample = 0; 

	public static void main(String[] args) {
		
		Half h = new Half();
		int x = 0;
		x = h.evaluate(50);
		System.out.println("x = "  +x);
		

	}

	public int evaluate(int a) {
		int  half = a/2;
		return half;
	}

}
