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
		if(left<right)
		{
			int div = divide(arr,left,right);
			
			mySort(arr, left, div-1);
			mySort(arr, div+1, right);
			
		}
	}
	
	
public int divide(int[] arr , int left , int right)
{
	int pivot = arr[right]; 
    int i = (left-1); 
    for (int j=left; j<right; j++)
    {
        if (arr[j] <= pivot)
        {
            i++;

           
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    
    int temp = arr[i+1];
    arr[i+1] = arr[right];
    arr[right] = temp;

    return i+1;

}

}
