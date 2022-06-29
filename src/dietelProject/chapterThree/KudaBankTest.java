import java.util.Scanner;


public class KudaBankTest {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	KudaBank Jerry = new KudaBank();

	
	System.out.println("Enter name: ");
	String theName = input.nextLine();
	Jerry.setacctName(theName);

	System.out.println("Enter Account Number: ");
	String theAcctNum = input.nextLine();
	Jerry.setacctNum(theAcctNum);

	System.out.println("Enter pin: ");
	String thePin = input.nextLine();
	Jerry.setPin(thePin);

	System.out.println("Enter deposit; ");
	double thedeposit = input.nextDouble();
	Jerry.setDeposit(thedeposit);
	
	System.out.printf("Your balance is %f", Jerry.getBalance());
	
	}

}