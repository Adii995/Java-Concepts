package ArrayDSA;

public class ChangeArrayQ7 {
	public static void main(String[] args) {
		   int  nums[]={2,5,4,3,6};
		    changedValues(nums);
		    System.out.println("changed array is:");
	         for(int b:nums)
	         System.out.print(b+" ");
	 }
		 public static void changedValues(int[] arr){
		      int product=1;
		      for(int x:arr)
		      product=product*x;
		      for(int i=0; i<arr.length; i++)
		         arr[i]=product/arr[i];
		      
		 } 
   }
