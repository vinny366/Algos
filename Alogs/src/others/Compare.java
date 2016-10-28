package others;

import java.util.TreeMap;

class CoordinatePoint {
	float x;
	float y;
	double distance;
	CoordinatePoint(float xcoord,float ycoord){
		this.x = xcoord;
		this.y = ycoord;		
		this.distance = Integer.MAX_VALUE;
	}
	
	CoordinatePoint(float xcoord,float ycoord, CoordinatePoint givenPoint){
		this.x = xcoord;
		this.y = ycoord;
		this.distance = Math.hypot(this.x - givenPoint.x, this.y - givenPoint.y);
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
}

public class Compare {

	public static void main(String[] args) {
		TreeMap<CoordinatePoint, String> tm = new TreeMap<CoordinatePoint, String>();
		CoordinatePoint p1 = new CoordinatePoint(1, 1);
		CoordinatePoint p2 = new CoordinatePoint(-1, 1);
		CoordinatePoint p3 = new CoordinatePoint(-1, 3);
		CoordinatePoint p4 = new CoordinatePoint(1, -1);
		CoordinatePoint p5 = new CoordinatePoint(3, -1);
		tm.put(p1, "one");
		tm.put(p2, "one");
		tm.put(p3, "one");
		tm.put(p4, "one");
		tm.put(p5, "one");
		System.out.println(tm);
	}

}
