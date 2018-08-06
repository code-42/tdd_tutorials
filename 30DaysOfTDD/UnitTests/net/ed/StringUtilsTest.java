package net.ed;

// tutorial https://www.telerik.com/blogs/30-days-of-tdd-day-three-your-first-test

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

	@Test
	void testShouldBeAbleToCountNumberOfLettersInSimpleSentence() {
		fail("Not yet implemented");

		String sentenceToScan = "TDD is awesome!";
		char characterToScanFor = 'e';
		int expectedResult = 2;
		StringUtils stringUtils = new StringUtils();
		
		int result = stringUtils.FindNumberOfOccurences(sentenceToScan, characterToScanFor);
		
	}

}
