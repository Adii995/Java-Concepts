package ArrayDSA;

public class Sift01Q32 {
     public static void main(String[] args) {
    	 int[] a={0,1,0,1,0,0,1,1,0};
    	 sift01(a);
    	 for(int b:a) {
    		 System.out.print(b+" ");
    	 }
     }
    public static void sift01(int[] a) {
    	int countZero=0;
    	for(int x:a) {
    		if(x==0)
    			countZero++;
    	}
    	for(int i=0; i<a.length; i++) {
    		if(i<countZero)
    			a[i]=0;
    		else
    			a[i]=1;
    	}
    }
}
