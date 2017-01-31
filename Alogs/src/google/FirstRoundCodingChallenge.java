package google;

/**
 * https://discuss.leetcode.com/topic/31565/the-longest-absolute-path-in-file-system/2
 * https://discuss.leetcode.com/topic/55360/
 * replace-two-adjacent-digits-with-larger-one-to-find-the-smallest-number-that-can-be-obtained * 
 */

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FirstRoundCodingChallenge {

	private static int longestPathLen(String in) {
		String lines[] = in.split("\\r?\\n");
		Map<Integer, String> dirMap = new HashMap<>();
		int max = 0;
		for (int i = 0; i < lines.length; i++) {
			String line = lines[i];
			int level = line.length() - line.replaceAll(" ", "").length();
			if (line.contains(".")) {
				StringBuilder build = new StringBuilder();
				for (int j = 0; j < level; j++) {
					build.append(dirMap.get(j) != null ? dirMap.get(j) + "/" : "");
				}
				int curLen = build.append(line.trim()).length();
				max = curLen > max ? curLen : max;
			} else {
				dirMap.put(level, line.trim());
			}
		}
		return max;
	}

	public static int obtainSmallest(int num) {

		String strNum = String.valueOf(num);
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

		for (int i = 0; i < strNum.length() - 1; i++) {
			String newString = i == 0 ? "" : strNum.substring(0, i);
			if (strNum.charAt(i) > strNum.charAt(i + 1)) {
				newString += strNum.charAt(i) + strNum.substring(i + 2, strNum.length());
			} else {
				newString += strNum.charAt(i + 1) + strNum.substring(i + 2, strNum.length());
			}
			queue.add(Integer.valueOf(newString));
		}

		return queue.poll();

	}

}
