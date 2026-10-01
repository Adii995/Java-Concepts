package ArrayDSA;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a= {9,10,20,5,2,1,16,15,12};
		System.out.println("Array Before Sorting");
		for(int b:a) {
			System.out.print(b+" ");
		}
		selectionSort(a);
		System.out.println("\nArray After Sorting");
		for(int b:a) {
			System.err.print(b+" ");
		}
	 }
	public static void selectionSort(int[] a) {
		int n=a.length;
		for(int i=0; i<n-1; i++) {
			int min=a[i],minIndex=i;
			for(int j=i+1; j<n; j++) {
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
