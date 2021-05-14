package me.pujari.algorithms.sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;

import javax.naming.OperationNotSupportedException;

import org.junit.jupiter.api.Test;

public class CountingSortTest {
	@Test
	void test() {
		Integer[] intArray = { 7, 5, 3, 2, 1, 8, 3, 4, 8, 10};
		Integer[] duplicateIntArray = { 7, 5, 3, 2, 1, 8, 3, 4, 8, 10};
		Arrays.sort(duplicateIntArray);
		ISorting countingSort = new CountingSort();
		try {
			assertArrayEquals(duplicateIntArray, countingSort.sort(intArray));
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
			fail("Exception = " + e.getMessage());
		}
	}
}
