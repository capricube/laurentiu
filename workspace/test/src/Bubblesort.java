

// TODO Bubblesort muss das Sortinalgorithm interface implementieren; bitte die implementierung dementsprechend anpassen
// TODO anschlieﬂend weise dem interface die instanz zu (in MainBubblesort) und sortiere die Werte (und gib sie aus) 

public class Bubblesort implements ISortAlgo {

	
	public void lorenz(int[] values) {
		
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

	
	


		

	
