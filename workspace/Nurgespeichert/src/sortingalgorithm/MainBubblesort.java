package sortingalgorithm;

public class MainBubblesort {

	public static void main(String[] args) {

		int[] numbers = {6, 2, 8, 1, 4, 5, 7, 9, 3};

		Bubblesort bs1 = new Bubblesort();
		Sortingalgorithm sa1 = new Bubblesort();

		bs1.printArray("Unsortierte Werte%n", numbers);

		int[] sortnum = sa1.sort(numbers);

		bs1.printArray("%nEinmal geht's noch ---%n", numbers);
		bs1.printArray("%nSortierte Werte%n", sortnum);

	}

}
