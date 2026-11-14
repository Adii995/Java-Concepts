package VariableHiding;

public class ABDriver {
   public static void main(String[] args) {
	  A a = new B();
	 System.out.println(a.x);
	 System.out.println(A.y);
	 a.task();
}
}
