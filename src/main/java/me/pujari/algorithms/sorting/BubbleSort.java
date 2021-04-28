package me.pujari.algorithms.sorting;

public class BubbleSort implements ISorting {

	public Integer[] sort(Integer[] intArray) {
		for (int lastElementIndex = intArray.length - 1; lastElementIndex >= 0; lastElementIndex--) {
			for (int currentElementIndex = 0; currentElementIndex < lastElementIndex; currentElementIndex++) {
				int nextElementIndex = currentElementIndex + 1;
				if (intArray[currentElementIndex] > intArray[nextElementIndex]) {
					int temp = intArray[currentElementIndex];
					intArray[currentElementIndex] = intArray[nextElementIndex];
					intArray[nextElementIndex] = temp;
				}
			}
		}
		return intArray;
	}

}
