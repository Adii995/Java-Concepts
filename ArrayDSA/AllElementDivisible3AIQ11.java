package ArrayDSA;

public class AllElementDivisible3AIQ11 {
     public static void main(String[] args) {
    	 int[] nums= {10,20,39,15,30,25,64,45};
    	 ElementDivisible(nums);
     }
   public static void ElementDivisible(int[] arr) {
	   int count=0;
	  for(int i=0; i<arr.length; i++) {
		  if(arr[i]%3==0) {
			  System.out.print(arr[i]+" ");
			  count++;
		  }
	   }
	  System.out.println("\nTotal Element are :"+count);
	  }
         
   }

