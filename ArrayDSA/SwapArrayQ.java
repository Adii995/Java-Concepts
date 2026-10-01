package ArrayDSA;

public class SwapArrayQ {
	public static void main(String[] args) {
	    int[] a={10,20,30,40,50};
	    int[] b={2,4,6,8,10};
	    System.out.println("Before Swapping array Elements are:");
	    displayValues(a);
	    System.out.println();
	    displayValues(b);
	    System.out.println();
	    int[] temp=a;
	    a=b;
	    b=temp;
	    System.out.println("After Swapping array Elements are:");
	    displayValues(a);
	    System.out.println();
	    displayValues(b);
	  }
	  public static void displayValues(int[] nums){
	    for(int x:nums)
	     System.out.print(x+" ");
	  }
  }
