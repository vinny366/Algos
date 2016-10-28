package V_linkedList;

import java.util.PriorityQueue;

public class ImplementHeap {

	public static void main(String[] args) {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		q.add(18);
		q.add(22);
		q.add(16);
		q.add(62);
		q.add(32);
		q.add(27);
		q.add(52);
		System.out.println(q.poll());
		System.out.println(q.poll());
		
	}

}
