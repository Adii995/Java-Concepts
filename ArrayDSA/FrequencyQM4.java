package ArrayDSA;

public class FrequencyQM4 {
	public static void main(String[] args) {
		  int[] a= {9,4,5,8,8,9,200};   
		  printFrequency(a);
	   }
	   public static void printFrequency(int[] a) {
		   int n=a.length;
		   for(int i=0; i<n; i++) {
			   int count=1;
			   for(int j=i+1; j<n; j++) {
				   if(a[i]==a[j]) {
					   count++;
					   a[j]=a[n-1];
					   n--;
					   j--;
				   }
			   }
			  if(count>1)
			  System.out.println(a[i]+" ");
		   }
	   }
}
