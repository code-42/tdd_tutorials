package net.ed;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TicTacToeTests {
	
	@Test
	public void testCreateGame_ZeroMoves() {
		
		Game game = new Game();
		Assert.assertEquals(0, game.movesCounter);
	}
	
	@Test
	public void testCreateGame_GameIsInCorrectState() {
		
		Game game = new Game();
		Assert.assertEquals(State.Unset, game.getState(1));
	}
	
	@Test
	public void testMakeMove_CounterShifts() {

		Game game = new Game();
		game.makeMove(1);
		Assert.assertEquals(1, game.movesCounter);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testMakeInvalidMove_ThrowsException() {

		Game game = new Game();
		game.makeMove(11);
		Assert.assertEquals(11, game.movesCounter);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testMakeInvalidMove_ThrowsUnsupportedOperationException() {

		Game game = new Game();
		game.makeMove(1);
		game.makeMove(1);
		
	}
	
	@Test
	public void testMakingMoves_SetStateCorrectly() {
		Game game = new Game();
		game.makeMove(1);
		game.makeMove(2);
		game.makeMove(3);
		game.makeMove(4);
		
		Assert.assertEquals(State.Cross, game.getState(1));
		Assert.assertEquals(State.Zero, game.getState(2));
		Assert.assertEquals(State.Cross, game.getState(3));
		Assert.assertEquals(State.Zero, game.getState(4));
		
	}

	
}
