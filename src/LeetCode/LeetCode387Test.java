package LeetCode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LeetCode387Test {

	@Test
	void test() {
		LeetCode387 e = new LeetCode387();

		assertEquals(0, e.firstUniqChar("leetcode"));
		assertEquals(2, e.firstUniqChar("loveleetcode"));
		assertEquals(-1, e.firstUniqChar("aabb"));
	}

}
