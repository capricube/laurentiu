
public class Test {

	void Bubblesort(int data[], int n) {
		
		int[] values = {6, 2, 8, 1, 4, 5, 7, 9, 3};

		int tmp, i, j;

		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n - i - 1; j++)
				if (data[j] > data[j + 1]) {
					tmp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = tmp;
				}
		}
		System.out.println(values);
	}
}
