package demo;

public class DoubleArray {

	public static void main(String[] args) {
		
		
		
		int empid[][]={  
		        {1,2,3,5} ,
		        {5,6,7,6} 
		        
		      };


for (int row = 0; row < empid.length; row++) {
	

	
	for (int cols = 0; cols < empid[row].length; cols++) {
		
	System.out.print("  empid["+row+"]["+cols+"] ="+empid[row][cols]);
	}
	
	System.out.println();
}


//way2 : 
 int expval=50;
 
	int empsal[][]=new int[3][3];
	
          empsal[0][0] =10;  empsal[0][1] =20;  empsal[0][2] =30;
		  empsal[1][0] =40;  empsal[1][1] =50;  empsal[1][2] =60;
		  empsal[2][0] =70;  empsal[2][1] =80;  empsal[2][2] =90;

for (int row = 0; row < empsal.length; row++) {
	
	
	for (int cols = 0; cols < empsal[row].length; cols++) {
		
		System.out.print("  empsal["+row+"]["+cols+"] ="+empsal[row][cols]);
	}
	
	System.out.println();
}



	}

}
