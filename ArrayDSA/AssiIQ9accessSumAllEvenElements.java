package ArrayDSA;

public class AssiIQ9accessSumAllEvenElements {
  public static void main(String[] args) {
	  int[] nums= {10,20,14,24,11,13,17,80};
	  accessSumAllEvenElements(nums);
  }
  public static void accessSumAllEvenElements(int[] arr) {
	  int sum=0;
	  for(int i=0; i<arr.length; i++) {
		  if(arr[i]%2==0)
			 sum=sum+arr[i];
	  }
	  System.out.println("\nTotal Sum AllEvenElements : "+sum);
  }
}
