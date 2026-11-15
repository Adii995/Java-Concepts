package lambdaExpression;

import java.util.ArrayList;

import java.util.List;

public class Program2 {
   public static void main(String[] args) {
	List<Integer> l1 = new ArrayList<>();
	l1.add(8);l1.add(10);l1.add(20);l1.add(30);l1.add(40);l1.add(34);
	System.out.println(l1);
	
//	l1.sort((a,b)->a-b);//natural sorting assending order
//	System.out.println(l1);
//	l1.sort((a,b)->b-a);//descending order
//	System.out.println(l1);
	
	
	
	l1.sort((a,b)->getDigitSum(a)-getDigitSum(b));
	System.out.println(l1);
}

   private static int getDigitSum(Integer b) {
	// TODO Auto-generated method stub
	return 0;
   }
}
