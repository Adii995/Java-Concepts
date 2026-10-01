package ArrayDSA;

public class ConcatenateQ9 {
	public static void main(String[] args) {
	     int[] nums={20,29,43,40,30,50};
	     int[] result=getConcatenation(nums);
	    for (int i : result) {
	      System.out.print(i+" ");
	    }
	  }
	  public static int[] getConcatenation(int[] nums){
	      int[] b=new int[nums.length*2];
	      for(int i=0; i<nums.length; i++){
	        b[i]=nums[i];
	        b[nums.length+i]=nums[i];  
	      }
	    return b;
	}
}
