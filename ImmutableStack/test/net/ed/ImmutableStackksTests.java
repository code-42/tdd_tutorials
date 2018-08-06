package net.ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import net.ed.ImmutableStack.EmptyStack;

class ImmutableStackksTests {

	@Test
	void IsEmpty_EmptyStack_ReturnsTrue() {

		IStack<Integer> emptyStack = new ImmutableStack<Integer>().Empty;
		Assert.assertTrue(emptyStack.isEmpty);
	}

}
