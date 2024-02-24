package com.codwaysolutions;
import java.util.*;
public class NumberGame {
static int maxAttempts = 5, countAttempt = 0;
	
	public static void main(String[] args) {
        NumberGame numberGame = new NumberGame();
		
		while(countAttempt < maxAttempts) {
			numberGame.matchNumber();
		}
	}
	
	public int matchNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter gueesed number to match with random number: ");
		int guessedNumber = sc.nextInt();
		int generatedNumber = generateRandomNumber(100);
	  	
		if (generatedNumber == guessedNumber) {
			System.out.println("Guess is Correct !!!");
			System.out.println("Your Score: (Attempts taken to guess correct number): "+ ++countAttempt);
			System.exit(0);
		} else if (guessedNumber > generatedNumber) {
			System.out.println("Guessed number is too High !");
		} else {
			System.out.println("Guessed number is too Low !");
		}
		System.out.println("Guessed number is: " + generatedNumber + " & Generated number is: " + guessedNumber);
		System.out.println("Attempt number: " + ++countAttempt);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		return countAttempt;
	}

	public int generateRandomNumber(int maxNumber) {
		Random random = new Random();
		return random.nextInt(maxNumber);
	}
}
