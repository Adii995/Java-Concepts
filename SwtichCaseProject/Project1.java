package SwtichCaseProject;
import java.util.Scanner;
public class Project1 {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	 char c;
	  do {
	   System.out.println("Press 1=>For Factorial calculation");
	   System.out.println("Press 2=>For Power calculatoin");
	   System.out.println("Press 3=>To Generate multiplication Table up to n numbers");
	   System.out.println("Press 9=>To Generate Multiplication Table up to n numbers");
	   
	   int choice=sc.nextInt();
	   switch(choice) {
	   case 1:
		    System.out.println("You have selected Factorial Operation");
		    System.out.println("Enter the Number");
		    int n=sc.nextInt();
		    int fact=1;
		    for(int i=1; i<=n; i++) 
		       fact=fact*i;
		       System.out.println(n+"!="+fact);
		       break;
	   case 2:
		      System.out.println("You have selected Power Operation");
		      System.out.println("Enter a:");
		      int a=sc.nextInt();
		      System.out.println("Enter b:");
		      int b=sc.nextInt();
		      int power=getPower(a,b);
		      System.out.println(a+"to Power"+b+"is:"+power);
		      break;
	   case 3:
		      System.out.println("You have selected Table Operation");
              System.out.println("Enter n:");
              int d=sc.nextInt();
              generateTable(d);
              break;
	   case 9:
		   System.out.println("You have selected Table Operation upto n Numbers");
		   System.out.println("Enter the Number");
		   int x=sc.nextInt();
		   generateTableUptoNNumbers(x);
      default:
    	  System.out.println("Invalid choice Entered!Please select valid choice");
	   }
	   System.out.println("Press Y/y to continue...");
	   c=sc.next().charAt(0);
    }while(c=='Y'|| c=='y');
	   System.out.println("==========Program Ends========");
	}
    public static int getPower(int a,int b) {
    	int pow=1;
    	for(int i=1; i<=b; i++)
    	   pow=pow*a;
      return pow;
    }
    public static void generateTable(int n) {
    	for(int i=1; i<=10; i++)
    		System.out.println(n+"*"+i+"="+n*i); 	
    }
    public static void generateTableUptoNNumbers(int n) {
    	for(int i=1; i<=n; i++) {
    	   for(int j=1; j<=10; j++) 
    		   System.out.println(i+"*"+j+"="+i*j); 	
    }
    	System.out.println("=========");
   }
}  
