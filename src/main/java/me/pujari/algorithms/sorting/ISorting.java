package me.pujari.algorithms.sorting;

import javax.naming.OperationNotSupportedException;

public interface ISorting {
	public default Integer[] sort(Integer[] intArray) throws OperationNotSupportedException {
		throw new OperationNotSupportedException();
	}
}
