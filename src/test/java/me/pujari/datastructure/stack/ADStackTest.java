package me.pujari.datastructure.stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ADStackTest {

	@Test
	void test() {
		IStack<Integer> stack = new ADStack();
		stack.push(10).push(20);
		assertEquals(20, stack.peek());
		stack.push(30).push(40).push(50);
		assertEquals(50, stack.pop());
		assertEquals(40, stack.peek());
		stack = new ADStack();
		for(int i = 0 ; i<50;i++) {
			stack.push(i);
		}
		assertEquals(49, stack.peek());
		assertEquals(49, stack.pop());
		assertEquals(48, stack.peek());
		stack.print();

	}

}
