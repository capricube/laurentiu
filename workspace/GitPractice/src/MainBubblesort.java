

public class MainBubblesort
{

	public static void main(String[] args)
	{

		int[] unnums = new int[]{6, 2, 8, 1, 4, 5, 7, 9, 3};

		Bubblesort bs1 = new Bubblesort();
		Bubblesort bs2 = new Bubblesort();

		Sortingalgorithm sa1 = new Bubblesort();

		bs1.printArray("Unsortierte Werte%n", unnums,
				"%nEs wurde noch nicht sortiert daher --> ");

		int[] snums = sa1.sort(unnums);

		bs2.printArray("%n--- Einmal geht's noch ---%n", unnums,
				"%nNach der ersten Sortanwendung --> ");

		int[] snums2 = sa1.sort(unnums);

		bs2.printArray("%nSortierte Werte%n", snums2,
				"%nNach der zweiten Sortanwendung --> ");

		int[] snums3 = sa1.sort(unnums);

		bs2.printArray("%nSortierte Werte%n", snums3,
				"%nNach der dritten Sortanwendung --> ");

		int[] snums4 = sa1.sort(unnums);

		bs2.printArray("%nSortierte Werte%n", snums4,
				"%nNach der vierten Sortanwendung --> ");

	}
}
