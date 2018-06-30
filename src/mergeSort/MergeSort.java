package mergeSort;

public class MergeSort {
	
	// Methods
	public void merge(int array[], int left, int middle, int right) {

		int leftArraySize = middle - left + 1;
		int rightArraySize = right - middle;
		// create temporary arrays and copy data to them
		int leftTemp[] = new int[leftArraySize];
		int rightTemp[] = new int[rightArraySize];
		for (int i = 0; i < leftArraySize; i++) {
			leftTemp[i] = array[left + i];
		}
		for (int j = 0; j < rightArraySize; j++) {
			rightTemp[j] = array[middle + j + 1];
		}

		int sub1 = 0, sub2 = 0, merged = left;
		// merge the temporary arrays
		while (sub1 < leftArraySize && sub2 < rightArraySize) {
			if (leftTemp[sub1] <= rightTemp[sub2]) {
				array[merged] = leftTemp[sub1];
				sub1++;
			} else {
				array[merged] = rightTemp[sub2];
				sub2++;
			}
			merged++;
		}

		// the following loops act as a backup in case any values in sub-arrays one or two that were missed
		while (sub1 < leftArraySize) {
			array[merged] = leftTemp[sub1];
			sub1++;
			merged++;
		}
		while (sub2 < rightArraySize) {
			array[merged] = rightTemp[sub2];
			sub2++;
			merged++;
		}
	}

	public void mergeSort(int array[], int left, int right) {
		if (left < right) {
			int middle = (left + right) / 2; // finds the middle of the array to split
			mergeSort(array, left, middle); // sort left sub-array
			mergeSort(array, middle + 1, right); // sort right sub-array
			merge(array, left, middle, right); // merge the sorted halves
		}
	}

}