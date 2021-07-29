////////// Instructions //////////
///// Input ///// 
// Write a program that asks for the temperature in Fahrenheit and converts it to Celsius.  
// The output should be a whole sentence such as:  212.0 degrees in Fahrenheit is equal to 100.0 degrees Celsius.

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the temperature conversion tool!\n"
			+ "Convert any temperature in degrees Fahrenheit to degrees Celsius.\n"
			+ "The converted value will be rounded to 3 decimal places.");
		
		try {
			Thread.sleep(3000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		Scanner degFInput = new Scanner(System.in);
		System.out.println("\nPlease enter your temperature to convert in degrees Fahrenheit. "
				+ "Do not include units.");
		double degF = degFInput.nextDouble();
		
		double degC = (degF - 32.0) * (5.0/9.0);
		
		System.out.printf("\n" + degF + " degrees Fahrenheit equals %.3f degrees Celsius.", degC);
				
	}

}
