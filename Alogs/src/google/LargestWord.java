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
			questionMap.put(ch, questionMap.containsKey(ch)?questionMap.get(ch)+1 : 1);
		}
		
		BufferedReader br = new BufferedReader(new FileReader(new File("words.txt")));
		String line;
		int MaximumTillNow = 0;
		Map<Character,Integer> tempMap = null;
		
		int curLineLength = 0;
		char[] currentLineChar;
		while( (line=br.readLine())!= null){
//			System.out.println(line);
			tempMap.putAll(questionMap);
			if(line.length() <= MaximumTillNow)
				continue;
			
			currentLineChar = line.toCharArray();
			for(char c: currentLineChar){
				if(!tempMap.containsKey(c)){ break;}
				if(tempMap.get(c) <=0 ) {break;}
				tempMap.put(c, tempMap.get(c) - 1);
				curLineLength++;
			}
		}
		
		if(curLineLength == line.length()){
			
		}
		
	}


}
