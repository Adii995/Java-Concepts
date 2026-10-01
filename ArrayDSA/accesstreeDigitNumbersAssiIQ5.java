package ArrayDSA;

public class accesstreeDigitNumbersAssiIQ5 {
	public static void main(String[] args) {
	      int[] nums={123,153,20,32,124,23,235};
	      accesstreeDigitNumbers(nums);
	   }
	  public static void accesstreeDigitNumbers(int[] arr){
		  int count=0;
	    for(int i=0; i<arr.length; i++){
	      if(arr[i]>=100 && arr[i]<=999) {
	         System.out.print(arr[i]+" ");
	      count++;
	      }
	    }
	    System.out.println("\nTotal treeDigitNumbers are:"+count);
	  }
	  
}
