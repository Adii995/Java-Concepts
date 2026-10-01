package ArrayDSA;

public class MergeSort {
	public static void main(String[] args) {
		int[] a = { 5, 4, 7, 8, 25, 16, 65, 32, 1, 2, 19, };
		System.out.println("Before Sorting: ");
		for (int x : a)
			System.out.print(x + " ");
		mergeSort(a, 0, a.length - 1);
		System.out.println("\nAfter Sorting: ");
		for (int x : a)
			System.out.print(x + " ");

	}

	public static void mergeSort(int[] a, int start, int end) {
		if (start < end) {
			int mid = start + (end - start) / 2;
			mergeSort(a, start, mid);
			mergeSort(a, mid + 1, end);
			merge(a, start, mid, end);
		}
	}

	public static void merge(int[] a, int start, int mid, int end) {
		int[] merged = new int[end - start + 1];
		int indx1 = start, indx2 = mid + 1, indx3 = 0;
		while (indx1 <= mid && indx2 <= end) {
			if (a[indx1] < a[indx2])
				merged[indx3++] = a[indx1++];
			else
				merged[indx3++] = a[indx2++];
		}
		while (indx1 <= mid)
			merged[indx3++] = a[indx1++];
		while (indx2 <= end)
			merged[indx3++] = a[indx2++];
		for (int i = start, j = 0; j < merged.length; i++, j++)
			a[i] = merged[j];
	}
}
