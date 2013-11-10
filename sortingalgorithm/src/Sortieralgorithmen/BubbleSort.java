package Sortieralgorithmen;

public class BubbleSort {

	public static void main(String[] args) {
		
		int Werte[] = {6,2,8,1,4,5,7,9,3};
		
		int temp;
		
		System.out.print("Unsortierte Werte: \n");
		for(int i=0; i<Werte.length; i++){
			System.out.print(Werte[i]+" ");
		}
		System.out.println();
		
		boolean fertigGetauscht=false;
		while(fertigGetauscht==false){
			fertigGetauscht=true;
		
		for(int i=0; i<Werte.length-1; i++){
			if(Werte[i] > Werte[i+1]){
				temp = Werte [i+1];
				Werte [i+1] = Werte [i];
				Werte [i] = temp;
				fertigGetauscht=false;
			}
				
			}
		}
		System.out.print("Sortierte Werte: \n");
		for(int i=0; i<Werte.length; i++){
			System.out.print(Werte[i]+" ");
		}
	}

}
