package ArrayDSA;

public class BubbleSortRe {
      public static void main(String[] args) {
		int[] a = {70,50,30,80,10,5};
		bubbleSort(a);
		for(int x:a) {
			System.out.print(x+" ");
		}
	}
      public static void bubbleSort(int[] a) {
    	  for(int i=0; i<a.length-1; i++) {
    		  boolean flag=true;
    		for(int j=0; j<a.length-1-i; j++) {
    			if(a[j]>a[j+1]) {
    				int temp = a[j+1];
    				a[j+1]=a[j];
    				a[j]=temp;
    				flag=false;
    				 00
    			}
    		}
    		if(flag) {
    			break;
    		}
    	  }
      }
}

