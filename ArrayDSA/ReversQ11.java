                                                       package ArrayDSA;

public class ReversQ11{
  public static void main(String[] args) {
	  int[] a= {10,20,30,40,50,60};
	  revers(a);
	  System.out.println("Revers Array is:");
	  for(int b:a) {
	  System.out.print(b+" ");
	  }  
  }
  public static void revers(int[] a) {
	  int start=0; int end=a.length-1;
	  while(start<end) {
		  int temp=a[start];
		  a[start]=a[end];
		  a[end]=temp;
	   start++;
	   end--;
	  }
  }
}
