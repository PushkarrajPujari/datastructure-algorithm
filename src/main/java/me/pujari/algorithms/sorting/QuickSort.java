package me.pujari.algorithms.sorting;

public class QuickSort implements ISorting<Integer> {
	@Override
	public Integer[] sort(Integer[] intArray) {
		quickSort(intArray, 0, intArray.length);
		return intArray;
	}

	private void quickSort(Integer [] intArray, int start, int end) {
		if((end - start) < 2) {
			return;
		}
		int pivotal = partition(intArray, start, end);
		quickSort(intArray, start, pivotal);
		quickSort(intArray, pivotal + 1, end);

	}

	private int partition(Integer[] intArray, int start, int end) {
		int pivotal = intArray[start];
		while (start < end) {
			while (start < end && intArray[--end] >= pivotal);
			if (start < end) {
				intArray[start] = intArray[end];
			}
			while(start<end && intArray[++start] <= pivotal);
			if(start< end) {
				intArray[end] = intArray[start];
			}
		}
		intArray[end] = pivotal;
		return end;
	}

}
