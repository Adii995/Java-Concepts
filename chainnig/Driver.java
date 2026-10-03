package cons.chainnig;

public class Driver {
	public static void main(String[] args) {
		Fruit f1=new Fruit();
		Fruit f2=new Fruit("mango");
		Fruit f3=new Fruit("orange",240);
		Fruit f4=new Fruit("apple",320,"black");
		Fruit f5=new Fruit("mango",270,"weight",3.5);
		Fruit f6=new Fruit("lemon",50,"green");
		Fruit f7=new Fruit(f5);
		Fruit f8=new Fruit(f4);
		Fruit f9=new Fruit(f2);
		
		
		
		System.out.println(f1.getDetails());
	    System.out.println(f2.getDetails());
	    System.out.println(f3.getDetails());
	    System.out.println(f4.getDetails());
	    System.out.println(f5.getDetails());
	    System.out.println(f6.getDetails());
	    System.out.println(f7.getDetails());
	    System.out.println(f8.getDetails());
	    System.out.println(f9.getDetails());
		
		
	}
	
     
}
