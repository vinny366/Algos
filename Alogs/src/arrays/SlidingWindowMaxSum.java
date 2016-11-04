package arrays;

import java.util.Collections;
public class SlidingWindowMaxSum {

	public static void main(String[] args) {
		int[] nums = {1,3,-1,123,5,3,6,7};
		int k= 3;
		
		int op = calc(nums,k);
		System.out.println(op);

	}
	private static int calc(int[] nums, int k) {
		int sum = 0;
		int max = sum;
		for(int i=0;i<k;i++){
			sum = sum + nums[i];
			 max = sum;
		}
		for(int i=1;i<nums.length-k+1;i++){
			sum = sum -nums[i-1] + nums[i+k-1];
			if(sum>max){
				max = sum;
			}
		}
		return max;
	}

}

