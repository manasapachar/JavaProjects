package demo;

public class ProductBill {

	public static void main(String[] args) {
		
		String  ItemName = "Barbie.Doll";
		int Quantity = 5;
		double price = 1000.00;
		double tax = (price * Quantity) * 0.10;
		double totalbill = ( price * Quantity )+ tax ;
		
		
		 System.out.println("Iteam Name" + ItemName);
         System.out.println("Quantity " +  Quantity);
         System.out.println("price " + price);
         System.out.println("tax" + tax);
         System.out.println("tatalbill" + totalbill);
         
		 

	}

}
