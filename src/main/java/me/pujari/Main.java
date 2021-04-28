package me.pujari;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.naming.OperationNotSupportedException;

import me.pujari.algorithms.sorting.BubbleSort;
import me.pujari.algorithms.sorting.ISorting;

public class Main {

	public static void main(String[] args) throws OperationNotSupportedException {
		Integer[] intArray = { 10, 85, -74, 96, -85, 23, 78, 41, 56, 98 };
		ISorting bubbleSort = new BubbleSort();
		System.out.println("Unsorted array looks like " + Arrays.toString(intArray));
		System.out.println("Sorted array looks like " + Arrays.toString(bubbleSort.sort(intArray)));
	}

}
