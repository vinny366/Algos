package dp;

public class LongestPalindromicSubString {

	public static void main(String[] args) {
		String s = "bqwera";
		String op = longestPalindrome(s);
		System.out.println(op);
	}
	
	 public static String longestPalindrome(String s) {
	 	int len = s.length();
	 	boolean[][] temp = new boolean[len][len];
	 	int begin = 0;
	 	int maxLen = 1;
	 	// for 1
	 	for(int i=0;i<len;i++){
	 		temp[i][i] = true;
	 	}

	 	// for 2

	 	for(int i=0;i<len-1;i++){
			if(s.charAt(i) == s.charAt(i+1)){
	 			temp[i][i+1] = true;
	 			begin = i;
	 			maxLen = 2;
	 		}
	 	}

	 	// for 3

	 	for(int curlen = 3; curlen <= len; curlen++){
	 		for(int i=0;i<len-curlen+1;i++){
	 			int j = i+curlen -1;
	 			if(s.charAt(i) == s.charAt(j) && temp[i+1][j-1]){
	 				temp[i][j] = true;
	 				begin = i;
	 				maxLen = curlen;
	 			}
	 		}
	 	}

	 	return s.substring(begin,begin+maxLen);

	 }
	       

}
