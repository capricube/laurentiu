package sortingalgorithm;
public class MainBubblesort {

	public static void main(String[] args) {

		int[] numbers = {6, 2, 8, 1, 4, 5, 7, 9, 3};

		Sortingalgorithm a = new Bubblesort();

		printArray("Unsortierte Werte%n", numbers);

		int[] sortnum = a.sort(numbers);

		printArray("%nEinmal gehts noch!!%n", numbers);
		printArray("%nSortierte Werte%n", sortnum);

	}

	public static void printArray(String title, int[] array) {

		System.out.printf(title);

		for (int z : array) {
			System.out.print(z + " ");
		}
	}
}
