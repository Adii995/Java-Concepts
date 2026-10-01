package ArrayDSA;

public class Freaquency {
     public static void main(String[] args) {
		int[] a = {2,4,2,6,4};
		frequency(a);
		
	}
     public static void frequency(int[] a) {
    	 int min=a[0];
    	 int max=a[0];
    	 for(int n:a) {
    		 if(max<n) {
    			 max=n;
    		 }
    		 else if(min>n) {
    			 min=n;
    		 }
    	 }
    	 int[] freq = new int[max-min+1];
    	 for(int i=0; i<a.length; i++) {
    		 freq[a[i]-min]++;
    	 }
    	 for(int i=0; i<freq.length; i++) {
    		 if(freq[i]>0) {
    			 System.out.println((i+min)+" is : "+freq[i]+" Times");
    		 }
    	 }
     }
}
