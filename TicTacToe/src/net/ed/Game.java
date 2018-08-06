package net.ed;

public class Game {

	public int movesCounter = 0;
	
	public Game() {	}

	public int getMovesCounter() {
		return movesCounter;
	}

	private void setMovesCounter(int movesCounter) {
		movesCounter = movesCounter;
	}

	public void makeMove(int index) {
		// TODO Auto-generated method stub
		if(index < 1 || index > 9)
			throw new IndexOutOfBoundsException();
		movesCounter++;
		
	}
	
	


}
