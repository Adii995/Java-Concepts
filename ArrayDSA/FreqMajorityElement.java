package ArrayDSA;

public class FreqMajorityElement {
   public static void main(String[] args) {
	   int[] a= {5,6,8,2000,12,12,31,13};
	   int b=majorityElement(a);
	  System.out.println(b);
   }
   public static int majorityElement(int[] a) {
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
		   if(count>a.length/2) {
		   }
		   return a[i];
	   }
	  return -1;
	   	   
   }
}
