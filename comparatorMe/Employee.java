package comparatorMe;

public class Employee {
   String name;
   int age;
   String id;
   double salary;
   Employee(){
	   
   }
   Employee(String name,int age,String id,double salary){
	    this.name=name;
	    this.age=age;
	    this.id=id;
	    this.salary=salary;
   }
   @Override
   public String toString() {
	return "Employee [name=" + name + ", age=" + age + ", id=" + id + ", salary=" + salary + "]";
   }
   
}
