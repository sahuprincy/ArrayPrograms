package easy;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int removeDuplicates = removeDuplicates(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 ,6,9});
		System.out.println("removeDuplicates:: " + removeDuplicates);
	}

	public static int removeDuplicates(int[] nums) {
		int index = 0;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[index])
				nums[++index] = nums[i];

		}
		return index + 1;
	}

}
