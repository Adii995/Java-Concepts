package ArrayDSA;

public class IntersectionInArray {
     public static void main(String[] args) {
		int [] a = {10,20,30,40,50}; int [] b = {30,20,40,50,70};
		interSection(a,b);
		
		
	}
     
     public static void interSection(int[] a,int[] b) {
    	 boolean flag=false;
    	 for(int i=0; i<a.length; i++) {
    		 for(int j=0; j<b.length; j++) {
    			 if(a[i]==b[j]) {
    				 System.out.print(a[i]+" ");
    			    flag=true;
    			 }
    			
    		 }
    	 }
    		 if(flag) {
    			 System.out.println("These are InterSection Element");
    		 }else {
    			 System.out.println("There are No InterSection Element");
    			 
    		 }
    	
     }

}
