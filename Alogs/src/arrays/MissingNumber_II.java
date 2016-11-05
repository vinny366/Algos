package arrays;
/**
 * https://www.youtube.com/watch?v=75Jrba2uGFM
 * @author Vinny366
 *
 */
public class MissingNumber_II {

	public static void main(String[] args) {
	int[] arr = {2,5,6,1};
	int[] op = findMissingValues(arr);
	System.out.println(op[0] +"--->" + op[1]);

	}
	public static int[] findMissingValues(int[] arr){
		int n = arr.length + 2;
		long totalsum = n*(n+1)/2;
		long arrSum = 0;
		for(int i:arr){
			arrSum +=i;
		}
		int middle = (int) ((totalsum - arrSum)/2);
		int totalLeftXor = 0  ;    // xor from 1 - pivot;
		int arrLeftXor =0;
		int totlaRightXor = 0    ;     // xor from pivot+1 to end;
		int arrRightXor = 0;
		
		for(int i=1;i<=middle; i++){
			totalLeftXor ^=i;			
		}
		
		for(int i=middle+1;i<=n; i++){
			totlaRightXor ^=i;			
		}
		
		for(int i :arr){
			if(i< middle) arrLeftXor^= i;
			else
				arrRightXor ^= i;
		}
		return new int[]{totalLeftXor ^ arrLeftXor, totlaRightXor ^ arrRightXor};
	}
}
