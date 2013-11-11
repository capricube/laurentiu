package sortingalgorithm;

public class HeapSort {
	
	 public static void main(String[] args) {
		 
         int Wert[]={6,2,8,1,4,5,7,9,3};
         sort(Wert);
     
     System.out.print("Sortierte Werte:\n");
     for(int i=0;i<Wert.length;i++){
             System.out.print(Wert[i] + " ");
     }
 }

	    private static int[] a;
	    private static int n;
	    private static int links;
	    private static int rechts;
	    private static int groestes;

	    
	    public static void buildheap(int []a){
	            n=a.length-1;
	            for(int i=n/2;i>=0;i--){
	                    maxheap(a,i);
	            }
	    }
	    
	 
	    public static void maxheap(int[] a, int i){
	            links=2*i;
	            rechts=2*i+1;
	            if(links <= n && a[links] > a[i]){
	                    groestes=links;
	            }
	            else{
	                    groestes=i;
	            }
	            
	            if(rechts <= n && a[rechts] > a[groestes]){
	                    groestes=rechts;
	            }
	            if(groestes!=i){
	                    exchange(i,groestes);
	                    maxheap(a, groestes);
	            }
	    }
	    
	    
	    public static void exchange(int i, int j){
	            int t=a[i];
	            a[i]=a[j];
	            a[j]=t;
	            }
	    
	   
	    
	    public static void sort(int []a0){
	            a=a0;
	            buildheap(a);
	            
	            for(int i=n;i>0;i--){
	                    exchange(0, i);
	                    n=n-1;
	                    maxheap(a, 0);
	            }
	    }
	    
	   
	} 
