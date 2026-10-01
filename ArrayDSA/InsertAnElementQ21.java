package ArrayDSA;
import java.util.Scanner;
public class InsertAnElementQ21 {
     public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 int[] a= {10,20,30,40,50,70};
    	 System.out.println("Elements before insertion: ");
    	 for(int x:a)
    		  System.out.print(x+" ");
    	 System.out.println("\nEnter the Index: ");
    	 int index=sc.nextInt();
    	 System.out.println("Enter the value");
    	 int val=sc.nextInt();
    	 
    	 a=insert(a,index,val);
    	 System.out.println("Element After insertion");
    	 for(int x:a)
    		 System.out.print(x+" ");
     }
    public static int[] insert(int[] a,int index,int val) {
    	if(index<0 || index>a.length) {
    		System.out.println("Element cat't be insert at the given index");
    	  return a;
    	}
      int[] b=new int[a.length+1];
      b[index]=val;
      for(int i=0; i<b.length; i++) {
    	  if(i<index)
    		  b[i]=a[i];
    	  else if(i>index)
    		  b[i]=a[i-1];
      }
     return b;
    }
}
