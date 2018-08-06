package net.ed;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class ImmutableStackksTests {

	@Test
	void IsEmpty_EmptyStack_ReturnsTrue() {

		IStack<Integer> emptyStack = new ImmutableStack<Integer>().Empty;
		Assert.assertTrue(emptyStack.isEmpty);
	}

	@Test
	void Peek_EmptyStack_ThrowsException() {

		IStack<Integer> emptyStack = new ImmutableStack<Integer>().Empty;
		Assertions.assertThrows(IllegalStateException.class, () -> emptyStack.peek());
	}
	
	@Test
	void Pop_EmptyStack_ThrowsException() {

		IStack<Integer> emptyStack = new ImmutableStack<Integer>().Empty;
		Assertions.assertThrows(IllegalStateException.class, () -> emptyStack.pop());
	}
}
