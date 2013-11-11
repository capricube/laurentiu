package sortingalgorithm;
// TODO package namen müssen immer englisch sein; ebenso alle begriffe im code
// TODO formattiere den code mit dem code formatter in eclipse
public class BubbleSort {

	public static void main(String[] args) {
		
	    // TODO umbenennen 
		//++ DONE ++
		int numbers[]= new int[] {6,2,8,1,4,5,7,9,3};
		
		
		
		
		
		// TODO instanziere die Bubblesort Klasse und starte die Algorithmus indem du der sort methode das array übergibst. 
		//das Ergebnis der sort Methode ist dar sortierte array.
		// +++ DONE +++
		bubbleSort(numbers);
		
	

		
        // FIXME code duplication: entferne doppelten code
		// +++ Ich bin mir nicht sicher ob ich das mit dem doppelten code richtig verstanden habe +++
    for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+ " ");
    }
	}


public static void bubbleSort(int[] numbers){
	
	int temp;
	
boolean fertigGetauscht=false;
while(fertigGetauscht==false){
	fertigGetauscht=true;

for(int i=0; i<numbers.length-1; i++){
	if(numbers[i] > numbers[i+1]){
		temp = numbers [i+1];
		numbers [i+1] = numbers [i];
		numbers [i] = temp;
		fertigGetauscht=false;
	}		
   }
  }
 }
}
