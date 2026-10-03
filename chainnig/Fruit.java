package cons.chainnig;

public class Fruit {
	String name;
	int price;
	String color;
	double weight;
	String test;
	
        Fruit(){
        
}
Fruit(String name){
	
	this();
	this.name=name;	
}
Fruit(String name,int price){
	this(name);    
	this.price=price;
}
Fruit(String name,int price,String color){
	this(name,price);
	this.color=color;
}
Fruit(String name,int price,String color,double weight){
	this(name,price,color);
	this.weight=weight;
}
Fruit(Fruit p){
	this(p.name,p.price,p.color,p.weight);
}
	public String getDetails(){
		return "Name is: "+name+"\nPrice is: "+price+"\nCOlor is: "+color+"\nWeight is: "+weight+"\ntest is:"+test+"\n=====================";
		}
		
}

