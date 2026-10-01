package ArrayDSA;

public class InsertionSort {
 public static void main(String[] args) {
	 int[] a= {9,10,50,30,70,12,30,15,12};
		System.out.println("Array Before Sorting");
		for(int b:a) {
			System.out.print(b+" ");
		}
		insertionSort(a);
		System.out.println("\nArray After Sorting");
		for(int b:a) {
			System.err.print(b+" ");
		}
   }
  public static void insertionSort(int[] a) {
	   for(int i=1; i<a.length; i++) {
		   int key=a[i];
		   int j=i-1;
		   while(j>=0 && a[j]>key) {
			   a[j+1]=a[j];
			   j--;
		   }
		   a[j+1]=key;
	   }
  }
}
