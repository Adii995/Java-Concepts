package Polymorphism;

public class Test {
	public static void test(String n) {
		System.out.println("this is StringArgMethod");
	}
    public static void test(int x) {
    	System.out.println("this is intArgumentMethosd");
    }
    public static void test(int x,double y) {
    	System.out.println("this is intAndDoubleArgMethod");
    }
    public static void test(double a) {
    	System.out.println("this is doubleArgMethod");
    }
    public static void test(float a) {
    	System.out.println("this is floatArMethos");
    }
   public static void main(String[] args) {
	   System.out.println("this is main methos");
	   Test t=new Test();
	   test(7);
	   test(3,2.3);
	   t.test(2.4);
	   t.test(23f);
	   t.test("Str");
	   t.test('c');
	   t.test(1231L);
	   t.test("hfhd");
	   
	   
   }
}
