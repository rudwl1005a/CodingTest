package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1512 {
	public int numIdenticalPairs(int[] nums) {

		Map<Integer, Integer> map = new HashMap<>();

		int count = 0;

		for (int n : nums) {
			if (map.containsKey(n)) {
				map.put(n, map.get(n) + 1);
				count = count + map.get(n);
			} else
				map.put(n, 0);
		}

		return count;
	}
}
