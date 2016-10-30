package arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class SlidingWindow {

	public static void main(String[] args) {
		int[] nums = {1,3,-1,-3,5,3,6,7};
		int k= 3;
		
		int[] op = calc(nums,k);
		for(int i=0;i<op.length;i++){
			System.out.println(op[i]);
		}
	}

	private static int[] calc(int[] nums, int k) {
		int res[] = new int[nums.length-k+1];
        PriorityQueue<Integer> pq = new PriorityQueue<>(k,Collections.reverseOrder());
        
        
        for(int i=0;i<k;i++){
            pq.offer(nums[i]);
        }
        for(int i=0;i<res.length;i++){
            int val = pq.peek();
            pq.remove(nums[i]);
            res[i] = val;
            if(i+k < nums.length){
                pq.offer(nums[i+k]);
            }
        }
        return res;
	}

}
