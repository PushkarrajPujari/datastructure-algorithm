package me.pujari.algorithms.sorting;

public class SelectionSort implements ISorting {

	public Integer[] sort(Integer[] intArray) {
		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			int largestIntIndex = 0;
			for (int currentIndex = 1; currentIndex <= lastUnsortedIndex; currentIndex++) {
				if (intArray[currentIndex] > intArray[largestIntIndex]) {
					largestIntIndex = currentIndex;
				}
			}
			swap(intArray, largestIntIndex, lastUnsortedIndex);
		}
		return intArray;
	}
}
