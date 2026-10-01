package ArrayDSA;

public class SecondBiggestQ45 {
	public static void main(String[] args) {
		int[] a = {43, 90, 91, 63, 48, 80 ,98};
		int SecondBiggest = getSecondBiggest(a);
		System.out.println("Second Biggest is: " + SecondBiggest);
	}

	public static int getSecondBiggest(int[] a) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int x : a) {
			if (x > max) {
				secondMax = max;
				max = x;
			} else if (x > secondMax && x != max) {
				secondMax = x;
			}
		}
		return secondMax;
	}
}
