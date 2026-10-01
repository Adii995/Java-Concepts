package ArrayDSA;

public class PeakElementIndexInArray {
   public static void main(String[] args) {
	int [] arr= {1,2,3,5,9};
	int res=peakElement(arr);
	System.out.println("Peak Element index is "+ res);
	
    }
   public static int peakElement(int[] arr) {
	   int start=0; int end=arr.length-1;
	   while(start<end) {
		   int mid = start+(end-start)/2;
		   if(arr[mid]<arr[mid+1])
			   start=mid+1;
		   else
			   end = mid;
	   }
	   return end;
   }
}
