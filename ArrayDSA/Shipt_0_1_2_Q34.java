package ArrayDSA;

public class Shipt_0_1_2_Q34 {
	public static void main(String[] args) {
		int[] a = { 0, 1, 1, 1, 2, 2, 0, 0 };
		Shift012(a);
		for (int x : a) {
			System.out.print(x + " ");
		}
	}

	public static void Shift012(int[] a) {
		int count0 = 0, count1 = 0;
		for (int x : a) {
			if (x == 0)
				count0++;
			else if (x == 1)
				count1++;
		}
		for (int i = 0; i < a.length; i++) {
			if (i < count0)
				a[i] = 0;
			else if (i < count0 + count1)
				a[i] = 1;
			else
				a[i] = 2;
		}
	}
}
