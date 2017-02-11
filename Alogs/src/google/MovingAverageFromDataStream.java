package google;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverageFromDataStream {
	Queue<Double> q = new LinkedList<Double>();
	int windowsize = 3;
	double sum;
	public double next (double val){
		
		if(q.size() == windowsize)
			sum -= q.poll();
		q.offer(val);
		sum+=val;
		return sum/windowsize;
		
	}
	
	public static void main(String[] args) {
		
				
	}

}
