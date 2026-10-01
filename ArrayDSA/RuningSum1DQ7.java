package ArrayDSA;

public class RuningSum1DQ7 {
     public static void main(String[] args) {
    	 int[] nums= {1,2,3,4,5,6};
    	 runingSum(nums);
    	 System.out.println("Runing Sum is : ");
    	 for(int b:nums){
    		 System.out.print(b+" ");
    	 }
    	 
     }
   public static int[] runingSum(int[] arr) {
	   for(int i=1; i<arr.length; i++) {
		   arr[i]=arr[i]+arr[i-1];
	   }
	   return arr;
   }
}
