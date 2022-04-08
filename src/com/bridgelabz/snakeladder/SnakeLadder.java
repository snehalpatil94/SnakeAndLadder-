package com.bridgelabz.snakeladder;

/**
 * Program to Ensure the player gets to exact winning position 100..
 * 
 * @author : Snehal Patil
 *
 */
public class SnakeLadder {
	/*
	 * In this method we are taking random no between 1 to 6 for rolling dice
	 */
	public static int rollDice() {
		int dice = (int) (Math.random() * 10) % 6 + 1;
		return dice;
	}

	/*
	 * Using ((RANDOM)) to check for Options.1 = no play & 2 = ladder & 0 = snake.
	 * 
	 * Repeat till the Player reaches at exact winning position 100. In case the
	 * player position moves below 0, then the player restarts from 0 .
	 * 
	 */
	public static void playerOption() {
		int position = 0;

		while (position < 100) {
			int check = (int) (Math.random() * 10) % 3 + 1;
			System.out.println();
			System.out.println("Playing Option :" + check);

			switch (check) {
			case 1:
				System.out.println("player is not playing ");
				System.out.println("Player remain at position : " + position);
				break;

			case 2:
				int dice = rollDice();
				System.out.println("Dice Rolled... " + dice);
				position = position + dice;
				System.out.println("Its Ladder....");
				if (position > 100) {
					position = position - dice;
				}
				System.out.println("player is playing at : " + position);
				break;

			default:
				int dice2 = rollDice();
				System.out.println("Dice Rolled.... " + dice2);
				position = position - dice2;
				System.out.println("Ohhhh....its Snake");
				if (position < 1) {
					position = 0;
				}
				System.out.println("player position : " + position);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Lets play...");
		playerOption();
	}
}