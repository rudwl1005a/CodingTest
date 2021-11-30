package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1 {
	public int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> tg = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int diff = target - nums[i];
			if (tg.containsKey(diff)) {
				return new int[] { tg.get(diff), i };
			}
			tg.put(nums[i], i);
		}

		return null;
	}
}
