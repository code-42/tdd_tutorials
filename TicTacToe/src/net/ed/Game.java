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

	public enum Winner{
		Zeroes,
		Crosses,
		Draw, 
		GameIsUnfinished
	}
	
	public Winner getWinner() {
		
		int[] winners = {1,4,7,
						 2,5,8,
						 3,6,9,
						 1,2,3,
						 4,5,6,
						 7,8,9,
						 1,5,9,
						 3,5,7};
		
		return getWinner(winners);
		
	}
	
	public Winner getWinner(int[] indexes) {
		
		for(int i = 0; i < indexes.length; i+=3) {
			boolean same = AreSame(indexes[i],
								indexes[i+1],
								indexes[i+2]);
			
			if (same) {
				State state = getState(indexes[i]);
				if(state != State.Unset)
					return state == State.Cross ? Winner.Crosses : Winner.Zeroes;
			}
			
		}
		
		if(movesCounter < 9)
			return Winner.GameIsUnfinished;
		
		return Winner.Draw;
		
	}

	private boolean AreSame(int a, int b, int c) {
		
		return getState(a) == getState(b) && getState(a) == getState(c);
	}


}
