package ArrayDSA;

public class SecMaxInArr {
     public static void main(String[] args) {
		int[] arr = {2,9,7,6,5,3,8};
		System.out.println(SecMax(arr));
	}
     public static int SecMax(int[] arr) {
    	 int max = Integer.MIN_VALUE;
    	 int semax = Integer.MIN_VALUE;
    	 for(int x:arr) {
    	  if(x>max) {  
    		 semax=max;
    		 max=x;
    	  } else if (x     >semax && x!=max) {
    		     semax=x;
    	   }
    	  
    	  
    	 }
    	 return semax;
     }
}
