package ArrayDSA;

public class InsertionSortR {
    public static void main(String[] args) {
		int[] a = {50,30,20,10,60,70};
		insertionSort(a);
		for(int x:a) {
			System.out.print(x+" ");
		}
	}
     public static void insertionSort(int[] a) {
    	 for(int i=1; i<a.length; i++) {
    		 int pivot = a[i];
    		 int j=i-1;
    		 while(j>=0 && a[j]>pivot) {
    			 a[j+1]=a[j];
    			 j--;
    		 }
    		 a[j+1]=pivot;
    	 }
     }
}
