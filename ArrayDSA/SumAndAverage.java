package ArrayDSA;

public class SumAndAverage {
	public static void main(String[] args) {
	      int[] a = {5,10,15,20,25};
	      sumAndAverage(a);
	}
	
	public static void sumAndAverage(int[] a) {
		int sum=0;
		for(int x:a) {
			sum=sum+x;
		}
		System.out.println("Total Sum is "+sum);
		System.out.println("Average is "+sum/a.length);
	}

}
