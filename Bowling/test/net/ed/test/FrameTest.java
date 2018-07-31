package net.ed.test;

import static org.junit.Assert.*;
//import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import net.ed.Frame;

public class FrameTest {
	
	private Frame classUnderTest;
	int pins[];
	

	@Before
	public void setUp() throws Exception {
		classUnderTest = new Frame();
	}

	@Test
	public void test() {
		
		for(int pin : pins) {
			System.out.println(pin);
		}
		
		int result = 5;
		assertEquals(result, classUnderTest.Throw(5));
	}

}
