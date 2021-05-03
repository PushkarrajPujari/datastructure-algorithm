package me.pujari.algorithms.sorting;

import java.util.Arrays;

public class InsertionSort implements ISorting<Integer> {
	
	@Override
	public Integer[] sort(Integer[] intArray) {
		for (int sortedIndex = 0; sortedIndex < intArray.length - 1; sortedIndex++) {
			if (intArray[sortedIndex] > intArray[sortedIndex + 1]) {
				int temp = intArray[sortedIndex + 1];
				for (int unsortedIndex = sortedIndex + 1; unsortedIndex > 0; unsortedIndex--) {
					if (temp < intArray[unsortedIndex - 1]) {
						intArray[unsortedIndex] = intArray[unsortedIndex - 1];
						if ((unsortedIndex - 1) == 0) {
							intArray[unsortedIndex - 1] = temp;
						}
					} else {
						intArray[unsortedIndex] = temp;
						break;
					}
				}
			}
		}
		return intArray;
	}

	@Override
	public Integer[] sortAlternative(Integer[] intArray) {
		for (int firstUnsortedPartision = 1; firstUnsortedPartision < intArray.length; firstUnsortedPartision++) {
			int temp = intArray[firstUnsortedPartision];
			int i;
			for (i = firstUnsortedPartision; i > 0 && intArray[i - 1] > temp; i--) {
				intArray[i] = intArray[i - 1];
			}
			intArray[i] = temp;
		}
		return intArray;
	}
}
