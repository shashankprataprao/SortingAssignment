package sortingClasses;

import sortingInterFace.Isort;

public class QuickSort implements Isort{

	@Override
	public void sort(int[] arr) {
		System.out.println("From Quick sort");
		int n = arr.length-1;
		
		QuickSort q = new QuickSort();
		q.mySort(arr,0,n);
		
		
		for (int i : arr) {
			System.out.print("  , "+i);
		}
		
		
		
	}
	
	
	public void mySort(int[] arr , int left , int right){
		int i = left;
		int j = right;
		
		int pivot = arr[(left+right)/2];
		
		while(i<=j)
		{
			while(arr[i]<pivot)
			i++;
			while(arr[j]>pivot)
				j--;
			
			if(i<=j)
			{
				int temp =arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		
		if(left<j)
			mySort(arr, left, j);
		if(i<right)
			mySort(arr, i, right);
	}
	
}