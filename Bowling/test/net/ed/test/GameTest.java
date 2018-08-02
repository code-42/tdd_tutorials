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

	@Test
	public void testGameConstructor() {

		// test constructor
		Game game = new Game();
		assertNotNull(game);
	}
	
	@Test
	public void testGameInit() {
		
		// gameInit initializes rolls[] to all zeros
		int expected = 0;
		((Game) classUnderTest).gameInit();
		int actual = classUnderTest.rolls[0];
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPrintInputArray() {
		
		// loop through pins array 
		for(int score : Game.scores) {
			int expected = score;
			int actual = Game.getPins(score);
			assertEquals(expected, actual);
		}
	}
	
	@Test
	public void testSumScoresArray() {
		
		// loop through pins array 
		int expected = 0;
		for(int score : Game.scores) {
			expected += score;
			int actual = Game.sumScoresArray(score);
			assertEquals(expected, actual);
		}
	}
	
	@Test
	public void testSumFrames() {
		
		// loop through pins array 
		int expected = 0;
		for(int frame : Game.frames) {
			expected = 0;
			int actual = Game.frames[0];
			assertEquals(expected, actual);
		}
	}

	@Test
	public void testRoll() {
		
		// loop through rolls array 
		((Game) classUnderTest).gameInit();
		int expected = 0;
		for(int score : Game.scores) {
			expected = score;
			Game.roll(score);
			// need to decrement rolls[] index 
			// get the value in rolls[]
			int actual = Game.rolls[--Game.currentRoll];
			// now increment index to where the roll() method left it
			Game.currentRoll++;
			assertEquals(expected, actual);
		}
	}

	@Test
	public void testRollMany() {
		
		// loop through rolls array 
		((Game) classUnderTest).gameInit();
		int expected = 0;
		// for every element in the scores[] array
		for(int score : Game.scores) {
			expected = score;
			Game.rollMany(20, score);
			int actual = Game.rolls[Game.currentRoll];
			assertEquals(expected, actual);
		}
	}
}
