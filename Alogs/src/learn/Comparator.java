package learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// ee coord class lopala pedite y error???
class Coordinate implements Comparable<Coordinate>{
	int x;
	int y;
	
	public Coordinate(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Coordinate o) {
		return this.x - o.x;
	}

	
	
}

public class Comparator {
	
	public static void main(String[] args) {
		Coordinate c1 = new Coordinate(1,2);
		Coordinate c2 = new Coordinate(3,2);
		Coordinate c3 = new Coordinate(6,6);
		Coordinate c4 = new Coordinate(8,2);
		Coordinate c5 = new Coordinate(4,2);
		List<Coordinate> al = new ArrayList<Coordinate>();
		al.add(c1);al.add(c2);al.add(c3);al.add(c4);al.add(c5);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i).x);
		}
	};

}







