package V_linkedList;

public class CopyOfLL {

	public static void main(String[] args) {
		LinkedListNode head = LinkedList.testLinkedList();
		LinkedListNode temp = head;
		LinkedListNode newHead = null;
		LinkedListNode newCurr = null;
		LinkedList.LLprint(head);
		System.out.println("new");
		while(temp != null){
			LinkedListNode newNode = new LinkedListNode(head.data);
			if(newHead == null){
				newHead = newNode;
				newCurr = newNode;
			}else{
				newCurr.next = newNode;
				newCurr = newCurr.next;
			}
			temp = temp.next;
		}
		LinkedList.LLprint(newHead);
		

		
	}

}
