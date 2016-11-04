package arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class SlidingWindow {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 1, 4, 5, 2, 3, 6};
		int k= 3;
		
		int[] op = calc(nums,k);
		for(int i=0;i<op.length;i++){
			System.out.println(op[i]);
		}
	}

	private static int[] calc(int[] nums, int k) {
		 PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k, Collections.reverseOrder());
		 int[] res = new int[nums.length - k + 1];
		 for(int i=0;i<k;i++){
			 pq.offer(nums[i]);
		 }
		 
		 for(int i=0;i<nums.length - k + 1; i++){
			 res[i] = pq.peek();
			 pq.remove(nums[i]);
			 if(i+k < nums.length){
				 pq.offer(nums[i+k]);
			 }
		 }
		 return res; 
	}

}
