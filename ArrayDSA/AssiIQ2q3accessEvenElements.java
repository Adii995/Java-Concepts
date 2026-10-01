package ArrayDSA;

public class AssiIQ2q3accessEvenElements {
	public static void main(String[] args) {
	    int[] nums={10,17,30,20,13,40,50,70};
	    accessEvenElements(nums);
	  }
	public static void accessEvenElements(int[] arr){
	  int count=0;
	  for(int i=0; i<arr.length; i++){
	    if (arr[i]%2==0){
	      System.out.print(arr[i]+" ");
	      count++;
	    } 
	  }
	  System.out.println("\nTotal Even Elements are:"+count);
	}
}
