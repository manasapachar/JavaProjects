package demo;

public class IdealWeightOfPerson {

	public IdealWeightOfPerson(double ht) { //parameterized constructor -- double ht -> parameter

		height = ht; //property initialization
	}

	/*
	 * public IdealWeightOfPerson() {
	 * 
	 * }
	 */

	double height; //property

	public void checkIdealWeight() { //method of the class
		
		//conditions based logic
		if (4 < height && height < 5) {
			System.out.println("Ideal weight of person is 55-60 kgs");
		} else if (5 < height && height < 6) {
			System.out.println("Ideal weight of person is 65-70 kgs kgs");
		} else if (6 < height && height < 6.5) {
			System.out.println("Ideal weight of person is 75-80 kgs kgs");
		} else {
			System.out.println("Ideal weight of person is unkown");

		}

	}

	public static void main(String[] args) {
		
		//creating objects
		//initializing objects with constructor call

		IdealWeightOfPerson person1 = new IdealWeightOfPerson(4.3);
		IdealWeightOfPerson person2 = new IdealWeightOfPerson(5.1);
		IdealWeightOfPerson person3 = new IdealWeightOfPerson(6.2);
		IdealWeightOfPerson person4 = new IdealWeightOfPerson(7.6);
		IdealWeightOfPerson person5 = new IdealWeightOfPerson(3.1);
		IdealWeightOfPerson person6 = new IdealWeightOfPerson(8.9);
		
		// IdealWeightOfPerson person7 = new IdealWeightOfPerson();
		
		//calling class method with objects - --- person1 is object, checkIdealWeight is a method 
		person1.checkIdealWeight();

		person2.checkIdealWeight();
		person3.checkIdealWeight();
		person4.checkIdealWeight();
		person5.checkIdealWeight();
		person6.checkIdealWeight();

		// person7.checkIdealWeight();

	}

}

/*
 * Height Weight 4-5 Feet 55-60Kg 5-6 Feet 65-72Kg 6-6.5 Feet 75-80Kg
 */
