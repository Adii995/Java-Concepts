package ArrayDSA;

public class SecondSmallestQ46 {
   public static void main(String[] args) {
	   int[] nums= {80,80,50,20,10,60};
	   int SecondSmallest=secondSmallest(nums);
	   System.out.println("Second Smallest is : "+SecondSmallest);																															
   }
   public static int secondSmallest(int[] a) {
	   int max=Integer.MIN_VALUE;
	   int secondMax=Integer.MIN_VALUE;
	   long thirdMax=Long.MIN_VALUE;
	   for(int x:a) {
		   if(x>max) {
			   thirdMax=secondMax;
			   secondMax=x;
		  }
		   else if(x>secondMax && x!=max) {
			   thirdMax=secondMax;
			   secondMax=x;
		   }
		   else if(x>thirdMax && x!=max && x!=secondMax)
			   thirdMax=x;
	   }
	  return thirdMax!=Integer.MIN_VALUE?(int)thirdMax:max;
   }
}
