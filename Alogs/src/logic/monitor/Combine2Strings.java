package logic.monitor;

public class Combine2Strings {

	public static void main(String[] args) {
		String s1 ="ace";
		String s2 = "bdfghijk";
		String res =combine(s1,s2);
		System.out.println(res);
//		String shorter = (s1.length() <= s2.length()) ? s1:s2;
//		String longer = (s1.length() > s2.length()) ? s1:s2;
//		StringBuilder sb = new StringBuilder();
//		for(int i=0;i<shorter.length();i++){
//			sb.append(shorter.charAt(i));
//			sb.append(longer.charAt(i));
//		}
//		for(int i=shorter.length();i<longer.length();i++){
//			sb.append(longer.charAt(i));
//		}
//		System.out.println(sb);
	}
	
	public static String combine(String s1, String s2){
		String larger  = (s1.length() > s2.length())?s1:s2;
		String smaller = (s1.length() <=  s2.length())?s1:s2;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<smaller.length();i++){
			sb.append(smaller.charAt(i));
			sb.append(larger.charAt(i));	
		}
		for(int k=smaller.length();k<larger.length();k++){
			sb.append(larger.charAt(k));
		}
		return sb.toString();
	}

}
