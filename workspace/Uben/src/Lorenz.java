public class Lorenz 
{

	private static String name;
	private static int age;

	public Lorenz(String n, int a)
	{
		name = n;
		age = a;
	}
	
	public static void print(String n, int a){
	
		name = n;
		age = a;
		
		System.out.println(n + a);
	}

}
