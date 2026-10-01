package ArrayDSA;

public class accessSumAllOddElementsAssiIQ10 {
	public static void main(String[] args) {
	    int[] nums={10,13,17,20,50,40,75,70};
	    accessSumAllOddElements(nums);
	  }
	 public static void accessSumAllOddElements(int[] nums){
		 int sum=0;
	   for(int i=0; i<nums.length; i++){
	      if (nums[i]%2!=0){
	        sum=sum+nums[i];
	      }   
	   }
	   System.out.println("\nTotal sum is : " +sum);
	 }
}
