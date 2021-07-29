////////// Instructions //////////
///// Array /////
// In a different program, use an array to hold the names of the months of the year.
// The user is asked to input the number of the month, and the program returns the name.
// Do not use a switch or if/else structure.
import java.util.Scanner;

public class ArrayOfMonths {

	public static void main(String[] args) {

		System.out.println("Type a month number and this program will return the name of that month. ");
		Scanner monthInput = new Scanner(System.in);
		int month = monthInput.nextInt();
		
		while (!(month>=1 && month<=12)) {
			System.out.println("The only accepted values are integers between 1 and 12.\nPlease try again.");
			month = monthInput.nextInt();
		}
		
		
		String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		
		System.out.printf("\nThe month name is %s.", months[month-1]);
		
	}

}
