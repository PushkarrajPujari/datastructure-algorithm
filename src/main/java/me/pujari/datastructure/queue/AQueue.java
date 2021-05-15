package me.pujari.datastructure.queue;

public class AQueue implements IQueue<Integer> {

	private Integer[] intArray;
	private int headPointer;
	private int tailPointer;

	public AQueue(int size) {
		this.intArray = new Integer[size];
		this.headPointer = 0;
		this.tailPointer = 0;
	}

	@Override
	public IQueue<Integer> enqueue(Integer e) {
		if (tailPointer < intArray.length - 1) {
			intArray[tailPointer++] = e;
		} else {
			System.out.println("Queue is full");
		}
		return this;
	}

	@Override
	public Integer dequeue() {
		Integer value = null;
		if (headPointer < tailPointer) {
			value = intArray[headPointer++];
			if (headPointer >= tailPointer) {
				headPointer = 0;
				tailPointer = 0;
			}
		} else {
			System.out.println("Queue is empty");
			headPointer = 0;
			tailPointer = 0;
		}
		return value;
	}

}
