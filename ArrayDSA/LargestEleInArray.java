package ArrayDSA;

public class LargestEleInArray {
	
	public static void main(String[] args) {
		int[] a = {10,20,30,45,15};
		
		System.out.println(LargestElement(a));
	}
	public static int LargestElement(int[] a) {
		int large = 0;
		for(int i=0; i<a.length;i++) {
	       if(a[i]>large) {
	    	   large=a[i];
	       }
		}
	       return large;
	}

}
