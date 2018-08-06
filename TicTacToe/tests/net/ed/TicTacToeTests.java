package net.ed;

import org.junit.Assert;
import org.junit.Test;

public class TicTacToeTests {

	@Test
	public void testCreateGame_ZeroMoves() {

		Game game = new Game();
		Assert.assertEquals(0, game.MovesCounter);
	}

}
