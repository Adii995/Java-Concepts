
package ArrayDSA;

public class FreqCountSort {
	public static void main(String[] args) {
		int[] a= {10,13,12,10,15,8,12,10};
		int result=CountSort(a);
		System.out.println(result);
		
	}
   public static int CountSort(int[] a) {
	   int min=a[0], max=a[0];
	   for(int n:a) {
		   if(n>max)
			   max=n;
		   else if(n<min)
			   min=n;
	   }
	   int[] freq=new int[max-min+1];
	   for(int n:a)
		   freq[n-min]++;
	   int j=0;
	   for(int i=0; i<freq.length; i++) {
		   while(freq[i]-->0)
			   a[j++]=i+min;
			   
	   }
	   return -1;
	   }

}
