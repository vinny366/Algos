package v_linkedList;
/**
 * 
 * @author Vinny366
 *	Given 2 Linkied lists having an Intersection. Find the Intersection Point 
 *
 *	Method 1:-  Mark the nodes Visited
 *  Method 2:-  Calculate Lengths of both Linked lists L1(eg 10) and L2 (3)
 *   
 *     Iterate L1 to (10-3 = 7) positions now both are into same point from ending 
 *     Iterate step by step to find the intersection Node;
 * 
 *  correct Answer practised in geeks for geeks 
 */
public class CommonNodeInTwoLL {

	public static void main(String[] args) {
		
		/* Node of a linked list
		 class Node {
		   int data;
		    Node next;
		    Node(int d)  { data = d;  next = null; }
		}
		 Linked List class
		class LinkedList
		{
		    Node head;  // head of list
		}
		This is method only submission.  You only need to complete the method. */
//		class GFG
//		{
//			int intersectPoint(Node headA, Node headB)
//			{
//		         int len1 =0;
//		         int len2 =0;
//		         Node tempA = headA;
//		         Node tempB = headB;
//		         while(tempA != null || tempB!=null){
//		             if(tempA !=null){
//		                 tempA = tempA.next;
//		                 len1++;
//		             }
//		             if(tempB !=null){
//		                 tempB = tempB.next;
//		                 len2++;
//		             }
//		         }
//		         tempA = headA;
//		         tempB = headB;
//		         int val = len1 - len2;
//		        if(val > 0){
//		            while(val>0){
//		                tempA =tempA.next;
//		                val--;
//		            }
//		        }else{
//		            while(val<0){
//		                tempB=tempB.next;
//		                val++;
//		            }
//		        }
//		        
//		        while(tempA !=null && tempB !=null){
//		            if(tempA == tempB){
//		                return tempA.data;
//		            }
//		            else{
//		               tempA = tempA.next;
//		               tempB = tempB.next;
//		            }
//		        }
//		        return -1;
//			}
//			
//		}
//

		
	}

}
