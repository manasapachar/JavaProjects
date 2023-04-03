package demo;

public class Vehical {
	
	/*/*
	 * public Vehical() {
	 * 
	 * }
	 */

	public Vehical(String bName, String cName, int mil) {
		//Parametrized Constructor
		//initialize values - brandName
		
		brandName = bName;
		carName = cName;
		mileage = mil;

		System.out.println(brandName);

	}
	
	/*
	 * public void initValues(String bName, String cName, int mil) { //Constructor
	 * //initialize values - brandName
	 * 
	 * brandName = bName; carName = cName; mileage = mil;
	 * 
	 * System.out.println(brandName);
	 * 
	 * }
	 */
	
	
	
	
	//Vehical property - brnadName
	String brandName;
	String carName;
	int mileage;
 
	//main method
	public static void main(String[] args) {
		
		//Creating objects with diff brnad names

		Vehical car1 = new Vehical("tata", "nexon", 30);
		Vehical car2 = new Vehical("Mahindra", "xuv", 20);
		Vehical car3 = new Vehical("Hyundai", "creta", 10);
		Vehical car4 = new Vehical("Honda","jazz", 10);
		Vehical car5 = new Vehical("Toyota","innova", 5);
		
//		Vehical car6 = new Vehical();
//		car6.initValues("Hero","Honda", 30);
		
		//System.out.println(car1.brandName + " " + car1.carName +  " " + car1.mileage);*/

	}

}
