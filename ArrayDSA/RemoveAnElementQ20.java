package ArrayDSA;
import java.util.Scanner;
public class RemoveAnElementQ20 {
    public static void main(String[] args) {
    	int[] nums= {10,20,30,40,50,60,70};
    	Scanner sc=new Scanner(System.in);
    	int index=sc.nextInt();
    	int[] a=remove(nums,index);
    	for(int b:nums) {
    		System.out.print(b+" ");
    	}
    }
    public static int[] remove(int[] a,int index) {
    	if(index<0 || index>=a.length) {
    		System.out.println("Element can't be removed");
    		  return a;
    	}
    	int[] b=new int[a.length-1]; 
    	for(int i=0; i<b.length; i++) {
    		if(i<index)
    			b[i]=a[i];
    		else 
    			b[i]=a[i+1];
    	}
    	return b;
    }
}
