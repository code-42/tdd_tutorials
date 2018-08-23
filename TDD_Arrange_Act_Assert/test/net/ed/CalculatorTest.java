package net.ed;

//source: TDD Unit Tests in Java - Arrange, Act, Assert 
//https://www.youtube.com/watch?v=d1EAyR_NCOA

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;

import org.mockito.Mock;
import org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;

import org.junit.Assert;
import org.junit.Before;

import org.junit.Test;

public class CalculatorTest {
	
	private static final long FIRST_NUMBER = 12345L;
	private static final long SECOND_NUMBER = 4567L;
	
	@Mock
	private NumberSource numberSource;
	
	@Before
	public void beforeEachTest() {
		MockitoAnnotations.initMocks(this);
		
		when(numberSource.fetchNextNumber()).thenReturn(FIRST_NUMBER, SECOND_NUMBER);
	}
	
	@Test
	public void addTwoNumbers() {
		
		Calculator calculator = new Calculator(numberSource);
		
		long result = calculator.addTwoNumbers();
		
		Assert.assertThat(result, is(FIRST_NUMBER + SECOND_NUMBER));
	}

}
