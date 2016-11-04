package dp;

public class LongestPalindromicSubSequeence {

	public static void main(String[] args) {
		String s ="agbdba";
		//claculate(s);
		int y =claculateDP(s.toCharArray(), 0, s.length());
		System.out.println(y);
		
	}


	private static int claculateDP(char[] s, int start, int len) {
		if(len==1)
			return 1;
		if(len ==0)
			return 0;
		else if(s[start] == s[len-1]){
			return 2 + claculateDP(s,start+1,len-2);
		}else{
			return Math.max(claculateDP(s,start+1,len-1), claculateDP(s,start,len-2));
		}
		
	}


	public static void claculate(String s) {
		int min = 0;
		int len = s.length();
		/**
		 * No need extra len for this   000 
		 */
		int[][] temp = new int[len][len];
		/**
		 * Only upper half of matrix is populated in this problem
		 */
		for(int i=0; i<len; i++){
			temp[i][i] = 1;
		}
		/**
		 * We consider group sizes from 2 to len
		 */
		for(int groupsize=2; groupsize<=len; groupsize++){
			for(int i=0;i<len-groupsize + 1;i++){
				int j = i+groupsize-1;
				if(groupsize==2 && s.charAt(i) == s.charAt(j)  ){
					temp[i][j] = 2;
				}else if(s.charAt(i) == s.charAt(j)) {
					temp[i][j] = temp[i+1][j-1] + 2;
				}else{
					temp[i][j] = Math.max(temp[i + 1][j],temp[i][j-1]);
				}
			}
		}
		System.out.println(temp[0][len-1]);
	} // cal fun

}
