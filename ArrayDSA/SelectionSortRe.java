package ArrayDSA;

public class SelectionSortRe {
      public static void main(String[] args) {
		int [] a = {50,10,30,90,5};
		selectionSort(a);
		for(int b:a) {
			System.out.print(b+" ");
		}
	}
      public static void selectionSort(int[] a) {
    	  for(int i=0; i<a.length-1; i++) {
    		  int min=a[i]; int minIndex=i;
    		  for(int j=i+1; j<a.length; j++) {
    			    if(a[j]<min) {
    			    	min=a[j];
    			    	minIndex=j;
    			    }
    		  }
    		  a[minIndex]=a[i];
    		  a[i]=min;
    	  }
      }
}
