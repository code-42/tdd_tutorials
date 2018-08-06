package net.ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


class StackTests {

	@Test
	void IsEmpty_EmptyStack_ReturnsTrue() {

		MyStack stack = new MyStack();
		stack.isEmpty = true;
		Assert.assertTrue(stack.isEmpty);
	}

}
