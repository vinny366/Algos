package v_linkedList;

class LinkedListNode{
	int data;
	LinkedListNode next;
	
	public LinkedListNode(int x){
		this.data = x;
		this.next = null;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public LinkedListNode getNext() {
		return next;
	}
	public void setNext(LinkedListNode next) {
		this.next = next;
	}
}
/**
 * 
 *   10 --> 30 --> 22 --> 54--> 12 --> 17 --> 33
 * @author Vinny366
 *
 */
public class LinkedList {
	public LinkedList(){
		LinkedListNode head = null;
	}
	
	public static LinkedListNode testLinkedList(){
		LinkedListNode head = new LinkedListNode(10);		
		head.next = new LinkedListNode(30);
		head.next.next = new LinkedListNode(22);
		head.next.next.next = new LinkedListNode(54);
		head.next.next.next.next = new LinkedListNode(12);
		head.next.next.next.next.next = new LinkedListNode(17);
		head.next.next.next.next.next.next = new LinkedListNode(33);
		return head;
	}
	
	public static void LLprint(LinkedListNode head){
		while(head != null){
			System.out.print(head.data + "-->");
			head = head.next;
		}
	}
}
