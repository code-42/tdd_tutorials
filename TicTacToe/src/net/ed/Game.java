package net.ed;

public class Game {

	public int movesCounter = 0;
	private State[] board = new State[9];
	
	public Game() {
		for (int i = 0; i < board.length; i++) {
			board[i] = State.Unset;
		}
	}

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
		
		if(getState(index) != State.Unset)
			throw new UnsupportedOperationException();
		
		board[index - 1] = movesCounter % 2 == 0 ? State.Cross : State.Zero;
		
		movesCounter++;
		
	}

	State getState(int index) {
		// TODO Auto-generated method stub
		return board[index - 1];
	}
	
	


}
