package ArrayDSA;

public class StoreNPrimeNumbersQ38 {
	public static void main(String[] args) {
		   int[] a= {11,12,10,13,80,19};
		   printAndCountPrime(a);
		   for(int x:a) {
			   System.out.println(x);
		   }
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
	   public static int[] printAndCountPrime(int[] n) {
		   int[] primes=new int[n.length];
		   int index=0;
		   for(int i=2; ; i++) {
			   if(isPrime(i))
				    primes[index++]=1;
			   if(index>=n) {
				 return primes;
				  }
		   }
		   
}
