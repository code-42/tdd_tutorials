package net.ed;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralsTest {

	@Test
	public void testRoman() {
		
		Assert.assertEquals(1,  Roman.Parse("I"));
		Assert.assertEquals(2,  Roman.Parse("II"));
		Assert.assertEquals(20,  Roman.Parse("XX"));
		Assert.assertEquals(10,  Roman.Parse("X"));
		Assert.assertEquals(4,  Roman.Parse("IV"));

	}

}
