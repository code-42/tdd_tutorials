package net.ed;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StackTests {

	@Test
	void IsEmpty_EmptyStack_ReturnsTrue() {

		MyStack<Integer> stack = new MyStack<Integer>();
		
		Assert.assertTrue(stack.isEmpty);
	}

	@Test
	void Count_PushOneItem_ReturnsOne() {

		MyStack<Integer> stack = new MyStack<Integer>();
		stack.push(1);
		
		int expected = 1;
		int actual = stack.peek();
		
		Assert.assertEquals(expected, actual);
		Assert.assertFalse(stack.isEmpty);
	}
	
	@Test
	void Pop_EmptyStack_ThrowsException() {
		
		MyStack<Integer> stack = new MyStack<Integer>();
//		stack.push(1);
		System.out.println("34. " + stack.count);
		System.out.println("35. " + stack.isEmpty);
		Assertions.assertThrows(IllegalStateException.class, () -> stack.pop());
	}
	
	@Test
	public void Peek_PushTwoItems_ReturnsHeadItem() {
		
		MyStack<Integer> stack = new MyStack<Integer>();
		stack.push(1);
		stack.push(1);
		
		Assert.assertEquals(2, stack.peek());
	}

	@Test
	public void Peek_PushTwoItemsAndPop_ReturnsHeadElement() {
		
		MyStack<Integer> stack = new MyStack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.pop();
		
		Assert.assertEquals(1, stack.peek());
	}
}
