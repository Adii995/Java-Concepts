package Encapsulation;
import java.util.*;
public class productDriver {
	public static void main(String[] args) {
 	   Scanner sc=new Scanner(System.in);
 	   
 	   product p1=new product();
 	   
 	   System.out.println("Enter the Product ");
 	   String product1=sc.nextLine();
 	   
 	   System.out.println("Enter the productName");
 	   String productName1=sc.nextLine();
 	   
 	   System.out.println("Enter the Company");
 	   String company1=sc.nextLine();
 	   
 	   System.out.println("Enter the Price");
 	   double price1=sc.nextDouble();
 	   
 	   System.out.println("Enter the Ram");
 	   int ram1=sc.nextInt();
 	   
 	   System.out.println("Enter the Ssd");
 	   int ssd1=sc.nextInt();
 	   
 	   System.out.println("Enter the Discount");
 	   double discount1=sc.nextDouble();
 	   
 	   p1.setProduct(product1);
 	   p1.setproductName(productName1);
 	   p1.setCompany(company1);
 	   p1.setPrice(price1);
 	   p1.setRam(ram1);
 	   p1.setSsd(ssd1);
 	   p1.setDiscount(discount1);
 	   
 	   System.out.println("=======Details Are==========");
 	  
       System.out.println("Product is:"+p1.getDiscount());
 	   System.out.println("productName is:"+p1.getproductName());
 	   System.out.println("company is :"+p1.getCompany());
 	   System.out.println("price is:"+p1.getPrice());   	   
 	   System.out.println("Ram is:"+p1.getRam());
 	   System.out.println("Ssd is:"+p1.getSsd());
 	   System.out.println("Discount is:"+p1.getDiscount());
 	   
    }
}


