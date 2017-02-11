package google;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LargestWord {

	public static void main(String[] args) throws IOException {
		String word = "leiklrl";
		char[] letters = word.toCharArray();
		Map<Character,Integer> questionMap = new HashMap();
		for(char ch : letters){
			questionMap.put(ch, questionMap.get(ch)>0?questionMap.get(ch)+1 : 1);
		}
	}

	public static void readFile() throws IOException {		
		BufferedReader br = new BufferedReader(new FileReader(new File("words.txt")));
		String line;
		while( (line=br.readLine())!= null){
			System.out.println(line);
		}
	}

}
