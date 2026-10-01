package ArrayDSA;

public class RightRotateQ22 {
    public static void main(String[] args) {
    	int[] a= {1,2,3,4,5};
    	int k=2;
    	rotateRight(a,k);
    	System.out.println("Right Rotate Array is : ");
        for(int b:a) {
          System.out.print(b+" ");
        }
    }
   public static void rotateRight(int[] a,int k) {
	   k=k%a.length;
	   reverse(a,0,a.length-1);
	   reverse(a,0,k-1);
	   reverse(a,k,a.length-1);
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
