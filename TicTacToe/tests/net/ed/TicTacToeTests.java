package net.ed;

import org.junit.Assert;
import org.junit.Test;

public class TicTacToeTests {

	@Test
	public void testCreateGame_ZeroMoves() {

		Game game = new Game();
		Assert.assertEquals(0, game.movesCounter);
	}
	
	@Test
	public void testMakeMove_CounterShifts() {

		Game game = new Game();
		game.makeMove(1);
		Assert.assertEquals(1, game.movesCounter);
	}


}
