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

		// test constructor
		Game game = new Game();
		assertNotNull(game);
	}
	
	@Test
	public void testPrintInputArray() {
		
		// loop through pins array 
		for(int pin : Game.pins) {
//			System.out.println(pin);
			int expected = pin;
			int actual = Game.getPins(pin);
			assertEquals(expected, actual);
		}
	}
	
	@Test
	public void testAddUpPinsArray() {
		
		// loop through pins array 
		for(int pin : Game.pins) {
//			System.out.println(pin);
			int expected = pin++;
			int actual = Game.getPins(pin);
			assertEquals(expected, actual);
		}
	}
	
}
