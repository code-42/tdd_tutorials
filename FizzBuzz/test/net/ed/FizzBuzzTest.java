package net.ed;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
	
	/**
	 * If divisible by 3		-> return "Fizz"
	 * If divisible by 5		-> return "Buzz"
	 * If divisible by 3 and 5  -> return "FizzBuzz"
	 * otherwise 				-> return ""
	 */

	@Test
	public void testFizzBuzz() {

		Assert.assertEquals("Fizz", FizzBuzz.FizzBuzz(3));
		Assert.assertEquals("Buzz", FizzBuzz.FizzBuzz(5));
		Assert.assertEquals("FizzBuzz", FizzBuzz.FizzBuzz(30));
		Assert.assertEquals("", FizzBuzz.FizzBuzz(151));
	}

}
