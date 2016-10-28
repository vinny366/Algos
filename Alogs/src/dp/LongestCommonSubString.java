package dp;

public class LongestCommonSubString {

	public static void main(String[] args) {
		String s1 = "abcdaf";
		String s2 ="zbcdf";
		
		int maxLen = cal(s1,s2); 
		System.out.println(maxLen);
	}

	public static int cal(String s1, String s2) {
		int[][] temp = new int[s1.length()+1][s2.length()+1];
		int max =0;
		for(int i=1; i<6; i++){
			for(int j =1;j<5; j++){
				if(s1.charAt(i-1) == s2.charAt(j-1)){
					int updated = temp[i-1][j-1] + 1;
					temp[i][j] = updated;
					if(updated>max)
						max= updated;
				}
			}
		}
		return max;
	}

}
