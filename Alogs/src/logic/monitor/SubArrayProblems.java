package logic.monitor;

import java.util.Arrays;
import java.util.Stack;

/**
 * 
 * @author Vinny366
 *	Get Maximum Length Sub array with sum <= k
 *  Max length continuous subArray 
 *
 *  When no negative numbers go to E
 *   -- start and end pointers teeskovali  len=-1 and sum=0;
 *   end increment cheskuntu vellali. sum ekkuvaite akkada end aapesi sum - a[start] chesi
 *   start ni increase cheyali
 */
public class SubArrayProblems {

	public static void main(String[] args) {
		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
		//maximumLengthSubArray(arr,6,0);
//		maximumSubArraySum(arr);
	//	maximumLengthSubArrayE(arr,6,0);
		  int[] pre1 = new int[]{10,5,2,7,14,15,18};
	        int n = pre1.length;
	        System.out.println(canRepresentBST(pre1, n));
	}
	
	private static void maximumLengthSubArrayE(int[] arr, int sum, int j) {
		int start =0;
		int end =0;
		int mysum =0;
		int len = -1;
		
		for(int i=0;i<arr.length;i++){
			mysum = mysum + arr[i];
			end++;
			while(mysum > sum){
				mysum = mysum - arr[start];
				start = start +1;
			}
			len = Math.max(len, end-start);
		}
		System.out.println(len);
	}

	private static void maximumSubArraySum(int[] arr) {
		System.out.println("-------Maximum Sub Array-------");
		long maxtillnow = Integer.MIN_VALUE;
		long maxSoFar = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			maxtillnow = Math.max(maxtillnow +  arr[i], arr[i] );
			if(maxSoFar < maxtillnow){
				maxSoFar = maxtillnow;
			}else{
				System.out.println(i);
			}
		}
		System.out.println(maxSoFar);
		
	}

	private static void maximumLengthSubArray(int[] a, long sum, int maxLen) {
		int yMax =0;
		for(int i=0;i<=a.length;i++){
			for(int j=i;j<=a.length;j++){
				int[] myarr = Arrays.copyOfRange(a, i, j);
				yMax = Print(myarr,yMax);
			}
		}
		System.out.println(yMax);
	}

	private static int Print(int[] myarr,int yMax) {
		int sum =0;
		for(int i=0;i<myarr.length;i++){
			sum = sum+myarr[i] ;
		}
		return Math.max(sum, yMax);
		
	}
	
	static boolean canRepresentBST(int arr [], int n) {
       
		Stack<Integer> s = new Stack<Integer>();
		int root = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i] < root){
				return false;
			}

			while(!s.empty() && s.peek() < arr[i] ){
				root = s.peek();
				s.pop();
			}
			s.push(arr[i]);
		}
		return true;	
    }

}
