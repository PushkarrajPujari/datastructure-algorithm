/**
 * 
 */
package me.pujari.algorithms.sorting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

/**
 * @author PushkarrajPujari
 *
 */
class BubbleSortTest {

	@Test
	void test() {
		Integer[] intArray = { 10, 85, -74, 96, -85, 23, 78, 41, 56, 98 };
		Integer[] duplicateIntArray = { 10, 85, -74, 96, -85, 23, 78, 41, 56, 98 };
		Arrays.sort(duplicateIntArray);
		ISorting bubbleSort = new BubbleSort();
		assertArrayEquals(duplicateIntArray, bubbleSort.sort(intArray));
	}

}
