package sortingalgorithm;

public class MainBubblesort
{

	public static void main(String[] args)
	{

		int[] unnums = new int[]{6, 2, 8, 1, 4, 5, 7, 9, 3};
		
		

		Bubblesort bs1 = new Bubblesort();
		Bubblesort bs2 = new Bubblesort();
		
		Sortingalgorithm sa1 = new Bubblesort();

		bs1.printArray("Unsortierte Werte%n",unnums, "%nDa noch nicht sortiert wurde ist der counter auf:" + bs2.count() + "%n");

		int[] snums = sa1.sort(unnums);
		int[] snums2 = sa1.sort(unnums);
		int[] snums3 = sa1.sort(unnums);
		int[] snums4 = sa1.sort(unnums);

		bs1.printArray("%n--- Einmal geht's noch ---%n", unnums,"%n");
		bs1.printArray("%nSortierte Werte%n", snums, "%nNun wurde bereits vier mal sortiert. Der counter steht daher auf:" + bs2.count());
		
		
		/*
		 * Nachdem ich l�ngere Zeit im Internet vergeblich nach einer L�sung gesucht habe, bin ich zu dem Schluss gekommen, dass ich die 
		 * eine als "final" declarierte variable nicht �ndern kann. Daher habe ich kurzerhand das "final" gel�scht und die Aufgabe auf eine etwas 
		 * andere Weise gel�st. 
		 * 
		 * Ich verstehe nur nicht so ganz warum ich die Bubblesort Klasse ein zweites mal instanzieren hab m�ssen. Ich kann den Wert der 
		 * "count" Variable auch mit der ersten instanzierung ausgeben.
		 */
	}
}
