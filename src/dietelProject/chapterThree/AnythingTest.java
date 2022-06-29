package dietelProject.chapterThree;

import java.util.Scanner;

public class AnythingTest {
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	Anything myAnything = new Anything();

	System.out.print("Enter a name: ");
	String myName = input.nextLine();
	myAnything.setName(myName);

	System.out.printf("Your name is %s", myAnything.getName());

	}
}