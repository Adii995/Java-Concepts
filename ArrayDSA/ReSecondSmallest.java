package ArrayDSA;

public class ReSecondSmallest {
	 public static void main(String[] args) {
			int[] a = {70,20,30,40,50,60};
			int res = secondBiggest(a);
			System.out.println(res);
			
		}
	      public static int secondBiggest(int[] a) {
	    	  int small=Integer.MAX_VALUE; int seSmall=Integer.MAX_VALUE;
	    	  for(int n:a) {
	    		  if(n<small) {
	    			  seSmall=small;
	    			  small=n;
	    		  }else if(n!=small && n<seSmall ) {
	    			  seSmall=n;
	    		  }
	    	  }
	    	 return seSmall;
	      }
	}

