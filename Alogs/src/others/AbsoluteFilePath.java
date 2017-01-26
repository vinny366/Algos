package others;

import java.util.HashMap;
import java.util.Map;

public class AbsoluteFilePath {

	public static void main(String[] args) {
		String input = "dir1\n dir11\n dir12\n  picture.jpeg\n  dir121\n  file1.txt\ndir2\n file2.gif";
		String eachLine[] = input.split("\\r?\\n");
		Map<Integer, String> maps_dirs = new HashMap<Integer, String>();
		int maximum = 0;
		int i =0;
		while(i<eachLine.length) {
			String line = eachLine[i];
			int lvl = line.length() - line.replaceAll(" ", "").length();
			if (line.contains(".jpeg") || line.contains(".png") || line.contains(".gif")) {
				StringBuilder sb = new StringBuilder();
				int j =0;				
				while(j < lvl) {
					sb.append(maps_dirs.get(j) != null ? maps_dirs.get(j) + "/" : "");
					j++;
				}
				maximum = sb.length() > maximum ? sb.length() : maximum;
			} else {
				maps_dirs.put(lvl, line.trim());
			}
			i++;
		}
		System.out.println(maximum);
		}
	}


