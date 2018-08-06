package net.ed;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class ImmutableStacksTests {

	Integer head = null;
	
	@Test
	void IsEmpty_EmptyStack_ReturnsTrue() {

		
		IStack<Integer> emptyStack = new ImmutableStack<Integer>(head).Empty;
//		Integer emptyStack = ImmutableStack<Integer>.Empty;
		Assert.assertTrue(emptyStack.isEmpty);
	}

	@Test
	void Peek_EmptyStack_ThrowsException() {

		IStack<Integer> emptyStack = new ImmutableStack<Integer>(head).Empty;
		Assertions.assertThrows(IllegalStateException.class, () -> emptyStack.peek());
	}
	
	@Test
	void Pop_EmptyStack_ThrowsException() {

		IStack<Integer> emptyStack = new ImmutableStack<Integer>(head).Empty;
		Assertions.assertThrows(IllegalStateException.class, () -> emptyStack.pop());
	}
	
	@Test
	void PushOntoEmptyStackTwoItems_PeekOneElement_ReturnsCorrectValue() {

		IStack<Integer> stack = new ImmutableStack<Integer>(head).Empty;
		stack = stack.push(1);
		stack = stack.push(2);
		
		int actual = stack.peek();
		
		Assert.assertEquals(2, actual);
	}
	
	@Test
	void PushOntoEmptyStackOneItem_PopOneItem_ReturnsEmptyStack() {

		IStack<Integer> stack = new ImmutableStack<Integer>(head).Empty;
		stack = stack.push(1);
		
		IStack<Integer> actual = stack.pop();
		
		Assert.assertTrue(actual.isEmpty);
	}
	
}
