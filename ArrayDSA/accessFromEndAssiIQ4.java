package ArrayDSA;

public class accessFromEndAssiIQ4 {
	public static void main(String[] args) {
	    int[] nums={20,10,40,50,60,29,34,80};
	    accessFromEnd(nums);
	  }
	public static void accessFromEnd(int[] nums){
	  for(int i=nums.length-1; i>=0; i--){
	    System.out.print(nums[i]+" ");
	  }
	}
}
