package V_linkedList;

public class CoordinatePoint implements Comparable<CoordinatePoint> {
	float x;
	float y;
	double distance;
	CoordinatePoint(float xcoord,float ycoord){
		this.x = xcoord;
		this.y = ycoord;		
		this.distance = Integer.MAX_VALUE;
	}
	

	@Override
	public int compareTo(CoordinatePoint o) {
		  return Double.valueOf(o.distance).compareTo(distance);
		}
}
