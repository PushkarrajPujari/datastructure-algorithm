package me.pujari.algorithms.sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;

import javax.naming.OperationNotSupportedException;

import org.junit.jupiter.api.Test;

public class ShellSortTest {
	@Test
	void test() {
		Integer[] intArray = { 10, 85, -74, 96, -85, 23, 78, 41, 56, 98 };
		Integer[] duplicateIntArray = { 10, 85, -74, 96, -85, 23, 78, 41, 56, 98 };
		Arrays.sort(duplicateIntArray);
		ISorting selectionSort = new ShellSort();
		try {
			assertArrayEquals(duplicateIntArray, selectionSort.sort(intArray));
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
			fail("Exception = " + e.getMessage());
		}
	}

}
