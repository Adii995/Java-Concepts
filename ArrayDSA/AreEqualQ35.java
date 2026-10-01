package ArrayDSA;

import java.util.Arrays;

public class AreEqualQ35 {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50,70};
		int[] b = { 30, 40, 50, 10, 20 };
		boolean result = areEqual(a, b);
		System.out.print(result);
	}

	public static boolean areEqual(int[] a, int[] b) {
		if (a.length != b.length)
			return false;
		Arrays.sort(a);
		Arrays.sort(b);
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i])
				return false;
		}
		return true;
	}
}
