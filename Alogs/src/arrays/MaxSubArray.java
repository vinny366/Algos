package arrays;

public class MaxSubArray {
		/**
		 * Initially sum = a[0]
		 * max = a[0];
		 * We add them from 1- > n ;
		 * if(prev sum + this a[i] or a[i] which ever is greater that is new sum)
		 * max is max of max and newsum which ever is greater 
		 */
	public static void main(String[] args) {
		int nums[] = {-1, 92, -4, -6, -2, -1, -5, -10};
		int op = maxSubArray(nums);
		System.out.println(op);
	}
	public static int maxSubArray(int[] a) {
     int max = a[0];
     int sum = a[0];
     int index= -1;
     for(int i=1;i<a.length;i++){
    	 
    	 sum = Math.max(sum + a[i],a[i]);
    	 if(sum == a[i]){
    		 index = i;
    	 }
    	 max= Math.max(sum, max);
     }
  System.out.println(index);  // if index == -1 it starts from start of the array;  As we know sum go on counting till max
     return max;
    }
	
}
