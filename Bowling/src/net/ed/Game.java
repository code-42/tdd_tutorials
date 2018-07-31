package net.ed;

public class Game {
	
	// array provided by instructor
	public static int[] pins = new int[] {1,4,4,5,6,4,5,5,10,0,0,1,7,3,6,4,10,0,2,8,6};
	
	public static void Game() {}

	public static void main(String[] args) {
		
		Game game = new Game();
		game.getPins(pins);
	}

	public static int getPins(int[] pins) {

		// loop through pins array 
		for(int pin : pins) {
			return pin;
		}
		return 0;
	}

	public static int getPins(int pin) {

		return pin;
	}
}
