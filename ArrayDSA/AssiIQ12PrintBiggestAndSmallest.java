package ArrayDSA;

public class AssiIQ12PrintBiggestAndSmallest {
	public static void main(String[] args) {
	    int[] nums={10,34,36,23,4,57,89,43};
	    PrintBiggestAndSmallest(nums);
	  }
	 public static void PrintBiggestAndSmallest(int[] nums){
	   int big=nums[0];    int small=nums[0];
	   for(int x:nums){
	      if(x>big)
	        big=x;
	    else if(x<small)
	        small=x;
	   }
	  System.out.println("Biggest is:"+big);
	  System.out.println("Smallest is:"+small);
	 }
 }
