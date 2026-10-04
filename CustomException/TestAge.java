package CustomException;

public class TestAge {
	public static void checkAge(int age) {
		if(age<18) {
			throw new IvalidAgeExceptionRun("Age is must be 18 or above");
		}
	 System.out.println("you are eligible");
	}

	
	  public static void main(String[] args) {
		checkAge(18);
	}
}
