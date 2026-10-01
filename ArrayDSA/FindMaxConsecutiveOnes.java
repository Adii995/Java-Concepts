package ArrayDSA;

public class FindMaxConsecutiveOnes {
  public static void main(String[] args) {
	  int[] nums= {1,1,1,0,0,1,1,1,0,0,1,1,1,1,1};
	   int result = maxConsecutiveOnes(nums);
	  System.out.println("MaxConsecutiveOnes is "+result);
	  for(int a:nums) {
		  System.out.print(a+" ");
	  }
  }
 public static int maxConsecutiveOnes(int[] nums) {
	 int tempCount=0,finalCount=0;
	 for(int x:nums) {
		if(x==1) {
			tempCount++;
		}
	  else {
			if(tempCount>finalCount)
				finalCount=tempCount;
			    tempCount=0;
			}
		}
	  if(tempCount>finalCount)
		  finalCount=tempCount;
		return finalCount;

	 }
 }

