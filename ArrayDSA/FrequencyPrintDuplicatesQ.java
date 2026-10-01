package ArrayDSA;

import java.util.NoSuchElementException;

public class FrequencyPrintDuplicatesQ {
       public static void main(String[] args) {
    	   int[] a= {6,8,3,7,3,9,6,3,6,10,34,6};
    	   printDuplicates(a);
       }
       public static int printDuplicates(int[] a) {
    	   int min=a[0],max=a[0];
    	   for(int x:a) {
    		   if(x>max)
    			   max=x;
    		   else if(x<min)
    			   min=x;
    	   }
    	   int[] freq=new int[max-min+1];
    	   for(int i=0; i<a.length; i++) {
    		   freq[a[i]-min]++;
    	   }
    	   for(int i=0; i<freq.length; i++) {
    		   if(freq[i]>a.length/2)
    			   return i+min;
    	   }
    	   throw new NoSuchElementException("Element is NOT Availaible");
       }
}
