package demo;

public class BankAccount {

	String depositorName;
	int accountNumber;
	String typeOfAccount;
	int balanceInAccount;

	public void initialValues(String dName, int aNum, String tAcc, int bal) {
		depositorName = dName;
		accountNumber = aNum;
		typeOfAccount = tAcc;
		balanceInAccount = bal;

	}

	public void depositAmount(int accNum, int depAmt) {

		accountNumber = accNum;
		balanceInAccount = balanceInAccount + depAmt;
		System.out.println("Account number is = "+ accNum);
		System.out.println("New balance is = "+ balanceInAccount);

	}

	public void withdrawAmount(int accNum, int wAmt) {
		
		
		accountNumber = accNum;
		balanceInAccount = balanceInAccount - wAmt;
		System.out.println("Account number is = "+ accNum);
		System.out.println("Balance after withdraw is = "+ balanceInAccount);

	}

	public void displayNameBalance (String dName, int bal) 
	{

		System.out.println(" Depositor Name = " + dName);
		System.out.println("Account balance is = "+ bal);
		
		
	}
	

	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount();
		ba.initialValues("Anand", 123, "Savings", 10);
		
		ba.depositAmount(123, 20000);
		
		ba.withdrawAmount(123, 10000);
		
		ba.displayNameBalance( "Anand", 10010);
		


	}
	
}
