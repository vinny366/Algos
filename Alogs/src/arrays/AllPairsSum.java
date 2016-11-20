package arrays;

import java.util.HashMap;
/**
 * 
 * @author Vinny366
 *
 * put the value as key in HashMap and number of times it occured as value in HashMap
 * 
 * again iterate through array and see if(sum -arr ) is present 
 *  if present then add that corrosponding value 
 *  if(sum == index) then reduce it by -1
 *  
 */
public class AllPairsSum {
	 
	static int getCountPairsWithGivenSum(int[] arr, int sum) {
		int n = arr.length;
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
 
		int res = 0;
 
		for(int i=0;i<n;i++) {
			if(hm.containsKey(arr[i])) {
				int c = hm.get(arr[i]); 
				hm.put(arr[i],c+1);
			}
			else
				hm.put(arr[i],1);
		}
		System.out.println(hm);
		int twiceCount = 0;
		for(int i=0;i<n;i++) {
			if(hm.get(sum-arr[i]) != null) {
				twiceCount += hm.get(sum-arr[i]); 
				if(sum-arr[i] == arr[i])
					twiceCount--;
			}
		}
 
		return twiceCount/2;
	}
 
	static void printArray(int[] arr) {
		for(int i : arr)
			System.out.print(i + " ");
		System.out.println();
	}
 
	public static void main(String[] args) {
		int[] arr = {1,7,9,1,-1,4,11,15,2,4,6};
 
//		printArray(arr);
 
		System.out.println("ans = " + getCountPairsWithGivenSum(arr, 8));
	}
}