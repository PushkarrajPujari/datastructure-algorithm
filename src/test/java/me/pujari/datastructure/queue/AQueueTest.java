package me.pujari.datastructure.queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import me.pujari.datastructure.stack.AStack;
import me.pujari.datastructure.stack.IStack;

public class AQueueTest {
	@Test
	void test() {
		IQueue<Integer> queue= new AQueue(15);
		queue.enqueue(10).enqueue(20).enqueue(30);
		assertEquals(10, queue.dequeue());
		assertEquals(20, queue.dequeue());
		assertEquals(30, queue.dequeue());
		queue.enqueue(100).enqueue(200).enqueue(300);
		assertEquals(100, queue.dequeue());
		assertEquals(200, queue.dequeue());
		assertEquals(300, queue.dequeue());
		for(int i = 0;i<=15;i++) {
			queue.enqueue(i);
		}
		for(int i =0 ;i<15;i++) {
			assertEquals(i, queue.dequeue());
		}

	}
}
