package LeetCode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LeetCode1512Test {

	@Test
	void test() {
		LeetCode1512 e = new LeetCode1512();

		assertEquals(4, e.numIdenticalPairs(new int[] { 1, 2, 3, 1, 1, 3 }));
		assertEquals(6, e.numIdenticalPairs(new int[] { 1, 1, 1, 1 }));
		assertEquals(0, e.numIdenticalPairs(new int[] { 1, 2, 3 }));
	}

}
