package ArrayDSA;

public class SecSmallest {
	public static void main(String[] args) {
	    int[] arr= {8,1,5,9,3,2};	
	    int res=SecSmallest(arr);
	    System.out.println(res);
	}
	
	public static int SecSmallest(int[] arr) {
		int small = Integer.MAX_VALUE;
		int SecSmall = Integer.MAX_VALUE;
	for(int x:arr) {
		if(x<small) {
			SecSmall = small;
			small=x;
		}else if(x<SecSmall && x!=small) {
			SecSmall = x;
		}
	 
	   }
	return SecSmall;
	}
	

}
