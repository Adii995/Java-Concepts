package ArrayDSA;

public class RemoveDuplicate {
    public static void main(String[] args) {
    	int[] a= {1,2,3,1,2};
    	a=removeDuplicate(a);
     for(int b:a)
    	System.out.print(b+" ");
    }
    public static int[] removeDuplicate(int[] a) {
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
    	for(int i=0; i<n; i++)
    		b[i]=a[i];
    	return b;
    }
}
