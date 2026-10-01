package ArrayDSA;

public class ChangeArrayQ6 {
		  public static void main(String[] args) {
		    int nums[]={2,5,4,3,6};
		    changeValues(nums);
		    System.out.println("changed Array is:");
		     for(int b:nums)
		      System.out.print(b+" ");
		       
		  }
		  public static void changeValues(int[] arr){
		    int sum=0;
		    for(int x:arr) 
		    sum=sum+x;
		    for(int i=0; i<arr.length; i++) 
		      arr[i]=sum-arr[i];
		  
   }
		  }

