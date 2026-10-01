package ArrayDSA;

public class ReBubbleSort {
      public static void main(String[] args) {
		int[] a = {50,20,10,30,5,2};
		bubbleSort(a);
		for(int n:a) {
			System.out.print(n+" ");
		}
	}
      public static void bubbleSort(int[] a) {
    	   boolean flag=true;
    	  for(int i=0; i<a.length-1; i++) {
    		  for(int j=0; j<a.length-1-i; j++) {
    			  if(a[j]>a[j+1]) {
    				  int temp = a[j+1];
    				    a[j+1]=a[j];
    				    a[j]=temp;
    				   flag=false;
    			  }
    		  }
    		  if(flag) {
    			  break;
    		  }
    	  }
      }
} 
