package ArrayDSA;

public class ReverseQ12 {
	public static void main(String[] args) {
		  int[] a= {10,20,30,40,50,60};
		  int length=a.length;
		  reverse(a,0,length/2-1);
		  reverse(a,length/2,a.length-1);
		  System.out.println("Revers Array is:");
		  for(int b:a) {
		  System.out.print(b+" ");
		  } 
	  }
	  public static void reverse(int[] a,int start,int end) {
		  while(start<end) {
			  int temp=a[start];
			  a[start]=a[end];
			  a[end]=temp;
		   start++;
		   end--;
		  }
	  }
}
