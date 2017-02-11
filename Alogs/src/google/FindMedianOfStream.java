package google;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedianOfStream {
	PriorityQueue<Integer> min = new PriorityQueue();
    PriorityQueue<Integer> max = new PriorityQueue(1000, Collections.reverseOrder());
	public static void main(String[] args) {
		FindMedianOfStream fm = new FindMedianOfStream();
	    int[] a = {10,20,12,16,25,32};
	    for(int i=0;i<a.length;i++){
	    	fm.addNum(a[i]);
	    	System.out.print(fm.findMedian() + ",");
	    }

	}
	
	 public void addNum(int num) {
	        max.offer(num);
	        min.offer(max.poll());
	        if (max.size() < min.size()){
	            max.offer(min.poll());
	        }
	    }

	    // Returns the median of current data stream
	    public double findMedian() {
	        if (max.size() == min.size()) return (max.peek() + min.peek()) /  2.0;
	        else return max.peek();
	    }

}
