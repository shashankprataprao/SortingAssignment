package sortingClasses;

import sortingInterFace.Isort;

public class BubbleSort implements Isort {

	@Override
	public void sort(int[] arr) {
		int temp = 0;
		System.out.println("From Bubble sort");
		
		for (int i = 0; i < arr.length; i++) {
	        for (int j = 1; j < (arr.length - i); j++) {
	            if (arr[j - 1] > arr[j]) {
	                temp = arr[j - 1];
	                arr[j - 1] = arr[j];
	                arr[j] = temp;
	            }

	        }
		}
		
		for (int i : arr) {
			System.out.print("  ,  "+i);
		}
		
	}

}
