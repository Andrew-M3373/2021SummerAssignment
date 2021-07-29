////////// Instructions //////////
///// String /////
// Write a program that asks the user’s first and last name and then makes them a nickname using the 
// first two or three letters of the first name and the first two or three letters of the last name.
// Michael McGuire might come out as MiMcG, for example.
import java.util.Random;
import java.util.Scanner;

public class NicknameGenerator {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the nickname generator!\n"
				+ "Input your name, and we will automatically generate a nickname for you.\n");
			
		try {
			Thread.sleep(3000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Scanner firstNameInput = new Scanner(System.in);
		System.out.println("\nPlease enter your first name.");
		String firstName = firstNameInput.nextLine();
		
		Scanner lastNameInput = new Scanner(System.in);
		System.out.println("\nPlease enter your last name.");
		String lastName = lastNameInput.nextLine();
		
		// Generate random numbers for nickname generation
		Random fn = new Random();
		int low = 2;
		int high = 4;
		int firstNameRandom = fn.nextInt(high-low) + low;
		Random ln = new Random();
		int lastNameRandom = ln.nextInt(high-low) + low;
		
		// Print random numbers to verify 
		//System.out.println(firstNameRandom + " " + lastNameRandom);
		
		// Generate nickname
		System.out.println("\nA nickname for " + firstName + " " + lastName + " is "
				 + firstName.substring(0, firstNameRandom) + lastName.substring(0, lastNameRandom) + ".");
		
	}
}