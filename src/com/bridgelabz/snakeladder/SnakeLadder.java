package com.bridgelabz.snakeladder;

/**
 * Java program to play the game with 2 Player. In this case if a Player gets a
 * Ladder then plays again.Finally report which Player won the game
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
	 * Playing with two players: Using ((RANDOM)) to check for Options.
	 * 
	 * Repeat till the Player reaches at exact winning position 100. In case the
	 * player position moves below 0, then the player restarts from 0 .
	 * 
	 * If any player reaches exact 100 position then stop the game and declare
	 * winner and print count of moves of both player
	 */

	public static void playerOption() {
		int player1_Position = 0;
		int player2_Position = 0;
		int player1_Counter = 0;
		int player2_Counter = 0;

		boolean flag = true;

		while ((player1_Position < 100) && (player2_Position < 100)) {

			int check = (int) (Math.random() * 10) % 3 + 1;
			System.out.println();
			System.out.println("Playing Option :" + check);

			switch (check) {
			case 1:
				if (flag) {
					System.out.println("player 1 is not playing ");
					System.out.println("player Reamain at position : " + player1_Position);
					flag = false;
				} else {
					System.out.println("player 2 is not playing ");
					System.out.println("player Reamain at position : " + player2_Position);
					flag = true;
				}
				System.out.println();
				break;

			case 2:
				int dice = rollDice();
				System.out.println("Dice : " + dice);
				if (flag) {

					player1_Position += dice;

					if (player1_Position > 100) {

						player1_Position -= dice;
					}
					System.out.println("The dice roll count of player 1 : " + player1_Counter);
					System.out.println();
					player1_Counter++;
					flag = false;

				} else {

					player2_Position += dice;

					if (player2_Position > 100) {

						player2_Position -= dice;
					}
					System.out.println("The dice roll count of player 2 : " + player1_Counter);
					System.out.println();
					player2_Counter++;
					flag = true;
				}
				break;

			default:

				int dice2 = rollDice();
				System.out.println("Dice : " + dice2);
				if (flag) {

					player1_Position -= dice2;

					if (player1_Position < 0) {

						player1_Position = 0;
					}
					System.out.println("The dice roll count of player 1 : " + player1_Counter);
					System.out.println();
					player1_Counter++;
					flag = false;
				} else {
					player2_Position -= dice2;

					if (player2_Position < 0) {

						player2_Position = 0;
					}
					System.out.println("The dice roll of player 2 : " + player1_Counter);
					System.out.println();
					player2_Counter++;
					flag = true;
				}
				break;
			}

			System.out.println("player 1 position is : " + player1_Position);
			System.out.println("player 2 position is : " + player2_Position);
			System.out.println();
		}

		if (player1_Position == 100) {
			System.out.println("Player1 is winner ");
			System.out.println("Total count of dice rolled by Player 1 to win a game : " + player1_Counter++);
			System.out.println("Total count of dice rolled by Player 2 in a game : " + player2_Counter++);
		} else {
			System.out.println("Player2 is Winner");
			System.out.println("Total count of dice rolled by Player 1 in a game : " + player1_Counter++);
			System.out.println("Total count of dice rolled by Player 2 to win a game : " + player2_Counter++);
		}

	}

	public static void main(String[] args) {
		System.out.println("Lets play...");
		playerOption();
	}
}