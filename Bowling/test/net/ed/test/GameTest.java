package net.ed.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import net.ed.Game;

public class GameTest {
	
	private Game classUnderTest;

	@Before
	public void setUp() throws Exception {
		classUnderTest = new Game();
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testGame() {

		Game game = new Game();
		assertNotNull(game);
	}
}
