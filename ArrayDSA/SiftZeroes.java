package ArrayDSA;

public class SiftZeroes {
   public static void main(String[] args) {
	   int[] a={0,1,0,1,0,0,1,1,0};
	   ShiptZeroes(a);
  	 for(int b:a) {
  		 System.out.print(b+" ");
  	 }
   }
  public static void ShiptZeroes(int[] a){
	  for(int i=0, j=0; i<a.length; i++) {
		  if(a[i]!=0) {
			  if(i!=0) {
			  a[j]=a[i];
			  a[i]=0;
			j++;
		 }
	  }
	}
  }
}
