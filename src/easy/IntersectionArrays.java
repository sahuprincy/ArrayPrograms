package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class IntersectionArrays {

	public static void main(String[] args) {
		int a[] = new int[] { 9, 4, 5, 6, 7 };
		int b[] = new int[] { 9, 4, 4 };
		int[] intersect = intersect(a, b);
		System.out.println("intersect:: " + Arrays.toString(intersect));

	}

	public static int[] intersect(int[] nums1, int[] nums2) {

		HashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int i : nums1) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}

		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i : nums2) {
			if (map.containsKey(i)) {
				if (map.get(i) > 1) {
					map.put(i, map.get(i) - 1);
				} else {
					map.remove(i);
				}
				list.add(i);
			}
		}

		int[] result = new int[list.size()];
		int i = 0;
		while (i < list.size()) {
			result[i] = list.get(i);
			i++;
		}

		return result;
	}

}
