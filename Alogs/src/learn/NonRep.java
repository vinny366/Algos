package learn;

public class NonRep {

	public static void main(String[] args) {
		String a ="i am eating";
		String h = a.replaceAll("\\s+", "");
		int[] letters = new int[26];
		char [] s = h.toCharArray();
		
		for(char ch : s){
			letters[ch -'a']++;
		}
		

	}

}
