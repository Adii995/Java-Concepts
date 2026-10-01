package ArrayDSA;

public class FirstRepeatedEleFreq {
	public static void main(String[] args) {
		int[] a= {10,12,10,23,24,24,13,12};
		int result=firstRepeated(a);
		System.out.println(result);
	}
public static int firstRepeated(int[] a) {
	int min=a[0],max=a[0];
	for(int n:a) {
		if(n>max)
			max=n;
		else if(n<min)
			min=n;
	}
	int[] freq=new int[max-min+1];
	for(int n:a)
		freq[n-min]++;
	for(int i=0; i<a.length; i++) {
		if(freq[a[i]-min]>1)
			return i;
	}
	return -1;
}
}
