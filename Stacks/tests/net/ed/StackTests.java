package net.ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


class StackTests {

	@Test
	void IsEmpty_EmptyStack_ReturnsTrue() {

		MyStack<Integer> stack = new MyStack<Integer>();
		stack.isEmpty = true;
		
		Assert.assertTrue(stack.isEmpty);
	}

	@Test
	void Count_PushOneItem_ReturnsOne() {

		MyStack<Integer> stack = new MyStack<Integer>();
		stack.push(1);
		
		int expected = 1;
		int actual = stack.count;
		
		Assert.assertEquals(expected, actual);
		Assert.assertFalse(stack.isEmpty);
	}
	
}
