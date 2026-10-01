package ArrayDSA;

public class FrequencyPrintDuplicatesQ2 {
	public static void main(String[] args) {
    	int[] a= {10,40,30,50,40,60};
    	generateFrequencyArray(a);
    	
    }
    public static void generateFrequencyArray(int[] a) {
    	int max=a[0];
    	int min=a[0];
    	for(int x:a) {
    		if(x>max)
    			max=x;
    		else if(x<min)
    			 min=x;
    	}
    	int[] freq=new int[max-min+1];
    	for(int n:a) {
    		freq[n-min]++;
    	}
    	for(int i=0; i<freq.length; i++) {
    		if(freq[i]==1)
    			System.out.println((i+min)+"is : "+freq[i]+" times");
    	}
    }
}
