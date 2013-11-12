package sortingalgorithm;

public class QuickSort {

	public static void main(String a[])
    {
      
      int Werte[] = {6,2,8,1,4,5,7,9,3};
      
      System.out.print("Unsortierte Werte:\n");
      for(int i = 0; i < Werte.length; i++)
       {
         System.out.print(Werte[i]+" ");
       }
      System.out.println();
      initializequickSort(Werte,0,Werte.length-1);
      System.out.print("Sortierte Werte:\n");
      for(int i = 0; i < Werte.length; i++)
       {
         System.out.print(Werte[i]+" ");
       }
    }
   public static void initializequickSort(int a[],int low, int len)
    {
      if(low>=len) return; 
      int l=low,s=len; 
      int piv=a[(l+s/2)]; 
      while(l<s)
       { 
         while(l<s && a[l]<piv)
         l++;
        
         while(l<s && a[s]>piv)
         s--;
        
         if(l<s)
          {
            int tem = a[l];
            a[l]=a[s];
            a[s]=tem;
          }
       }
      if(s<l)
       {
         int t = l;l=s;s=t;
       }

     
    }
 }