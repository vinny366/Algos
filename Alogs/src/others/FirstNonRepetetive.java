package others;

import java.util.HashMap;
/**
 * Idea 1 : 
 * 			Traverse the array --> put the key and count (value);
 * 			Traverse the string again to check if count =1 ; [ we are iterating here 2 times ]
 * Idea 2 : 
 * 			Initially we create an array of 256 chars all[-1]
 * 			
 * 			We store the index of the character in the array;
 * 			if(-1)  --> (index num ) 
 * 			if(>=0 -- make it to -2) 
 * 			Now go through the index  only 256 at any point any get the  1st non repeating
 * @author Vinny366
 *
 */
public class FirstNonRepetetive {

	public static void main(String[] args) {
		
		String testString = "abcdeabckdef";
		char op;
		int min = Integer.MAX_VALUE;
		int[] charIdx = new int[256]; 
	    for(int i = 0; i < 256; i++) {
	            charIdx[i] = -1;
	        }
	    
	    for(int j =0;j<testString.length();j++){
	    	if(charIdx[testString.charAt(j)] == -1){
	    		charIdx[testString.charAt(j)] = j;
	    	}else{
	    		charIdx[testString.charAt(j)] = -2;
	    	}	    	
	    }
	  
	    for(int i=0;i<charIdx.length;i++){
	    	if(charIdx[i]>=0){
	    		min = Math.min(min, charIdx[i]);
	    	}
	    }
	    	
	    System.out.println(min);
	    
	    System.out.println();
	    
	    

	}

}
