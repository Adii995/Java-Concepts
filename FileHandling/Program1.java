package FileHandling;
import java.io.File;
public class Program1 {
    public static void main(String[] args) {
    	System.out.println("Program Starts");
    	
    	File f1 = new File("D:\\abc.txt");
    	try {
    		f1.createNewFile();
    		System.out.println("File is Create");
    		System.out.println(f1.length());
    	}catch(Exception e) {
    		System.out.println("File is Not Create");
    		System.out.println("Location Not Found");
    		System.out.println(e.getMessage());
    	}
    	System.out.println("Program Ends!"); 
    }
}
