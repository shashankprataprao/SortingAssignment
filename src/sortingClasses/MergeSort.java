package sortingClasses;



import sortingInterFace.Isort;

public class MergeSort implements Isort {

	@Override
	public void sort(int[] arr) {
		System.out.println("From Merge sort");
		int l=0;
		int r = arr.length-1;
		mergeSort(arr, l, r);
		
		
		for (int i : arr) {
			System.out.print("  , "+i);
		}
	}

	public void mergeSort(int[] arr, int l, int r) {
		
		 if (l < r)
	        {
	          
	            int m = (l+r)/2;
	 
	           
	            mergeSort(arr, l, m);
	            mergeSort(arr , m+1, r);
	 
	           
	            merge(arr, l, m, r);
	        }
	}

	public void merge(int arr[], int l, int m, int r) {
		 
        int n1 = m - l + 1;
        int n2 = r - m;
 
   
      int L[] = new int [n1];
      int R[] = new int [n2];
      
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
 
 
      
        int i = 0, j = 0;
 
      
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
      
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
		
	}
	
}
