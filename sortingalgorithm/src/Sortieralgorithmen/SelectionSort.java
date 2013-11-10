package Sortieralgorithmen;

public class SelectionSort {

public static void main(String[] args) {
	
	        int Wert[]={6,2,8,1,4,5,7,9,3}; 
	        
	        
	        System.out.print("Unsortierte Werte: \n");
			for(int i=0; i<Wert.length; i++){
				System.out.print(Wert[i]+" ");
			}
			System.out.println();
			
			int niedriegster,i,j;
	        
	        for(i = 0 ; i < Wert.length-1; i++) {  
	            niedriegster = i;                       
	            for(j = i+1 ; j < Wert.length; j++) {  
	                if(Wert[j] < Wert[niedriegster]) {
	                    niedriegster = j;                  
	                }
	            }
	            if(niedriegster != i) {                   
	                int temp = Wert[i];
	                Wert[i] = Wert[niedriegster];
	                Wert[niedriegster] = temp;
	            }
	        }
	        System.out.print("Sortierte Werte: \n");
	        for (int k = 0; k <= Wert.length-1 ; k++) {
	        System.out.print(Wert[k] + " ");
	        }
	    }
	}
