package client;

import java.util.Scanner;

import factoryClasses.ObjFactory;
import sortingInterFace.Isort;

public class Client {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,8,5,4,10,17,33,21,19,16};
		int ch;
		
		try(Scanner sc  = new Scanner(System.in);) {
			do {
				
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
