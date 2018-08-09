package net.ed;

/**
 * tutorial https://www.telerik.com/blogs/30-days-of-tdd-day-three-your-first-test
 * 
 * Create a library method that takes in a sentence and a single character as parameters. 
 * The method should return a number that indicates how many times the character appears 
 * in the sentence.
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class StringUtilsTest {

	@Test
	void ShouldBeAbleToCountNumberOfLettersInSimpleSentence() {

		String sentenceToScan = "TDD is awesome!";
		char characterToScanFor = 'e';
		int expected = 2;
		StringUtils stringUtils = new StringUtils();
		
		int actual = stringUtils.FindNumberOfOccurences(sentenceToScan, characterToScanFor);
		
		Assert.assertEquals(expected, actual);
	}

    @Test
    public void ShouldBeAbleToCountNumberOfLettersInAComplexSentance()
    {
        String sentenceToScan = "Once is unique, twice is a coincidence, three times is a pattern.";
        char characterToScanFor = 'n';
        int expected = 5;
        StringUtils stringUtils = new StringUtils();

        int actual = stringUtils.FindNumberOfOccurences(sentenceToScan, characterToScanFor);

        Assert.assertEquals(expected, actual);
    }
    
    @Test
	void ShouldGetAnArgumentExceptionWhenCharacterToScanForIsLargerThanOneCharacter() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			throw new IllegalArgumentException("a message");
		});
		
		String sentenceToScan = "This test should throw an exception";
		String characterToScanFor = "xx";
		int expected = 0;
		StringUtils stringUtils = new StringUtils();
		
		int actual = stringUtils.FindNumberOfOccurences(sentenceToScan, characterToScanFor);

		Assert.assertEquals(expected, actual);
	}
    
    
}
