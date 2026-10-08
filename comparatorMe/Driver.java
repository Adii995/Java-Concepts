package comparatorMe;

import java.util.ArrayList;
import java.util.List;

public class Driver {
   public static void main(String[] args) {
	List<Employee> l = new ArrayList<>();
	Employee e1 = new Employee("john",23,"E001",15000.0);
	l.add(e1);
	l.add(new Employee("Amit",22,"E002",27000.0));
	l.add(new Employee("Mohan",24,"E003",23000.0));
	l.add(new Employee("David",20,"E004",21000.0));
	l.add(new Employee("Rohan",27,"E005",42000.0));
	l.add(new Employee("Jack",19,"E006",13000.0));
	l.add(new Employee("Jon",20,"E007",18000.0));
	l.add(new Employee("Mack",26,"E008",30000.0));
	l.add(new Employee("Doe",25,"E009",32000.0));
	l.add(new Employee("Eve",40,"E0010",52000.0));
	
	System.out.println("Before Sorting");
	for(Employee e:l) {
		System.out.println(e);
	}

	System.out.println("===========Sorting On Age===============");
	l.sort((Employee x,Employee y)->x.age-y.age);
	for(Employee e:l) {
		System.out.println(e);
	}
	System.out.println("===========Sorting On Salary===============");
	l.sort((Employee x,Employee y)->x.salary>y.salary?1:x.salary<y.salary?-1:0);
	for(Employee e:l) {
		System.out.println(e);
	}
	System.out.println("===========Sorting On Name===============");
	l.sort((Employee x,Employee y)->x.name.compareToIgnoreCase(y.name));
	for(Employee e:l) {
		System.out.println(e);
	}
}
}
