package demo;

import java.util.Scanner;

public class AreaOfRectanglessss {
	
	
	public int calculateArea(int a, int b, int c) {
		return a*b*c;
	}
	
	public double calculateArea(double a, double b, double c) {
		return a*b*c;
	}
	
	  
	 
	
	public static void main(String[] args) {
		AreaOfRectanglessss a1 = new AreaOfRectanglessss();
		//a1.calculateArea();
		
		Scanner s = new Scanner(System.in);
        
        System.out.print("Enter length: ");
        
       // int l = s.nextInt();
        
        double doubL = s.nextDouble();
        
        
        
        System.out.print("Enter breadth: ");
        
        //int b = s.nextInt();
        
        double doubB = s.nextDouble();
        
        System.out.print("Enter height: ");
        
        //int h = s.nextInt();
        
        double doubH = s.nextDouble();
        
        //int area = a1.calculateArea(h, l, b);
        
        double doubleAarea = a1.calculateArea(doubL,doubB,doubH);
        
        //System.out.println("Area of your rectangle = "+ area);
        System.out.println("Area of your rectangle = "+ doubleAarea);
	}

}
