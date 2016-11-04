package arrays;

import java.util.HashMap;

/**
 * 
 * @author Vinny366
 * Given an array and a target; return if the array has any 2 numbers equal 
 * to the target and return their indices.
 * 
 * @solution 
 *  Take a hashMap put the difference as key and index as value;
 *  before adding any value check if the key already exists;
 *  if exists return the value of key and the i value;
 */
public class TwoSum {
	public static void main(String[] args) {
		int[] arr ={2, 7, 11, 15};
		int target = 9;
		calans(arr,target);		
	}
	
	public static int[] calans(int[]arr, int target){
		if(arr.length<2){
			return null;
		}
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		int[] op = new int[2];
		for(int i=0;i<arr.length;i++){
			if(hm.containsKey(arr[i])){				
				op[0] = hm.get(arr[i]);
				op[1] = i;
			}else{
				hm.put(target-arr[i], i);
			}
		}
		
		return op;
	}

}
