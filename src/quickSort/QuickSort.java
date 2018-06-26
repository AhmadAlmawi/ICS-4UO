package quickSort;

public class QuickSort {

	// Variables
	int left, right, pivot, temp;

	// Constructor
	public QuickSort() {
	}

	// Methods
	public void quickSort(int[] array, int lower, int upper) {
		if (array.length == 0 || lower == upper) { // doesn't execute the sort if the array is empty
		} else {
			pivot = array[lower + (upper - lower) / 2]; // sets the middle of the array as the pivot point
			left = lower;
			right = upper;
			while (left <= right) { // this loop swaps values to sort them relative to the pivot
				while (array[left] < pivot) {
					left++;
				}
				while (array[right] > pivot) {
					right--;
				}
				if (left <= right) {
					temp = array[left];
					array[left] = array[right];
					array[right] = temp;
					left++;
					right--;
				}
			}

			// perform quickSort recursively on the sublists
			if (lower < right) {
				quickSort(array, lower, right);
			} 
			if (left < upper) {
				quickSort(array, left, upper);
			}
		}
	}
}
