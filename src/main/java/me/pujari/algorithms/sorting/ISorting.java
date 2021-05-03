package me.pujari.algorithms.sorting;

import javax.naming.OperationNotSupportedException;

public interface ISorting<T> {
	public default T[] sort(T[] tArray) throws OperationNotSupportedException {
		throw new OperationNotSupportedException();
	}

	public default T[] sortAlternative(T[] tArray) throws OperationNotSupportedException {
		throw new OperationNotSupportedException();
	}

	public default void swap(T[] intArray, int currentElementIndex, int nextElementIndex) {
		T temp = intArray[currentElementIndex];
		intArray[currentElementIndex] = intArray[nextElementIndex];
		intArray[nextElementIndex] = temp;
	}
}
