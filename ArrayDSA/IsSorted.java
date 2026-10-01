package ArrayDSA;

public class IsSorted {
	public static void main(String[] args) {
		int [] a ={2,10,7,8,9};
		     boolean result=isSorted(a);
		System.out.println(result);
		}
	
public static boolean isSorted(int[] a) {
	for(int i=1; i<a.length; i++) {
		if(a[i]<a[i-1])
			return false;
	}
   return true;
}
}
