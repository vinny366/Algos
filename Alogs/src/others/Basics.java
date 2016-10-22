package others;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Basics {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer, String>();
		hm.put(1,"one");
		hm.put(2,"two");
		hm.put(3,"three");
		hm.put(4,"four");
		hm.put(5,"five");
		hm.put(6,"six");
		System.out.println(hm);
		Set<Integer> keys = hm.keySet();
		for(int i : keys){
			System.out.println(i +"----" + hm.get(i));
		}
		
		String h = hm.toString();
		String[] p = h.split(",");
		for(int i=0;i<p.length;i++){
			System.out.println(p[i]);
		}
		
		ArrayList<Integer> a1 = new ArrayList<>();
		ArrayList<Integer> a2 = new ArrayList<>();
		a1.add(12); a1.add(13); a1.add(4); a1.add(15); a1.add(16);
		a2.add(12); a2.add(113); a2.add(114); a2.add(115); a2.add(116);
		a1.removeAll(a2);
		System.out.println(a1);
		String f = a1.toString();
		System.out.println(a1.indexOf(4));
		
		
	}

}
