package FileHandling;
import java.io.File;
import java.io.FileWriter;
public class Program2 {
    public static void main(String[] args) {
    	System.out.println("Program Starts");
    	File f1=new File("Dz://User.txt");
    	try {
    		FileWriter fw=new FileWriter(f1);
    		fw.write("Mohan and sohan are here:");
    		fw.write("It is java class");
    		System.out.println("File Writing is completed");
    		fw.close();
    	}catch(Exception e) {
    		System.out.println(e.getMessage());
    	}
    	System.out.println("Program Ends! ");
    }
}
