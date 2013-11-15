package bsort;

public class MainBubblesort {

	public static void main(String[] args) {

		int[] numbers = { 6, 2, 8, 1, 4, 5, 7, 9, 3 };

		ISortAlgo a = new Bubblesort();

		// FIXME code duplication: parametrisiere die printArray methode (Tipp:
		// String für Überschrift)
		printArray("Unsortierte Werte ",numbers);
		// TODO: was passiert wenn ich die selbe instanz zweimal aufrufe; mit
		// number oder random?
		a.isortalgo(numbers);
		
		// FIXME code duplication
		
		System.out.println();
		printArray("Sortierte Werte",numbers);
	

		// TODO erkläre den Unterschied zwischen Integer v = new Integer(2);
		// und int i = 2.

	}


	public static void printArray(String title, int[] array) {
		// TODO verwende einen for-in loop/ enhanced loop
		// welchen vorteil hat dieser gegenüber dieser variante?
	
		System.out.println(title);
		
		for (int z : array) {
			System.out.print(z);
		}
		
		
	}
}