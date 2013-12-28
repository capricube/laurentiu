

public class MainBubblesort {

	public static void main(String[] args) {

		int numbers[] = { 6, 2, 8, 1, 4, 5, 7, 9, 3 };

		ISortAlgo b = new Bubblesort();

		Michael("Unsortierte Werte ", numbers);
		System.out.println("\n ");

		b.lorenz(numbers);

		Michael("Sortierte Werte", numbers);

	}

	public static void Michael(String name, int[] array) {

		System.out.println(name);

		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}