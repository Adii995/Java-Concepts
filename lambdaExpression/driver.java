package lambdaExpression;

public class driver {
  public static void main(String[] args) {
	 
	  Calculator sum = (int a,int b)->System.out.println("Sum of "+(a+b));
	  
	  Calculator power = (x,y)->{
		  int pow = 1;
		  for(int i=1; i<=y; i++)
			  pow = pow*x;
		  System.out.println(x+"to power"+y+"is:"+pow);
	  };
	  power.get(8, 3);
}
}
