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
	
	public static void roll(int pin) {
		
		rolls[currentRoll++] = pin;
	}

	public static void rollMany(int rolls, int pins) {
		for (int i = 0; i < rolls; i++) {
			roll(pins);
		}
	}
}
