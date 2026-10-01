package ArrayDSA;

public class MissingNumber {
	public static void main(String[] args) {
		int[] a = {10,11,21,12,23};
		int result=missingNumber(a);
		System.out.println(result);
	}
 public static int missingNumber(int[] a) {
	 int sum=0;
	 for(int x:a) {
		 sum+=x;
	 }
	 int n=a.length;
  return n*(n+2)/2-sum;
 }
}
