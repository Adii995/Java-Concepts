package ArrayDSA;

public class LargestEleInArrayM2 {
	public static void main(String[] args) {
		int[] a = {70,20,30,40,50,60};
		System.out.println(largeElemet(a));
	}
	public static int largeElemet(int[] a) {
		int large=0;
		for(int x:a) {
			if(x>large)
				large=x;
		}
	 return large;
	}

}
