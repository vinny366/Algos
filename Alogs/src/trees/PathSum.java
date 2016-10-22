package trees;

import java.util.ArrayList;

public class PathSum {

	public static void main(String[] args) {
		String s = "I am using hackerrank to improve programming";
		String t = "am hackerrank to improve";
		String[] o = cal(s, t);
	}

	private static String[] cal(String s, String t) {	
		String[] a = s.split(" ");
		String[] b = t.split(" ");

		ArrayList<String> ff = new ArrayList<String>();
		for(String s1 : a){
			ff.add(s1);
		}
		
		for(String s2 :b){
			for(int i=0; i<ff.size(); i++){
				if(ff.get(i).equals(s2)){
					ff.remove(i);
				}
			}
		}
		
		System.out.println(ff);

		return ff.toArray(new String[ff.size()]);
	}

}
