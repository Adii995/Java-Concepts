package ArrayDSA;

public class BubbleSortQ {
	public static void main(String[] args) {
		int[] a = { 9, 10, 20, 5, 2, 1, 16, 15, 12 };
		System.out.println("Array Before Sorting");
		for (int b : a) {
			System.out.print(b + " ");
		}
		bubbleSort(a);
		System.out.println("\nArray After Sorting");
		for (int b : a) {
			System.err.print(b + " ");
		}
	}

	public static void bubbleSort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			boolean flag = true;
			for(int j = 0; j < n - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flag = false;
				}
			}
			if (flag) {
				break;
			}

		}
	}
}
