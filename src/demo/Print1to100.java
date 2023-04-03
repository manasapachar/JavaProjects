package demo;// Print 1 to 100 //

public class Print1to100 {

	public static void main(String[] args)
{
		
int number = 1;
		
		printNumbers(number);	
	}
	
	public static void printNumbers(int num)
	{
		if(num <= 100)
		{
			System.out.println(num +" "); 
			printNumbers(num + 1);
		}	
	}
		
}