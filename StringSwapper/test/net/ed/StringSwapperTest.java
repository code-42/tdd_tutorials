package net.ed;

// tutorial: https://www.youtube.com/watch?v=Xc3d6j8Rm_I

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringSwapperTest {
	
	StringSwapper swapper = new StringSwapper();

	@Test
	void testSwap2Chars() {
		assertEquals("BA", swapper.swap2Chars("AB"));
	}
	
	@Test
	void testStringWith4Chars() {
		assertEquals("ABDC", swapper.swapLast2Chars("ABCD"));
	}

}
