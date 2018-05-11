package factoryClasses;

import sortingClasses.BubbleSort;
import sortingClasses.InsertionSort;
import sortingClasses.MergeSort;
import sortingClasses.QuickSort;
import sortingInterFace.Isort;

public class ObjFactory {
	private int choice;

	public ObjFactory(int choice) {
		this.choice = choice;
	}

	public Isort ObjectCreation() {

		do {
			
			
			switch (choice) {
			case 1:
				return new BubbleSort();
			case 2:
				return new QuickSort();
			case 3:
				return new MergeSort();
			case 4:
				return new InsertionSort();
			case 0:
				return null;
			default:
				System.out.println("you entered wrong please give proper choice ");
				break;
			}
		} while (choice != 0);

		return null;

	}

}
