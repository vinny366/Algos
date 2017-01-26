package trees;

import java.util.Stack;

/**
 * 
 * @author Vinny366
 *	First we will take max as Integer.MAX_VALUE
 *  We know that in PreOrder Traversal 1st element is root.
 *  So we initialize root as INT_MIN 
 *  if (pre[i]  < root)  ret false;
 */
public class CheckPreOrderTraversal {

	public static void main(String[] args) {
		int[] pre1 = new int[]{40, 30, 35, 80, 100};
		boolean flag = canRepresent(pre1, pre1.length);
		
		if(flag){
			System.out.println("true");
		}else{
		System.out.println("false");
		}
	}

	private static boolean canRepresent(int[] pre, int n) {
		Stack<Integer> s = new Stack<Integer>();
		 
        // Initialize current root as minimum possible
        // value
        int root = Integer.MIN_VALUE;
 
        // Traverse given array
        for (int i = 0; i < n; i++) {
            // If we find a node who is on right side
            // and smaller than root, return false
            if (pre[i] < root) {
                return false;
            }
 
            // If pre[i] is in right subtree of stack top,
            // Keep removing items smaller than pre[i]
            // and make the last removed item as new
            // root.
            while (!s.empty() && s.peek() < pre[i]) {
                root = s.peek();
                s.pop();
            }
 
            // At this point either stack is empty or
            // pre[i] is smaller than root, push pre[i]
            s.push(pre[i]);
        }
        return true;
		
	}

}
