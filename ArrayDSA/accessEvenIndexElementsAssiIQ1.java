package ArrayDSA;

public class accessEvenIndexElementsAssiIQ1 {
	public static void main(String[] args) {
	    int[] nums={10,24,30,20,50,40,75,70};
	    accessEvenIndexElements(nums);
	  }
	public static void accessEvenIndexElements(int[] arr){
	  for(int i=0; i<arr.length; i++){
	    if (i%2==0){
	      System.out.print(arr[i]+" ");
	    } 
	  }
	}
}


