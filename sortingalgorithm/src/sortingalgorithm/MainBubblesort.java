package sortingalgorithm;

public class MainBubblesort {

	public static void main(String[] args) {

		int numbers[] = { 6, 2, 8, 1, 4, 5, 7, 9, 3 };

		Bubblesort b = new Bubblesort(); // neue instanz erzeugt

		System.out.print("Unsortierte Werte\n");
		printArray(numbers); // zuerst die Unsortierten Werte ausgeben

		System.out.print("\n"); // ich wusste nicht wie ich sonnst eine neue
								// zeile Anfange

		b.bubbleSort(numbers); // sortierten

		System.out.println("SortierteWerte");
		printArray(numbers); // sortierte Werte ausgeben

	}

	public static void printArray(int[] array) { // Methode erstellt um das
													// Ergebniss überall
													// ausgeben zu können und
													// duplication vermeiden!!

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}