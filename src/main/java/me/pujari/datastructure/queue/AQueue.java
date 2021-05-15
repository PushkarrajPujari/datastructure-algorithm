package me.pujari.datastructure.queue;

import java.util.Arrays;

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
		if (tailPointer < intArray.length) {
			intArray[tailPointer++] = e;
		} else {
			System.out.println("Queue is full, Resizing queue");
			Integer[] newArray = new Integer[intArray.length + (intArray.length/2)];
			
			System.arraycopy(intArray, 0, newArray, 0, intArray.length );
			intArray = newArray;
			enqueue(e);
		}
		return this;
	}

	@Override
	public Integer dequeue() {
		Integer value = null;
		if (headPointer < tailPointer) {
			value = intArray[headPointer];
			for(int i = headPointer;i<(tailPointer-1);i++) {
				intArray[i] = intArray[i+1];
			}
			tailPointer--;
		} else {
			System.out.println("Queue is empty");
			headPointer = 0;
			tailPointer = 0;
		}
		return value;
	}

}
