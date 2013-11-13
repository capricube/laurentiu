package sortingalgorithm;

public class MainBubblesort
{

    public static void main(String[] args)
    {

        int numbers[] = { 6, 2, 8, 1, 4, 5, 7, 9, 3 };
        int random[] = { 10, 20, 9, 50, 66, 81, 47, 36 };

        Bubblesort b = new Bubblesort(); // neue instanz erzeugt
        Bubblesort c = new Bubblesort();

        // FIXME code duplication: parametrisiere die printArray methode (Tipp: String für Überschrift)
        System.out.print("Unsortierte Werte\n");
        printArray(numbers);
        System.out.print("\n");

        // TODO: was passiert wenn ich die selbe instanz zweimal aufrufe; mit number und random?
        b.bubbleSort(numbers); // sortierten
        c.bubbleSort(random);

        // FIXME code duplication
        System.out.println("SortierteWerte");
        printArray(numbers);
        System.out.print("\n");
        
        // FIXME code duplication
        System.out.println("SortierteWerte");
        printArray(random);

        // TODO erkläre den Unterschied zwischen Integer v = new Integer(2); und int i = 2.
        
        
    }

    public static void printArray(int[] array)
    {
        // TODO verwende einen for-in loop/ enhanced loop
        //      welchen vorteil hat dieser gegenüber dieser variante?
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}