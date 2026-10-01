package ArrayDSA;

public class StoreFNPrimeNumbersQ39 {
	public static void main(String[] args) {
		int[] result=getPrimes(5);
//		System.out.println(result);
		for(int x:result){
			System.out.print(x+" ");
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
    public static int[] getPrimes(int n) {
    	int[] primes=new int[n];
    	int i=0;
    	for(int num=2; ; num++) {
    		if(isPrime(num)) {
    			primes[i++]=num;
    			if(i==n)
    				return primes;
    		}
    	}
    }
}
