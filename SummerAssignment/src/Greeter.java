////////// Instructions //////////
///// If /////
// Write a program that greets the user by name and then asks them to make a choice between two options.  
// Respond differently to each choice.

import java.util.Scanner;

public class Greeter {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the greeter!\n");
			
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Scanner nameInput = new Scanner(System.in);
		System.out.println("\nWhat is your name?");
		String name = nameInput.nextLine();
		
		
		// Greeter
		System.out.printf("\nHello, %s! How has your day been today?\n1: Good\n2: Bad\n", name);
		Scanner responseInput = new Scanner(System.in);
		int response = responseInput.nextInt();
		
		if (response == 1) {
			System.out.println("\nThat's awesome! Have a great rest of your day, and make sure to do something fun!");
		}
		else if (response == 2) {
			System.out.println("\nWe all have bad days sometimes, I hope your day gets better though.");
		}
		else {
			System.out.println("Please respond only with integers 1 or 2.\nRun this program again.");
		}
		
	}

}
