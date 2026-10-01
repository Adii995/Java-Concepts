package ArrayDSA;

public class MinMax {
	public static void main(String[] args) {
		int[] arr= {10,209,32,5,80};
		
		maxMin(arr);
		

		
	}
	public static void maxMin(int[] a) {
		int max=a[0];
		int min=a[0];
		for(int x:a) {
			if(x>max)
    			max=x;
    		else if(x<min)
    			 min=x;
    	    }
		System.out.println(max);
		System.out.println(min);
		}
	}

