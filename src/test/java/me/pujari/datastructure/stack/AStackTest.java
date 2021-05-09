package me.pujari.datastructure.stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AStackTest {

	@Test
	void test() {
		IStack<Integer> stack = new AStack(15);
		stack.push(10).push(20);
		assertEquals(20, stack.peek());
		stack.push(30).push(40).push(50);
		assertEquals(50, stack.pop());
		assertEquals(40, stack.peek());
	}

}
