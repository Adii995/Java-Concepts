package ArrayDSA;

public class PalindromicQ18 {
   public static void main(String[] args) {
	   int[] a= {10,20,30,40,30,20,10};
	   boolean result=isPalindromic(a);
	   System.out.println("Array is Palindromic : "+result);
	   for(int b:a) {
		   System.out.print(b+" ");
	   }
   }
 public static boolean isPalindromic(int[] a) {
	 int start=0, end=a.length-1;
	 while(start<end) {
		 if(a[start]!=a[end])
		   return false;
	  start++;
	  end--;
	 }
 return true;
 }
}
