package v_linkedList;
/**
 * 
 * @author Vinny366
 *  Remove all the values greater than 20
 */
public class RemoveNodesLL {

	public static void main(String[] args) {		
		LinkedListNode myhead = LinkedList.testLinkedList();
		int x = 20;
		LinkedListNode tempHead = myhead;
		LinkedListNode prev = null;
		while(tempHead.next != null){
			if(tempHead.data>x){
				if(tempHead == myhead){
					myhead = myhead.next;
					tempHead = myhead;
				}else{
				prev.next = tempHead.next;
				tempHead = tempHead.next;
				}
			}else{
			prev = tempHead;
			tempHead = tempHead.next;
			}
			
		}
		
		if(tempHead.data>x){
			prev.next = null;
		}
		
		LinkedList.LLprint(myhead);
	} // main
	
}
