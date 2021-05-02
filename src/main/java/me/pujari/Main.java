package me.pujari;

import java.util.Arrays;

import javax.naming.OperationNotSupportedException;

import me.pujari.algorithms.sorting.ISorting;
import me.pujari.algorithms.sorting.SelectionSort;

public class Main {

	public static void main(String[] args) throws OperationNotSupportedException {
		Integer[] intArray = { 10, 85, -74, 96, -85, 23, 78, 41, 56, 98 };
		ISorting selectionSort = new SelectionSort();
		System.out.println("Unsorted array looks like " + Arrays.toString(intArray));
		System.out.println("Sorted array looks like " + Arrays.toString(selectionSort.sort(intArray)));
	}

}
