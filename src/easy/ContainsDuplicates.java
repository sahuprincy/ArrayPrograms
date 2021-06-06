package easy;

import java.util.HashSet;

public class ContainsDuplicates {

	public static void main(String[] args) {
		boolean containsDuplicate = containsDuplicate(new int[] { 1, 2, 4, 4 });
		System.out.println("containsDuplicate:: " + containsDuplicate);
	}

	public static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<>();

		// Traverse the input array
		for (int i = 0; i < nums.length; i++) {
			// If already present n hash, then we found
			// a duplicate within k distance
			if (set.contains(nums[i]))
				return true;

			// Add this item to hashset
			set.add(nums[i]);
		}
		return false;
	}

}
