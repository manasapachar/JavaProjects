package demo;

import java.util.Scanner;

public class Add1to100 {

	public static void main(String[] args) {
		
		
		int num = 100, i = 1, sum = 0; 
		
		Scanner s = new Scanner(System.in);
		//executes until the condition returns true  
		while(i <= num)  
		{  
		//adding the value of i into sum variable  
		sum = sum + i;  
		//increments the value of i by 1  
		i++;  
		}  
		//prints the sum   
		System.out.println("Additional of 1 to 100 is = " + sum);  

	}

}
