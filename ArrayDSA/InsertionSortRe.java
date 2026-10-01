package ArrayDSA;

public class InsertionSortRe {
     public static void main(String[] args) {
		int [] a = {50,30,60,20,10,5};
		insertionSort(a);
		for(int n:a) {
			System.out.print(n+" ");
		}
	}
     public static void insertionSort(int[] a) {
    	 for(int i=1; i<a.length; i++) {
    		 int pivot=a[i];
    		 int j=i-1;
    		 while(j>=0 && a[j]>pivot) {
    			 a[j+1]=a[j];
    			 j--;
    		 }
    		 a[j+1]=pivot;
    	 }
     }
}
