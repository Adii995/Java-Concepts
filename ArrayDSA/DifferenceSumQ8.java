package ArrayDSA;

public class DifferenceSumQ8 {
	public static void main(String[] args) {
	    int[] nums={14,23,15,34,53};
	    int result=differenceOfSum(nums);
	    System.out.println("Difference of Sum is:"+result);
	  }
	public static int differenceOfSum(int[] nums) {
	        int sum=0;
	        int digitSum=0;
	        for(int n:nums){
	            sum=sum+n;
	         while(n>0){
	            digitSum=digitSum+n%10;
	            n/=10;
	         }
	       }
	     return sum-digitSum;
	    }
		
	}
