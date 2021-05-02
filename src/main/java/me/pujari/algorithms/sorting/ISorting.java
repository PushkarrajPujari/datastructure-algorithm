package me.pujari.algorithms.sorting;

import javax.naming.OperationNotSupportedException;

public interface ISorting {
	public default Integer[] sort(Integer[] intArray) throws OperationNotSupportedException {
		throw new OperationNotSupportedException();
	}

	public default void swap(Integer[] intArray, int currentElementIndex, int nextElementIndex) {
		int temp = intArray[currentElementIndex];
		intArray[currentElementIndex] = intArray[nextElementIndex];
		intArray[nextElementIndex] = temp;
	}
}
