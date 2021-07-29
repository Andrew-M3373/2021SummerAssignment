////////// Instructions //////////
///// If Else Strings ///// 
// Write a program that has a secret number between 1 and 10.  Have the user guess the answer and then 
// report back to him or her whether the guess was too high, too low, or just right.
// Write a program that asks the user to make another choice based on typing in words (Strings).  
// Using the equals( ) method, respond to his or her choices differently.

// *** NOTE FROM ANDREW -- I thought it was more efficient to the response section in a while loop with equalsIgnoreCase(),
// so I just used the while loop instead of the equals() method in an If Else statement. 

import java.util.Scanner;

public class NumberGuessing {

	public static int correct;
	
	public static void main(String[] args) {
		
		String playAgain = "y";
		
		System.out.println("Welcome to the number guesser!\n");
		
		try {
			Thread.sleep(100);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		while (playAgain.equalsIgnoreCase("y")) {
			runGame();
			
			// Play again
			System.out.println("Would you like to play again? y/n\n");
			Scanner playAgainInput = new Scanner(System.in);
			//String clearInput = playAgainInput.nextLine();
			playAgain = playAgainInput.nextLine();
		}
		if (playAgain != "y") {
			System.out.println("Goodbye.");
		}
		
	}
	
	public static void runGame() {
		System.out.println("You have five guesses to guess the secret number between 1 and 10.");
		Scanner guessInput = new Scanner(System.in);
		
		
		// Create random number
		int random = (int)(Math.random()*10 + 1);
		
		int guesses = 0;
		for (int i=0; i <= 4; i++) {
			System.out.println("Guess a number.");
		
			int guess = guessInput.nextInt();
			
			if (guess < random) {
				System.out.println("Too low!");
			}
			else if (guess > random) {
				System.out.println("Too high!");
			}
			else if (guess == random) {
				System.out.println("Right on!");
				correct = 1;
				i = 5;
			}
			else {
				System.out.println("Please choose a number between 1 and 10.");
			}
			guesses ++;
		}
		
		if (correct == 0) {
			System.out.println("You're out of guesses! Better luck next time.");
		}
		else if (correct == 1) {
			System.out.printf("Congrats! You guessed the secret number in %d tries!\n", guesses);
		}
	}

}