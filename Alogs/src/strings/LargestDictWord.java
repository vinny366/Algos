package strings;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class LargestDictWord {
	
	public static void main(String[] args) {
		
		// Defining local variables
		String fileName = "wordList.txt";
		char[] letterList = {'a','l','l','i','e','s','m'};
		
        // Create a dictionary of the list of letters and their count
		HashMap<Character, Integer> letterCount = new HashMap<Character, Integer>();
		for(char l : letterList)
			letterCount.put(l, letterCount.containsKey(l) ? letterCount.get(l) + 1	:  1);
		
		// Read the file line by line to find the longest word
		String line;
		char[] lineChars;
		Integer currlineLength;
		Integer tempLongestWordLength=0;
		ArrayList<String> currLongestWords = new ArrayList<String>();
		HashMap<Character, Integer> tempLCount = new HashMap<Character, Integer>();
		BufferedReader br;
		
		try {
			br = new BufferedReader(new FileReader(new File(fileName)));	
			while((line = br.readLine()) != null) {
				
				//Storing the dictionary temporarily in tempLCount
				tempLCount.putAll(letterCount);
				
				//Reset currlineLength
				currlineLength=0;
				
				//don't go further if the current line length is shorter than the current longest word length
				if(line.length() < tempLongestWordLength) continue;
				
				//convert string to character array, so that we can loop through each letter
				lineChars = line.toCharArray();
				for(Character lc : lineChars){
					
					//if the letterCount contains the key we move forward or we break this for loop and continue with the next line 
					if(!letterCount.containsKey(lc)) break;
					
					//subtract from the available count of letters
					tempLCount.put(lc,tempLCount.get(lc) - 1);
					
					//if the count of the letter exceeds the count in the letter list then break this for loop
					if(tempLCount.get(lc) < 0) break;
					
					//increase the count of the letters that wen through
					currlineLength++;
				}
				
				//If the count of the letters that went through is same as the length of the line string then there was a match
				if(currlineLength == line.length()){
					
					//If the current line length is greater than the longest word length then we clear the currLongestWord list 
					//and put this new one and change the longest length to the current line length 
					if(line.length() > tempLongestWordLength){
						tempLongestWordLength = line.length();
						currLongestWords.clear();
					}
					
					//Finally add the line to the currLongestWords list
					currLongestWords.add(line);					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//Print out the list of longest words
		System.out.println(currLongestWords);
	}
}