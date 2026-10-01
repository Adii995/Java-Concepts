package ArrayDSA;

public class ReSecondBiggest {
      public static void main(String[] args) {
		int[] a = {70,20,30,40,50,60};
		int res = secondBiggest(a);
		System.out.println(res);
		
	}
      public static int secondBiggest(int[] a) {
    	  int big=0; int sebig=0;
    	  for(int n:a) {
    		  if(n>big) {
    			  sebig=big;
    			  big=n;
    		  }else if(n!=big && n>sebig) {
    			  sebig=n;
    		  }
    	  }
    	 return sebig;
      }
}
