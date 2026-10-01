package ArrayDSA;

public class SmallestEleInArrayM2 {
     public static void main(String[] args) {
		int[] a = {1,20,30,9,40,50,};
		System.out.println(Smallest(a));
		
	}
     public static int Smallest(int[] a) {
    	 int small = a[0];
    	 for(int x:a) {
    		 if(x<small) {
    			 small=x;
    		 }
    	 }
    	return small;
     }
}
