package ArrayDSA;

public class ReverseArray {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		reverse(a);
		for(int x:a) {
			System.out.print("Reverse is "+x);
		}
		
	}
	public static void reverse(int[] a) {
		int start = a[0]; int end = a[a.length-1];
		while(start<end) {
			int temp = a[start];
			a[start]=a[end];
			a[end]=temp;
		}
	}

}
