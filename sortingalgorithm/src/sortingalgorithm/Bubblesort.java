package sortingalgorithm;
public class Bubblesort {

	public void bubbleSort(int[] values) {

		boolean switched = true;

		for (int i = 0; i < values.length && switched; i++) {
			switched = false;
			for (int j = 1; j < values.length; j++) {
				if (values[j] < values[j - 1]) {
					int temp = values[j];
					values[j] = values[j - 1];
					values[j - 1] = temp;
					switched = true;
				}
			}
		}
	}
}
