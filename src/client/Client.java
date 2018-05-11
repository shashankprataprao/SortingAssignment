package client;

import java.util.Scanner;

import factoryClasses.ObjFactory;
import sortingInterFace.Isort;

public class Client {

	public static void main(String[] args) {
		
		
		
		//int[] arr = {1,2,3,4,8,5,4,10,17,33,21,19,16};
		int ch;
		
		try(Scanner sc  = new Scanner(System.in);) {
			do {
				System.out.println(" ");
				System.out.println("ENTER THE LENGTH OF ARRAY");
				System.out.print("length of array =");
				int n = sc.nextInt();
				int[] arr = new int[n];
				
				System.out.println("Now enter the elements of array with size :"+n);
				for (int i = 0 ; i < arr.length ; i++) {
					arr[i]=sc.nextInt();
					
				}
				
				System.out.println("your entered array is ");
				for (int i : arr) {
					System.out.print("   "+i);
				}
				
				
				
				System.out.println(" ");
				System.out.println("ENTER CHOICE");
				System.out.println("1.  by BUBBLE SORT");
				
				System.out.println("2.  by QUICK SORT");
				
				System.out.println("3.  by Merge Sort");
				
				System.out.println("4.  by Insertion Sort");
				
				System.out.println("0. FOR EXIT");
				
				ch = sc.nextInt();
				
				ObjFactory o = new ObjFactory(ch);
				Isort i = o.ObjectCreation();
				i.sort(arr);
				
			} while (ch!=0);
		} catch (Exception e) {
			System.out.println("Thanks......");
			
		}

		
		
		
		
	}

}
