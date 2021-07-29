////////// Instructions ////////// 
///// For Loop /////
// Using only two System.out.println statements total, print out the numbers 1 to 10 vertically 
// (one number per line) and then print them out 10 backwards to 1 vertically.

public class PrintWithForLoop {

	public static void main(String[] args) {

		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		for (int i = 10; i>=1; i--) {
			System.out.println(i);
		}
		
	}
	
}
