package sortingalgorithm;

public class BubbleSort
{
    public static void main(String[] args)
    {
        int numbers[] = new int[] { 6, 2, 8, 1, 4, 5, 7, 9, 3 };

        System.out.print("Unsortierte Werte: \n");
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + " ");
        }
        // TODO instanziere die Bubblesort Klasse und starte die Algorithmus indem du der sort methode das array übergibst.
        // das Ergebnis der sort Methode ist dar sortierte array.
        // FIXME --> du rufst nur eine andere Method auf; du hast keine Instanz erzeugt!
        // eine neue Instanz erzeugt man mit new BubbleSort() usw.
        // TODO was ist eine Instanz einer Klasse?
        bubbleSort(numbers);

        // FIXME code duplication: entferne doppelten code
        // +++ Ich bin mir nicht sicher ob ich das mit dem doppelten code richtig verstanden habe +++
        // du hast code entfernt (habe ich wiederhergestellt): zuvor hast du die unsortierten und sortierten werte ausgegeben.
        // wenn du dir den code ansiehst solltest du feststellen, dass der code gleich ist -> das nennt man code duplication
        // das ist deswegen so schlecht, weil wenn du an der Ausgabe was ändern möchtest, musst du es an mindestens 2 stellen ändern
        // deshalb kapselt wann diese funktionen in wiederverwendbaren methoden. http://en.wikipedia.org/wiki/Duplicate_code
        // TODO wie könnte so eine Methode aussehen
        System.out.print("Sortierte Werte: \n");
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + " ");
        }
    }

    // TODO: wenn die punkte davor erledigt sind: wozu kann man ein java interface verwenden?
    public static void bubbleSort(int[] numbers)
    {

        int temp;

        boolean fertigGetauscht = false;
        while (fertigGetauscht == false)
        {
            fertigGetauscht = true;

            for (int i = 0; i < numbers.length - 1; i++)
            {
                if (numbers[i] > numbers[i + 1])
                {
                    temp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = temp;
                    fertigGetauscht = false;
                }
            }
        }
    }
}
