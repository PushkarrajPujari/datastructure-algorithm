package me.pujari.algorithms.sorting;

public class MergeSort implements ISorting<Integer> {
	@Override
	public Integer[] sort(Integer[] intArray) {
		return divide(intArray, intArray.length);
	}

	public Integer[] divide(Integer[] intArray, int arrayLength) {
		if (arrayLength < 2) {
			return intArray;
		}
		int mid = arrayLength / 2;
		Integer[] leftArray = new Integer[mid];
		Integer[] rightArray = new Integer[arrayLength - mid];
		for (int i = 0; i < mid; i++) {
			leftArray[i] = intArray[i];
		}

		for (int i = mid; i < arrayLength; i++) {
			rightArray[i - mid] = intArray[i];
		}
		divide(leftArray, leftArray.length);
		divide(rightArray, arrayLength - mid);
		return merge(leftArray, rightArray, intArray);
	}

	public Integer[] merge(Integer[] leftArray, Integer[] rightArray, Integer[] intArray) {
		int leftSize = leftArray.length;
		int rightSize = rightArray.length;
		int leftCounter = 0;
		int rightCounter = 0;
		int mainCounter = 0;

		while (leftCounter < leftSize && rightCounter < rightSize) {
			if (leftArray[leftCounter] <= rightArray[rightCounter]) {
				intArray[mainCounter++] = leftArray[leftCounter++];
			} else {
				intArray[mainCounter++] = rightArray[rightCounter++];
			}
		}

		while (leftCounter < leftSize) {
			intArray[mainCounter++] = leftArray[leftCounter++];
		}

		while (rightCounter < rightSize) {
			intArray[mainCounter++] = rightArray[rightCounter++];
		}
		return intArray;
	}
}
