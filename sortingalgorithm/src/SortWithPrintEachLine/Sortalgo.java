package SortWithPrintEachLine;
import java.util.Arrays;

public class Sortalgo {

	public int[] sortieren(int[] unsortiert) {

		for (int i = 0; i < unsortiert.length; i++) {

			for (int j = 1; j < unsortiert.length; j++) {

				if (unsortiert[j - 1] > unsortiert[j]) {
					int temp = unsortiert[j - 1];
					unsortiert[j - 1] = unsortiert[j];
					unsortiert[j] = temp;

				}
			}

			System.out.printf("unsorted array after %d pass %s: %n", i + 1,Arrays.toString(unsortiert));

					
		}
		return unsortiert;
	}
}