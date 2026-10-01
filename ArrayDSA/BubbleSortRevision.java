package ArrayDSA;

public class BubbleSortRevision {
     public static void main(String[] args) {
		int[] arr = {40,10,60,20,50,30};
		System.out.println("Before Sorting");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		bubble(arr);
		System.out.println("\nAfter Sorting");
		for(int res:arr) {
			System.out.print(res+" ");
		}
	}
     public static void bubble(int[] arr) {
    	 for(int i=0; i<arr.length-1; i++) {
    		 for(int j=0; j<arr.length-1-i; j++) {
    			 if(arr[j]>arr[j+1]) {
    				 int temp = arr[j];
    			     arr[j]=arr[j+1];
    			      arr[j+1]=temp;
    			 }
    		 }
    	 }
     }
}
