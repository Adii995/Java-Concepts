package ArrayDSA;

public class ProductExceptSelfQ8{
	public static void main(String[] args) {
		int [] a= {1,2,3,4};
		int [] res=productExceptSelf(a);
		for(int x:res) {
		System.out.println(x+" ");
		}
	}
   public static int[] productExceptSelf(int[] nums) {
	   int product = 1, count=0;
	   for(int n:nums) {
		   if(n!=0)
			   product*=n;
		   else 
			   count++;
	   }
	   int[] result = new int[nums.length];
	   if(count>1)
		   return new int[nums.length];
	   for(int i=0; i<nums.length; i++) {
		   if(count==0)
			   nums[i]=product/nums[i];
		   else {
			   if(nums[i]!=0)
				   nums[i]=0;
			   else
				   nums[i]=product;
		   }
	   }
	   return result;
   }
}
