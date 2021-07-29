////////// Instructions ///////////
///// Array /////
// Using an array of ten mixed up decimals, print all the numbers in a vertical column.  
// (Hint: Use a for loop) and then average the numbers.

public class ArrayOfNumbers {

	public static void main(String[] args) {

		double[] arrayOfDecimals = {4.7342,8.7134,3.598,9.8543,6.1234,2.9924,9.876,4.567,1.597,1.298};
		
		System.out.println("Print 10 decimals in a vertical column.");
		for (int i=0; i<10; i++) {
			System.out.println(arrayOfDecimals[i]);
		}
		
		double average = 0;
		for (int i=0; i<10; i++) {
			average += arrayOfDecimals[i];
		}
		average = average / (arrayOfDecimals.length);
		System.out.println("\nAverage of all 10 decimals is " + average + ".");
		
	}

}
