package sortingalgorithm;

public class Bubblesort implements Sortingalgorithm
{
	private static int counter = 0;

	@Override
	public int[] sort(int[] unsorted)
	{
		counter++;

		int[] sorted = new int[unsorted.length];
		for (int i = 0; i < sorted.length; i++)
		{
			sorted[i] = unsorted[i];
		}

		boolean switched = true;

		for (int i = 0; i < sorted.length && switched; i++)
		{
			switched = false;
			for (int j = 1; j < sorted.length; j++)
			{
				if (sorted[j] < sorted[j - 1])
				{
					int temp = sorted[j];
					sorted[j] = sorted[j - 1];
					sorted[j - 1] = temp;

					switched = true;

				}
			}
		}
		return sorted;

	}

	public static int count()
	{
		return counter;
	}

	public void printArray(String title, int[] array, String con)
	{

		System.out.printf(title);

		for (int z : array)
		{
			System.out.print(z + " ");
		}

		System.out.printf(con + "Counter:" + Bubblesort.count() + "%n");

	}

}
