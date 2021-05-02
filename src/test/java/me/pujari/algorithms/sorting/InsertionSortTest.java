package me.pujari.algorithms.sorting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import javax.naming.OperationNotSupportedException;

import org.junit.jupiter.api.Test;

import me.pujari.algorithms.sorting.ISorting;
import me.pujari.algorithms.sorting.InsertionSort;

class InsertionSortTest {

	@Test
	void test() {
		Integer[] intArray = { 10, 85, -74, 96, -85, 23, 78, 41, 56, 98 };
		Integer[] intAltArray = { 10, 85, -74, 96, -85, 23, 78, 41, 56, 98 };
		Integer[] duplicateIntArray = { 10, 85, -74, 96, -85, 23, 78, 41, 56, 98 };
		Arrays.sort(duplicateIntArray);
		ISorting insertionSort = new InsertionSort();
		try {
			assertArrayEquals(duplicateIntArray, insertionSort.sort(intArray));
			assertArrayEquals(duplicateIntArray, insertionSort.sortAlternative(intAltArray));
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
			fail("Exception = " + e.getMessage());
		}	}

}
