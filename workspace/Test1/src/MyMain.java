
public class MyMain
{

	
	public static void main(String[] args)
	{
		int[] unnums = new int[]{6, 2, 8, 1, 4, 5, 7, 9, 3};
		
		

		Salgo a = new WhatsUp();
		WhatsUp b1 = new WhatsUp();
		
		
		int [] sort0 = a.sorting(unnums);
		int [] sort1 = a.sorting(unnums);
		int [] sort2 = a.sorting(unnums);
		
		b1.printArray("Erstes%n", sort0);
		b1.printArray("%nZweites%n", sort1);
		b1.printArray("%nDrittes%n", sort2);
		
		System.out.println("\nDer counter hat nun den Wert:" + b1.getCounter());
	
		
	}

}
