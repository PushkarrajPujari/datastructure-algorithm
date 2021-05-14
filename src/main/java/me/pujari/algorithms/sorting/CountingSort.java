package me.pujari.algorithms.sorting;

public class CountingSort implements ISorting<Integer> {
	@Override
	public Integer[] sort(Integer[] intArray) {
		/**
		 * Assumptions made are that the data will be between 1 to 10 inclusive
		 */
		int[] countingArray = new int[10];
		for (int i = 0; i < intArray.length; i++) {
			countingArray[intArray[i] - 1] += 1;
		}
		int index = 0;
		for (int i = 0; i < countingArray.length; i++) {
			for (int j = 0; j < countingArray[i]; j++) {
				intArray[index++] = i + 1;
			}
		}
		return intArray;
	}
}
