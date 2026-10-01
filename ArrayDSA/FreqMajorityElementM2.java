package ArrayDSA;

public class FreqMajorityElementM2 {
	public static void main(String[] args) {
		int[] a= {10,13,12,10,15,8,12,10};
		int result=FreqMajorityElemen(a);
		System.out.println(result);
		
	}
   public static int FreqMajorityElemen(int[] a) {
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
	   for(int i=0; i<a.length; i++) {
		   if(freq[a[i]-min]>a.length/2)
			   return i;
	   }
	   return -1;
	   }
}
