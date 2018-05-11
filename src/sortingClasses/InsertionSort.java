package sortingClasses;

import sortingInterFace.Isort;

public class InsertionSort implements Isort {

	@Override
	public void sort(int[] arr) {
		System.out.println("From Insertion sort");
		for (int i = 1; i < arr.length; i++) {
			int x = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > x) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = x;
		}
		
		
		for (int i : arr) {
			System.out.print("  ,  "+i);
		}
	}

}
