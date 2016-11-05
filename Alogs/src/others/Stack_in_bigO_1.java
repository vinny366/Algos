package others;

import java.util.Stack;

/**
 * 
 * @author Vinny366 if( stck is empty) push value and set min [example 5 ]
 *         lekapote if the pushed value is greater than existing min just push
 *         it if the pushed value is less than existing min the update the value
 *         to the min and push [ 2*pushed value - min ] example pushed value = 4
 *         ; now min =4 ; the value to be pushed ids (2*4 - 5) = 3
 * 
 *         while popping if the value popped is greater than current min just
 *         pop it; If it is less than min the update min(after popping this) =
 *         (2*min(before poppoing this) - value popped )
 * 
 *         eg: 5 7 4(3)= 2*(4 - min =5)
 * 
 *         Method 2 : 
 *           Maintain another Stack where u can store the min values;
 * 
 */
public class Stack_in_bigO_1 {

	public static void main(String[] args) {
		int[] arr = { 5, 8, 2, 9, 4, 1, 7 };
		Stack<Integer> s = new Stack<Integer>();
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (s.isEmpty()) {
				min = arr[i];
				s.push(arr[i]);
			} else {
				if (min > arr[i]) {
					
					s.push(2 * arr[i] - min);
					min = arr[i];
				} else {
					s.push(arr[i]);
				}
			}
		}
		while (!s.isEmpty()) {
			int y = s.pop();
			if(y<min){
				int x = min;
				min = 2*min - y;
				y =x;
				
			}
			System.out.print("popped is" +y );
			System.out.print("Min is" + min);
			System.out.println();
		}
	}

}
