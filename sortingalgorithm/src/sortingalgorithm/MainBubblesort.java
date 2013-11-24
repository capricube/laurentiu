package sortingalgorithm;


public class MainBubblesort {

	public static void main(String[] args) {

		int[] unnums = new int[]{6, 2, 8, 1, 4, 5, 7, 9, 3};

		Bubblesort bs1 = new Bubblesort();
		Sortingalgorithm sa1 = new Bubblesort();

		bs1.printArray("Unsortierte Werte%n", unnums);

		int[] snums = sa1.sort(unnums);

		bs1.printArray("%n--- Einmal geht's noch ---%n", unnums);
		bs1.printArray("%nSortierte Werte%n", snums);
	}
}
