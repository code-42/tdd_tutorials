package net.ed;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;

// source: TDD Unit Tests in Java - Arrange, Act, Assert 
// https://www.youtube.com/watch?v=d1EAyR_NCOA

import org.junit.Test;

public class CalculatorTest {
	
	private static final long FIRST_NUMBER = 12345L;
	private static final long SECOND_NUMBER = 4567L;
	
	@Test
	public void addTwoNumbers() {
		
		Calculator calculator = new Calculator();
		
		long result = calculator.addTwoNumbers();
		
		Assert.assertThat(result, is(FIRST_NUMBER + SECOND_NUMBER));
	}

}
