package ArrayDSA;

public class reRemoveDuplicate {
    public static void main(String[] args) {
		int[] a= {10,20,30,10,20};
		int[] b=removeDuplicates(a);
		for(int x:b) {
			System.out.print(x+" ");
		}
		
	}
    public static int[] removeDuplicates(int[] a) {
    	int n=a.length;
    	for(int i=0; i<n; i++) {
    		for(int j=i+1; j<n; j++) {
    			 if(a[i]==a[j]) {
    				 a[j]=a[n-1];
    				 n--;
    				 j--;
    			 }
    		}
    	}
    	  int[] b=new int[n];
    	  for(int i=0; i<n; i++) {
    		  b[i]=a[i];
    	  }
    	return b;
    }
}
