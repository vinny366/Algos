package strings;
import java.util.ArrayList;
public class AllCombinations {

	public static void main(String[] args) {
		String a = "abc";
	
 		findallCombi("",a);
	}

	private static void findallCombi(String prefix, String str) {
			int n = str.length();
			if(n==0) {
				System.out.println(prefix);
			}
				
			else{
				System.out.println("hhh");
				for(int i=0;i<n;i++){
					
					findallCombi(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
				}
			}
	}

}
