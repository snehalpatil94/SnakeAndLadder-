package com.bridgelabz.snakeladder;

/**
 * Program for Player rolls the die to get a number between 1 to 6.
 * 
 * @author : Snehal Patil
 *
 */
public class SnakeLadder {

	// Initialise Start Position as Zero
	private int position = 0;

	/*
	 * In this method we are taking random no between 1 to 6 for rolling dice
	 */
	public int rollDice() {
		int dice = (int) (Math.random() * 10) % 6 + 1;
		return dice;
	}

	public static void main(String[] args) {
		SnakeLadder player1 = new SnakeLadder();
		System.out.println("Player 1 rolled dice value : " + player1.rollDice());
	}
}