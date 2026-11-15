package lambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class Program3 {
  public static void main(String[] args) {
	List<String> l1 = new ArrayList<>();
	l1.add("Mohan");l1.add("Sohan");l1.add("john");l1.add("Mac");l1.add("Man Mohan");l1.add("Hari Mohan");
	System.out.println(l1);
	l1.sort((s1,s2)->s1.compareTo(s2));
	System.out.println(l1);
	l1.sort((s1,s2)->s1.compareToIgnoreCase(s2));
	System.out.println(l1);
	l1.sort((String s1,String s2)->s1.length()-s2.length());
	
    }
}
