package ArrayDSA;

public class AssiIQ7getAverage {
    public static void main(String[] args) {
    int[] nums={24,20,50,29,34,55,64};
    double average=getAverage(nums);
    System.out.println("Average is"+average);
   
  }
 public static double getAverage(int[] arr){
     int sum=0;
     for(int i=0; i<arr.length; i++){
        sum=sum+arr[i];
     }
    // System.out.println("Average is:"+sum/arr.length);
   return sum/arr.length;
 }
}