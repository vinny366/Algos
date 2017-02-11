package google;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LargestSubStrin5Letter {
	/*
	 * Ans should be ffccd
	 * 
	 * abcbbbbcccbdddadacb :- bcbbbbcccb
	 */
	public static void main(String[] args) {
		String s = "abcbbbbcccbdddadacb";
		int distinct = 2;
		findLength(s, distinct);
	}

	public static void findLength(String s, int distinct) {
		Set<Character> hs = new HashSet<Character>();
		HashMap<Character, Integer> hm = new HashMap();
		int i = 0;
		int j = 0;
		int longestStr = 0;

		while ((hm.size() <= distinct) && i < s.length() && j < s.length()) {
			char ch = s.charAt(j);
			hm.put(ch, hm.containsKey(ch) ? hm.get(ch) + 1 : 1);
			j++;
			while (hm.size() == 3) {
				longestStr = Math.max(longestStr, j - i)-1;
				char oldch = s.charAt(i);
				
					hm.put(oldch, hm.get(oldch)-1);
					if (hm.get(oldch) == 0) {
						hm.remove(oldch);
					}
				i++;
			}
		}
		System.out.println(longestStr);

	}

}
