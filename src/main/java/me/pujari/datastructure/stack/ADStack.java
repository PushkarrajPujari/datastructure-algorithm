package me.pujari.datastructure.stack;

public class ADStack implements IStack<Integer> {
	private Integer[] arrayStack;
	private Integer stackPointer;

	public ADStack() {
		this.arrayStack = new Integer[16];
		this.stackPointer = this.arrayStack.length;
	}

	@Override
	public IStack push(Integer value) {
		if (stackPointer > 0) {
			arrayStack[--stackPointer] = value;
		} else {
			System.out.println("Reached limit, resizing stack");
			Integer[] newArray = new Integer[arrayStack.length + (arrayStack.length / 2)];
			int diff = newArray.length - arrayStack.length;
			int newStackPointer = newArray.length;
			for (int i = arrayStack.length -1 ; i >= 0; i--) {
				newArray[i+diff] = arrayStack[i];
				newStackPointer = i+diff; 
			}
			this.arrayStack = newArray;
			this.stackPointer = newStackPointer;
			System.out.println("New stack size = "+ this.arrayStack.length);
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
