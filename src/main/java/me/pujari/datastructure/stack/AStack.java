package me.pujari.datastructure.stack;

public class AStack implements IStack<Integer> {

	private Integer[] arrayStack;
	private Integer stackPointer;

	public AStack(int size) {
		this.arrayStack = new Integer[size];
		this.stackPointer = size;
	}

	@Override
	public IStack push(Integer value) {
		if (stackPointer > 0) {
			arrayStack[--stackPointer] = value;
		} else {
			System.err.println("Stack is full");
		}
		return this;
	}

	@Override
	public Integer pop() {
		Integer poppedValue = null;
		if (stackPointer < arrayStack.length) {
			poppedValue = arrayStack[stackPointer];
			stackPointer++;
		}
		return poppedValue;
	}

	@Override
	public Integer peek() {
		if (stackPointer < arrayStack.length) {
			return arrayStack[stackPointer];
		}
		return null;
	}

	@Override
	public void print() {
		System.out.println("======================================");
		for (int i = stackPointer; i < arrayStack.length; i++) {
			System.out.println("stack[" + i + "] = " + arrayStack[i]);
		}
		System.out.println("======================================");

	}

}
