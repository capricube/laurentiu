package Sortieralgorithmen;
// TODO package namen müssen immer englisch sein; ebenso alle begriffe im code
// TODO formattiere den code mit dem code formatter in eclipse
public class BubbleSort {

	public static void main(String[] args) {
		
	    // TODO umbenennen
		int Werte[] = {6,2,8,1,4,5,7,9,3};
		
		int temp;
		
		// FIXME code duplication: entferne doppelten code; doppelter code bedeutet mehr arbeit und schlechtere wartbarkeit
		System.out.print("Unsortierte Werte: \n");
		for(int i=0; i<Werte.length; i++){
			System.out.print(Werte[i]+" ");
		}
		System.out.println();
		
		// TODO instanziere die Bubblesort Klasse und starte die Algorithmus indem du der sort methode das array übergibst. das Ergebnis der sort Methode ist dar sortierte array. 
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
		
        // FIXME code duplication: entferne doppelten code
		System.out.print("Sortierte Werte: \n");
		for(int i=0; i<Werte.length; i++){
			System.out.print(Werte[i]+" ");
		}
	}

}
