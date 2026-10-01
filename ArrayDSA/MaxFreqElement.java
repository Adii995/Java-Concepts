package ArrayDSA;

public class MaxFreqElement {
	public static void main(String[] args) {
		int[] a = { 10, 40, 30, 50,  60 };
		generateFrequencyArray(a);

	}

	public static void generateFrequencyArray(int[] a) {
		int max = a[0];
		int min = a[0];
		for (int n : a) {
			if (n > max)
				max = n;
			else if (n < min)
				min = n;
		}
		int[] freq = new int[max - min + 1];
		for (int n : a) {
			freq[n - min]++;
			int val = a[0];
			int Maxfreq = 1;

			for (int i = 0; i < freq.length; i++) {
				if (freq[i] > Maxfreq) {
					Maxfreq = freq[i];
					val = i + min;
				}
			}
				System.out.println(val);
			
		}

	}
}
