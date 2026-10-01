package ArrayDSA;

public class ShiftZero {
    public static void main(String[] args) {
		int[] a = {0,1,2,0,2,0,1,0};
		shiftZeo(a);
		for(int x:a) {
			System.out.print(x+" ");
		}
		
	}
    
    public static void shiftZeo(int[] a) {
    	int low=0;
    	int mid=0;
    	int high=2;
    	while(mid<=high) {
    		if(a[mid]==0) {
    			swap(a,low,mid);
    			low++;
    			mid++;
    		}else if(a[mid]==1) {
    			mid++;
    		}else {
    			swap(a,mid,high);
    			high--;
    		}
    	}
    	
    	
    	
    }
    public static void swap(int[] a,int low,int mid) {
    	int temp=a[low];
        a[low]=a[mid];
    	a[mid]=temp;
    	
    }
    
    
}
