package mergeSort;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TestSort {

	public static void main(String[] args) {

		MergeSort testSort = new MergeSort();
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many numbers you wanna sort?");
		int numItems = input.nextInt();
		int[] array = new int[numItems];	
		for (int i = 0; i < numItems; i++) {
			int ranNum = ThreadLocalRandom.current().nextInt(0, 1000);
			array[i] = ranNum; //fills the array with the number of randomly generated values the user requested
		}
		
		//System.out.println("Your unsorted array is: ");		
		//System.out.println(Arrays.toString(array));
		Instant starts = Instant.now();
		testSort.mergeSort(array, 0, array.length - 1);
		Instant ends = Instant.now();
		//System.out.println("Your sorted array is: ");
		//System.out.println(Arrays.toString(array));
		System.out.println(Duration.between(starts, ends));

	}

}
