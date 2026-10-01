package ArrayDSA;

public class SecLargestEleInArray2 {
   public static void main(String[] args) {
	int[] a = {70,20,30,40,50};
	  System.out.println(secondLarge(a));
	
      }
   public static int secondLarge(int[] a) {
	   int seLarge=Integer.MIN_VALUE; int large=Integer.MIN_VALUE;
	   for(int x:a) {
		   if(x>large) {
			   seLarge=large;
		        large=x;
		        
		   }else if(x!=large && seLarge<large) {
			       seLarge=x;
		   }
	   }
	  return seLarge;
   }
   
}
