package lambdaExpression;

import java.util.ArrayList;
import java.util.Collection;

public class Program1 {
   public static void main(String[] args) {
    Collection<Integer> c1 = new ArrayList<>();	
    c1.add(2);c1.add(3);c1.add(4);c1.add(5);c1.add(9);
    System.out.println("=====================");
    c1.forEach((n)->System.out.println(n*n+" "));
    System.out.println("===================");
    c1.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
}
}
