package V_linkedList;

import java.awt.Point;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Kclosestcoordinates {

	public static void main(String[] args) {
		
		ArrayList<CoordinatePoint> setOfPoints = new ArrayList<CoordinatePoint>();
		CoordinatePoint p1 = new CoordinatePoint(1, 1);
		CoordinatePoint p2 = new CoordinatePoint(-1, 11);
		CoordinatePoint p3 = new CoordinatePoint(-1, 3);
		CoordinatePoint p4 = new CoordinatePoint(-1, -10);
		CoordinatePoint p5 = new CoordinatePoint(3, -1);
		CoordinatePoint p6 = new CoordinatePoint(1, 2);
		CoordinatePoint p7 = new CoordinatePoint(1, 4);
		CoordinatePoint p8 = new CoordinatePoint(1, 91);
		CoordinatePoint p9 = new CoordinatePoint(1, 6);
		setOfPoints.add(p1);
		setOfPoints.add(p2);
		setOfPoints.add(p3);
		setOfPoints.add(p4);
		setOfPoints.add(p5);
		setOfPoints.add(p6);
		setOfPoints.add(p7);
		setOfPoints.add(p8);
		setOfPoints.add(p9);
		
		CoordinatePoint myPoint = new CoordinatePoint(1, 5);
		
		PriorityQueue<CoordinatePoint> op = calnearest(setOfPoints, myPoint, 3);
		
		for(int i =0 ;i<3;i++){
			CoordinatePoint kk = op.poll();
			System.out.print(kk.x + "--");
			System.out.print(kk.y);
			System.out.println();
		}
	}

	private static PriorityQueue<CoordinatePoint> calnearest(ArrayList<CoordinatePoint> setOfPoints, CoordinatePoint myPoint, int k) {
		 PriorityQueue<CoordinatePoint> queue = new PriorityQueue<CoordinatePoint>(k);		 
		 for(CoordinatePoint point : setOfPoints){			 
			point = calDistance(point, myPoint);			 
			 if(queue.size() < k){
				 queue.offer(point);
			 }else{
				 if (queue.peek().compareTo(point) < 0) {
	                    queue.poll();
	                    queue.offer(point);
	                }
			 }
		 }
		
		return queue;
	}

	private static CoordinatePoint calDistance(CoordinatePoint point, CoordinatePoint myPoint) {
		point.distance = Math.hypot(point.x - myPoint.x, point.y-myPoint.y);
		return point;
	}

}
