package Encapsulation;
import java.util.*;
public class EmployDriver {
       public static void main(String[] args) {
    	   Scanner sc=new Scanner(System.in);
    	   
    	   Employ e1=new Employ();
    	   
    	   System.out.println("Enter the Age");
    	   int age1=sc.nextInt();
    	   sc.nextLine();
    	   
    	   System.out.println("Enter the Name");
    	   String name1=sc.nextLine();
    	   
    	   System.out.println("Enter the Id");
    	   int id1=sc.nextInt();
    	   sc.nextLine();
    	   
    	   System.out.println("Enter the Company");
    	   String company1=sc.next();
    	   
    	   System.out.println("Enter the Salary");
    	   double salary1=sc.nextDouble();
    	   
    	   System.out.println("Enter the Phone");
    	   long phone1=sc.nextLong();
    	   
    	   e1.setAge(age1);
    	   e1.setName(name1);
    	   e1.setId(id1);
    	   e1.setCompany(company1);
    	   e1.setSalary(salary1);
    	   e1.setPhone(phone1);
    	   
    	   System.out.println("=======Details Are==========");
    	  
           System.out.println("Age is:"+e1.getAge());
    	   System.out.println("Name is:"+e1.getName());
    	   System.out.println("Id is :"+e1.getId());
    	   System.out.println("Company is:"+e1.getCompany());   	   
    	   System.out.println("Salary is:"+e1.getSaraly());
    	   System.out.println("Phone is:"+e1.getPhone());
    	   
       }
}
