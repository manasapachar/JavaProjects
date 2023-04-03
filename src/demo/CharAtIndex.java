package demo;

import java.util.Scanner;

public class CharAtIndex {

	public static void main(String[] args) {
		
		
		String name = ("Hello My Name is Manasa ");
		Scanner s = new Scanner(System.in);
		
		//char ch = name.charAt(4); for single ch
		 
		for(int i=0; i<name.length(); i++) {
			
			System.out.println(name.charAt(i));
			
			
		}
		

	}

}
