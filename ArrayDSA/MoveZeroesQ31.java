package ArrayDSA;

public class MoveZeroesQ31 {
      public static void main(String[] args) {
    	  int[] a= {0,7,5,0,4,0,8,0,9};
    	  moveZero(a);
    	  for(int b:a)
    	  System.out.print(b+" ");
      }
     public static void moveZero(int[] a) {
    	 for(int i=0,j=0; i<a.length; i++) {
    		 if(a[i]!=0) {
    			 if(i!=j) {
    				  a[j]=a[i];
    				  a[i]=0;
    			 }
    			 j++;
    		 }
    	 }
     }
}
