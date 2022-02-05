package leetCode;

public class DeleteMiddleNode {
	
	public static boolean removeMiddleNode(ListNode node) {
		//given linked list a ->b ->c ->d ->e ->f -> null
		//given node c
		//remove give node from  singly Linked list
		
		if(node == null || node.next == null) {
			return false;
		}
		ListNode next= node.next;
		
		node.val=next.val;
		node.next=next.next;
		
		return true;
	}
	
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
}
