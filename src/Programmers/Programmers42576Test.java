package Programmers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Programmers42576Test {

	@Test
	void test() {
		Programmers42576 e = new Programmers42576();

		assertEquals("leo", e.solution(new String[] { "leo", "kiki", "eden" }, new String[] { "eden", "kiki" }));
		assertEquals("vinko", e.solution(new String[] { "marina", "josipa", "nikola", "vinko", "filipa" },
				new String[] { "josipa", "filipa", "marina", "nikola" }));

		assertEquals("mislav", e.solution(new String[] { "mislav", "stanko", "mislav", "ana" },
				new String[] { "stanko", "ana", "mislav" }));
		assertEquals("mislav", e.solution(new String[] { "mislav", "stanko", "stanko", "mislav", "ana" },
				new String[] { "stanko", "stanko", "ana", "mislav" }));
	}

}
