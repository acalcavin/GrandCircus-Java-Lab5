/*
 * Andrew Calabro-Cavin
 * Create an application that simulates dice rolling.
 * Add special messages for craps, snake eyes, and box cars.
 */

import java.util.Scanner;

public class RollingDiceWithMessage {

	public static void main(String[] args) {

		// ask user to enter number of sides for pair of dice
		// prompt user to roll the dice
		// "roll" two n-sided dice, display the results of each
		// ask user if she wants to roll again
		// Deliver special message for:
		// two 1's = snake eyes
		// two sixes = Box Cars
		// craps = add up to 7 or 11

		int numSides;
		int roll1;
		int roll2;
		String cont = "y";

		Scanner scnr = new Scanner(System.in);

		System.out.println("Welcome to the Grand Circus Casino!\n");

		while (cont.equalsIgnoreCase("y")) { // as long as cont is y, will exec. at least once

			System.out.println("How many sides should each die have?");
			numSides = scnr.nextInt();
			String capture = scnr.nextLine();

			System.out.println("Roll 1:");

			roll1 = rollDice(numSides);
			roll2 = rollDice(numSides);
			
			System.out.println(roll1);
			System.out.println(roll2);

			if ((roll1 == 1) && (roll2 == 1)) {
				System.out.println("Snake Eyes!");
			}
			if ((roll1 + roll2) == 7) {
				System.out.println("craps!");
			}
			if ((roll1 + roll2) == 11) {
				System.out.println("craps!");
			}
			if ((roll1 == 6) && (roll2 == 6)) {
				System.out.println("Box cars!");
			}

			System.out.println("Roll again? (y/n)");
			cont = scnr.nextLine();
			
			// TODO: validate for y/n answer
			/*
			 * while (!cont.equalsIgnoreCase("y") || !cont.equalsIgnoreCase("n")) {
			 * System.out.println("Not a valid entry, please type 'y' or 'n'"); }
			 */

		}
		// let the user know the program has closed
		System.out.println("Thanks for playing!");

		scnr.close();
	}

	public static int rollDice(int numPassed) {

		int diceNumber = (int) (Math.random() * numPassed);
		return diceNumber + 1;
	}

	/*
	 * public static String giveMessage(String word) {
	 * 
	 * String specialMessage;
	 * if ((roll1 == 1) && (roll2 == 1)) { 
	 * specialMessage = "Snake Eyes!"; 
	 * }
	 * 
	 * 
	 * return specialMessage;
	 */
}
