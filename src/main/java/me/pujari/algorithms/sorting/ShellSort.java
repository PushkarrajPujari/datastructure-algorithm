package me.pujari.algorithms.sorting;

public class ShellSort implements ISorting<Integer> {
	@Override
	public Integer[] sort(Integer[] intArray) {
		for (int gap = intArray.length / 2; gap > 0; gap /= 2) {
			for (int firstUnsortedPartision = gap; firstUnsortedPartision < intArray.length; firstUnsortedPartision++) {
				int temp = intArray[firstUnsortedPartision];
				int i;
				for (i = firstUnsortedPartision; i >= gap && intArray[i - 1] > temp; i--) {
					intArray[i] = intArray[i - 1];
				}
				intArray[i] = temp;
			}
		}

		return intArray;
	}
}
