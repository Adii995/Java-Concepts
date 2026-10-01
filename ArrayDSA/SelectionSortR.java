package ArrayDSA;

public class SelectionSortR {
     public static void main(String[] args) {
		int[] a = {30,50,35,34,90,10};
		selectionSort(a);
		for(int x:a) {
			System.out.print(x+" ");
		}
	}
     public static void selectionSort(int[] a) {
    	 for(int i=0; i<a.length-1; i++) {
    		 int min=a[i]; int minIndx=i;
    	 for(int j=i+1; j<a.length; j++) {
    		 if(a[j]<min) {
    			 min=a[j];
    			 minIndx=j;
    		 }
    	   }
    	 a[minIndx]=a[i];
    	   a[i]=min;
    	 }
     }
}
