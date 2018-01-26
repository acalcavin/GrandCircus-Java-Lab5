/*
 * Andrew Calabro-Cavin
 * Create an application that simulates dice rolling.
 */

import java.util.Scanner;

public class RollingDice {

	public static void main(String[] args) {

		// ask user to enter number of sides for pair of dice
		// prompt user to roll the dice
		// "roll" two n-sided dice, display the results of each
		// ask user if she wants to roll again

		int numSides;
		String cont = "y";

		Scanner scnr = new Scanner(System.in);

		System.out.println("Welcome to the Grand Circus Casino!\n");

		while (cont.equalsIgnoreCase("y")) { // as long as cont is y, will exec. at least once

			System.out.println("How many sides should each die have?");
			numSides = scnr.nextInt();
			String capture = scnr.nextLine();

			System.out.println("Roll 1:");
			System.out.println(rollDice(numSides));
			System.out.println(rollDice(numSides));

			System.out.println("Roll again? (y/n)");
			cont = scnr.nextLine();
		}
		
		// let the user know the program has closed
		System.out.println("Thanks for playing!");

		scnr.close();
	}

	public static int rollDice(int numPassed) {

		int diceNumber = (int) (Math.random() * numPassed);
		return diceNumber + 1;
	}
	
}
