package net.ed;

// tutorial: https://www.youtube.com/watch?v=Xc3d6j8Rm_I

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringSwapperTest {

	@Test
	void testStringWith2CharsIsReversed() {

		StringSwapper swapper = new StringSwapper();
		
		assertEquals("BA", swapper.swapLast2Chars("AB"));
	}

}
