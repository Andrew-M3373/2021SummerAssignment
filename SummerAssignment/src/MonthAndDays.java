////////// Instructions //////////
///// If Else If /////
// Write a program that makes use of both the switch structure and logical operators.


import java.util.Scanner;

public class MonthAndDays {

	public static void main(String[] args) {

		System.out.println("This program generates the number of days in a month when you provide the month number and year number.");
		
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Enter the month number here.");
		Scanner monthInput = new Scanner(System.in);
		int month = monthInput.nextInt();
		
		System.out.println("Enter the year here.");
		Scanner yearInput = new Scanner(System.in);
		int year = yearInput.nextInt();
		
		int numDays = 0;
		String monthName = "";
		
		switch (month) {
			case 1: 
				numDays = 31;
				monthName = "January";
				break;
			case 3:
				numDays = 31;
				monthName = "March";
				break;
			case 5:
				numDays = 31;
				monthName = "May";
				break;
			case 7: 
				numDays = 31;
				monthName = "July";
				break;
			case 8: 
				numDays = 31;
				monthName = "August";
				break;
			case 10:
				numDays = 31;
				monthName = "October";
				break;
			case 12:
				numDays = 31;
				monthName = "December";
				break;
			case 4: 
				numDays = 30;
				monthName = "April";
				break;
			case 6:
				numDays = 30;
				monthName = "June";
				break;
			case 9: 
				numDays = 30;
				monthName = "September";
				break;
			case 11:
				numDays = 30;
				monthName = "November";
				break;
			case 2:
				if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
					numDays = 29;
				}
				else {
					numDays = 28;
				}
				monthName = "February";
				break;
			default:
				System.out.println("Enter a month number only between 1 and 12.");
				break;
		}            
		
		System.out.printf("\nThere are %d days in %s %d.", numDays, monthName, year);
		
	}

}
