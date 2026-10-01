package ArrayDSA;

public class AssiIQ8printAndCount {
	public static void main(String[] args) {
		int[] nums = { 20, 10, 30, 50, 49, 70, 67 };
		printAndCount(nums);

	}

	public static void printAndCount(int[] nums){
		double sum = 0;
		for (int i = 0; i < nums.length; i++)
			sum = sum + nums[i];
		double average = sum / nums.length;
		System.out.println("Bigger elements then average:");
		int count = 0;
		for (int x : nums) {
			if (x > average) {
				System.out.print(x + " ");
				count++;
			}

		}

		System.out.println("\nTotal elements are: " + count);
	}
}