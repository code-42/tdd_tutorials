package net.ed;

public class Game {
	
	// array provided by instructor
	public static int[] scores = new int[] {1,4,4,5,6,4,5,5,10,0,0,1,7,3,6,4,10,0,2,8,6};
	public static int[] frames = new int[10];
	private static int MAXROLLS = 21;
	public static int[] rolls = new int[21];
	public static int currentRoll;
	
	// no-arg constructor
	public static void Game() {}
	

	public void gameInit() {
		
		for (int i = 0; i < MAXROLLS; i++)
	    {
	        rolls[i] = 0;
	    }
	    currentRoll = 0;		
	}

	public static void main(String[] args) {
		
		Game game = new Game();
	}

	public static int getPins(int pin) {
		return pin;
	}
	
	public static int sum = 0;
	public static int sumScoresArray(int score) {
		sum += score;
		return sum;
	}
	
	public static void roll(int pins) {
		
		rolls[currentRoll++] = pins;
	}

	public static void rollMany(int howManyRolls, int pins) {
		for (int i = 0; i < howManyRolls; i++) {
			roll(pins);
		}
		currentRoll = 0;
	}
	
	public static int gameScore() {
		
		int score = 0;
		int frameIndex = 0;
		
		for (int frame = 0; frame < 10; frame++) {
			if(isSpare(frameIndex)) {
				score += 10 + rolls[frameIndex + 2];
				frameIndex += 2;
			}
			else {
				score += rolls[frameIndex] + rolls[frameIndex + 1];
				frameIndex += 2;
			}
		}
		return score;
	}
	
	public static boolean isSpare(int frameIndex) {
		return rolls[frameIndex] + rolls[frameIndex + 1] == 10;
	}
}
