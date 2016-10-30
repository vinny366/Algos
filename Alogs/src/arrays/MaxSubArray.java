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
		int nums[] = {-2, -3, -4, 6, 2, 1, -5, 10};
		int op = maxSubArray(nums);
		System.out.println(op);
	}
	public static int maxSubArray(int[] a) {
      int max = a[0];
      int newsum = a[0];
      
      for(int i= 1 ; i<a.length;i++){
    	  newsum = Math.max(newsum+a[i],a[i]);
    	  max = Math.max(newsum, max);
    	  
      }
        
        return max;

    }

}
