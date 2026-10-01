package ArrayDSA;

public class SmallestEleInArray {
    public static void main(String[] args) {
    	int[] a = {10,20,30,40,50};
		System.out.println(smallaest(a));
	}
    
   public static int smallaest(int[] a) {
	   int small=Integer.MAX_VALUE;
	   for(int x:a) {
		   if(x<small) {
			   small=x;
		   }
	   }
	  return small;
   }
}
