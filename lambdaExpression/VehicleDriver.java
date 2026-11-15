package lambdaExpression;

public class VehicleDriver {
    public static void main(String[] args) {
		Vehicle car=()->System.out.println("Start Car");
		Vehicle bike=()->{
			System.out.println("You got bike");
			System.out.println("start bike");
		};
		car.start();
		bike.start();
		
		Vehicle v;
		v=()->System.out.println("Start Bus");
		v.start();
		System.out.println("=================");
		test(()->System.out.println("abcd"));
	}
    public static void test(Vehicle t) {
    	System.out.println("test method");
    }
}
