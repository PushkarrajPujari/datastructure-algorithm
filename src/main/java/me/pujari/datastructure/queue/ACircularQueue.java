package me.pujari.datastructure.queue;

public class ACircularQueue implements IQueue<Integer> {

	private Integer[] intArray;
	private int headPointer;
	private int tailPointer;

	public ACircularQueue(int size) {
		this.intArray = new Integer[size];
		this.headPointer = 0;
		this.tailPointer = 0;
	}

	@Override
	public IQueue<Integer> enqueue(Integer e) {
		if (!(tailPointer < headPointer) && tailPointer < intArray.length) {
			intArray[tailPointer++] = e;
		} else if (headPointer > 0 || tailPointer < headPointer) {
			if (tailPointer == intArray.length) {
				tailPointer = 0;
			}
			intArray[tailPointer] = e;
			if ((tailPointer + 1) < headPointer) {
				tailPointer++;
			} else {
				/**
				 * Resize
				 */
				System.out.println("Queue is full, Resizing queue");
				Integer[] newArray = new Integer[intArray.length + (intArray.length / 2)];
				System.arraycopy(intArray, headPointer, newArray, 0, intArray.length - headPointer);
				System.arraycopy(intArray, 0, newArray, intArray.length - headPointer, tailPointer + 1);
				tailPointer = intArray.length;
				headPointer = 0;
				intArray = newArray;
			}
		} else {
			/**
			 * Resize
			 */
			System.out.println("Queue is full, Resizing queue");
			Integer[] newArray = new Integer[intArray.length + (intArray.length / 2)];
			System.arraycopy(intArray, 0, newArray, 0, intArray.length);
			intArray = newArray;
			enqueue(e);
		}
		return this;
	}

	@Override
	public Integer dequeue() {
		Integer value = null;
		if (headPointer < intArray.length && headPointer != tailPointer) {
			value = intArray[headPointer++];
		} else if (headPointer > tailPointer) {
			if(headPointer == intArray.length) {
				headPointer = 0;
			}
			value = intArray[headPointer++];
		} else {
			System.out.println("Queue is empty");
			headPointer = 0;
			tailPointer = 0;
		}
		return value;
	}

}
