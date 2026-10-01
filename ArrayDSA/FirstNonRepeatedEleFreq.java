package ArrayDSA;

public class FirstNonRepeatedEleFreq {
	public static void main(String[] args) {
		int[] a= {10,13,12,10,15,8,12,10};
		int result=firstNonRepeated(a);
		System.out.println(result);
	}
   public static int firstNonRepeated(int[] a) {
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
		   if(freq[a[i]-min]==1)
			   return i;
	   }
	   return -1;
	   }
   
}
