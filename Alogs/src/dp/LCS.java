package dp;

import java.util.Collections;
import java.util.PriorityQueue;

public class LCS {

	public static void main(String[] args) {
		String s1 = "ACBDA";
		String s2 = "ADCA";
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		System.out.println(lcsRec(s1,s2,s1.length(),s2.length()) );
		System.out.println(lcsDP(c1,c2));
	}

	private static int  lcsDP(char[] c1, char[] c2) {
		int[][] temp = new int[c1.length +1][c2.length+1];
		int max = 0;
		StringBuffer sb = new StringBuffer();
		for(int i=1; i<temp.length;i++){
			for(int j=1;j<temp[i].length;j++){
				if(c1[i-1] == c2[j-1]){
					temp[i][j] = temp[i - 1][j - 1] + 1;
				}
				else
                {
                    temp[i][j] = Math.max(temp[i][j-1],temp[i-1][j]);
                }
				if(temp[i][j] > max){
                    max = temp[i][j];
                }
			}
		}
		System.out.println("The matched " + sb);
		return max;
	}

	public static int lcsRec(String s1, String s2, int s1len, int s2len) {
		if(s1len == 0 || s2len ==0)
			return 0;
		else if(s1.charAt(s1len-1) == s2.charAt(s2len -1)){
			return 1 + lcsRec(s1,s2, s1len-1, s2len-1);
		}
		else{
			return Math.max(lcsRec(s1,s2, s1len-1, s2len), lcsRec(s1,s2, s1len, s2len-1));
		}
		
	}
	
	
		
}
