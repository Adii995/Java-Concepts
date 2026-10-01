package ArrayDSA;

public class FrequencyQ48M2 {
   public static void main(String[] args) {
	  
	  int[] a= {9,4,5,5,8,9,9,8,8,20};   
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
		  System.out.println(a[i]+" is: "+count+ " times");
	   }
     }
   }
  
