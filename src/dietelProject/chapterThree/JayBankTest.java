import java.util.Scanner;


public class JayBankTest {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	JayBank account1 = new JayBank("Jerry", 0);
	JayBank account2 = new JayBank("Hadiza", 0);

	System.out.printf("%s initial balance is N%.2f%n", account1.getName(), account1.getBalance());
	System.out.printf("%s initial balance is N%.2f%n", account2.getName(), account2.getBalance());
	
	System.out.printf("%nEnter deposit amount for %s: ", account1.getName());
	double myDeposit = input.nextDouble();
	account1.deposit(myDeposit);

	System.out.printf("%s current balance is N%.2f%n", account1.getName(), account1.getBalance());

	System.out.printf("%nEnter deposit amount for %s: ", account2.getName());
	double myDeposit2 = input.nextDouble();
	account2.deposit(myDeposit2);

	System.out.printf("%s current balance is N%.2f", account2.getName(), account2.getBalance());

	} 
	
}