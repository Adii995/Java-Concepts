package ArrayDSA;

public class SecSmallEleInArray {
	public static void main(String[] args) {
		int[] a= {70,40,30,20,10};
		System.out.println(seSmallest(a));
	}
	
	public static int seSmallest(int[] a) {
		int small=Integer.MAX_VALUE; int seSmall=Integer.MIN_VALUE;
		   for(int x:a) {
			   if(x<small) {
				   seSmall=small;
				   small=x;
			   }else if(x!=small && seSmall>small) {
				     seSmall=x;
			   }
		   }
		  return seSmall;
		
	}
    
}
