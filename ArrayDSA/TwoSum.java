package ArrayDSA;

public class TwoSum {
  public static void main(String[] args) {
	  int[] a= {2,10,15,20,28,35,6,50};
	  System.out.println("TwoSum Array is");
	  twoSum(a,9);
	  for(int b:a) {
		  System.out.print(b+" ");
	  }
  }
  public static int[] twoSum(int[] a,int target) {
	  for(int i=0; i<a.length; i++) {
		  for(int j=i+1; j<a.length; j++) {
			  if(a[i]+a[j]==target)
				  return new int[] {i,j};
		    }
   	  }
	return new int[] {};
	}
}
