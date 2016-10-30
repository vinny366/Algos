package arrays;
import java.util.PriorityQueue;
import java.util.Collections;
public class SlidingWindowMaxSum {

	public static void main(String[] args) {
		int[] nums = {1,3,-1,123,5,3,6,7};
		int k= 3;
		
		int op = calc(nums,k);
		System.out.println(op);

	}
	private static int calc(int[] nums, int k) {
		int res = Integer.MIN_VALUE;
        //PriorityQueue<Integer> pq = new PriorityQueue<>(k,Collections.reverseOrder());
        
        int sum = 0;
        for(int i=0;i<k;i++){
            
            sum = sum + nums[i];
            res = sum;
        }
        for(int i=1;i<nums.length -k +1;i++){
            sum = sum - nums[i-1];
            sum  = sum + nums[i+k-1];
            if(sum>res)
            	res = sum;
        }
        return res;
	}

}

