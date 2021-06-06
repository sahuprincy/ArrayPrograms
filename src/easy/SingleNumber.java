package easy;

import java.util.HashMap;

public class SingleNumber {

	public static void main(String[] args) {
		int singleNumber = singleNumber(new int[] { 1, 2, 4, 4 });
		System.out.println("singleNumber:: " + singleNumber);
	
	}

	@SuppressWarnings("deprecation")
	public static int singleNumber(int[] nums) {

		 HashMap<Integer, Integer> hash_table = new HashMap<>();

		    for (int i : nums) {
		      hash_table.put(i, hash_table.getOrDefault(i, 0) + 1);
		    }
		    for (int i : nums) {
		      if (hash_table.get(i) == 1) {
		        return i;
		      }
		    }
		    return 0;
		  }

}
