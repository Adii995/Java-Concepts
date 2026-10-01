package ArrayDSA;

public class PrintAndCountPrimeQ35 {
   public static void main(String[] args) {
	   int[] a= {11,12,10,13,80,19};
	   printAndCountPrime(a);
   }
   public static boolean isPrime(int n) {
	   
	   if (n < 2) {
           return false;
       } else if (n == 2 || n == 3) {
           return true;
       } else if (n % 2 == 0) {
           return false;
       }
       for (int i = 3; i * i <= n; i += 2) {
           if (n % i == 0) {
               return false;
           }
       }

       return true;
   }
   public static void printAndCountPrime(int[] a) {
	   int count=0;
	   for(int x:a) {
		   if(isPrime(x)) {
			   System.out.print(x+" ");
			   count++;
			  }
	   }
	   System.out.println("\nTotal Prime number: "+ count);
   }
}
