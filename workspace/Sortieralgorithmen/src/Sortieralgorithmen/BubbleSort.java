package Sortieralgorithmen;

public class BubbleSort
{

	public static void main(String[] args)
	{

		int numbers[] = {6, 2, 8, 1, 4, 5, 7, 9, 3};

		int temp;

		System.out.print("Unsortierte Werte: \n");
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.print(numbers[i] + " ");
		}
		System.out.println();

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
