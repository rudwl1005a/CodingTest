package Programmers;

import java.util.HashMap;
import java.util.Map;

public class Programmers42576 {
	public String solution(String[] participant, String[] completion) {

		Map<String, Integer> com = new HashMap<>();

		for (String c : completion) {
			if (com.containsKey(c)) {
				com.put(c, com.get(c) + 1);
			} else
				com.put(c, 1);
		}

		for (String p : participant) {
			if (com.containsKey(p)) {
				if (com.get(p) == 0)
					return p;
				else
					com.put(p, com.get(p) - 1);
			} else
				return p;
		}

		return null;
	}
}
