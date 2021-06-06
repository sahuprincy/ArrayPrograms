package easy;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		int a[] = new int[] { 9, 4, 0, 5, 6, 0, 7 };
		moveZeroes(a);
		printArray(a, a.length);
	}

	public static void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	public static void moveZeroes(int[] nums) {
		int count = 0;
		int temp;

		for (int i = 0; i < nums.length; i++) {
			if ((nums[i] != 0)) {
				temp = nums[count];
				nums[count] = nums[i];
				nums[i] = temp;
				count = count + 1;
			}
		}
	}

}
