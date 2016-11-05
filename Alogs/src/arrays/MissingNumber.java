package arrays;
/**
 * 
 * @author Vinny366
 *	Method 1:
 *   sum to n numbers  = n(n+1)/2 --  overflow if n is huge
 *   
 *  Method 2:
 *   Same as method 1  :
 *    in for loop add the numbers and negate the indexes
 *    sum = sum -i + nums[i];
 *    
 *  Method 3:
 *    if array is sorted Binary Search
 *     check if the mid is equal to the number [0,1,2,3] so mid = index if not do the search;
 *  
 *  Method 4:
 *   Use Xor operations
 *   Logic:
 *   a number XOR itself will become 0, any number XOR with 0 will stay unchanged.
 *    So if every number from 1...n XOR with itself except the missing number,
 *     the result will be the missing number.
 *    
 */
public class MissingNumber {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,8,9};
		int arrLen = arr.length + 1;
		int sum = arr[arr.length-1];
		for(int i = 0; i<arr.length; i++){
			sum = sum + (i+1) - arr[i];
		}
		System.out.println(sum);
		
		//  2nd method XOR
		int arrXor = arr[0];
		int numXor = 1;
		for(int i=1;i<arr.length;i++){
			arrXor = arr[i]^arrXor; 
		}
		for(int i=2;i<=9;i++){
			numXor = numXor ^ i;
		}
		System.out.println(arrXor ^ numXor);
	}
}
