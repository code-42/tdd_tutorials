package net.ed;

public class Game {
	
	// array provided by instructor
	public static int[] pins = new int[] {1,4,4,5,6,4,5,5,10,0,0,1,7,3,6,4,10,0,2,8,6};
	
	public static void Game() {}

	public static void main(String[] args) {
		
		Game game = new Game();
	}

	public static int getPins(int pin) {
		System.out.println("26. getPins == " + pin);
		return pin;
	}
	
}
