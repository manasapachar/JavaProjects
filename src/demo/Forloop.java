package demo;

public class Forloop {

	public static void main(String[] args) {

		for (int row = 0; row < 5; row++)
		{
			for (int cols = 5-row-1; cols>=0 ; cols--)
			{
				System.out.print(" ");
			}
			for (int cols = 0; cols<=row; cols++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
