package ArrayDSA;

public class AssiIQ6getSum {
	public static void main(String[] args) {
	    int[] nums={24,26,10,23,34,64};
	    int sum=getSum(nums);
	    System.out.println("Sum is:"+sum);
	   }
	   public static int getSum(int[] arr){
	       int sum=0;
	       for(int i=0; i<arr.length; i++){
	          sum=sum+arr[i];
	       }
	     return sum;
	  }
}
