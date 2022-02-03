package leetCode;

//	876. Middle of the Linked List
//	https://leetcode.com/problems/middle-of-the-linked-list/
//	solution faster than 100% submissions using 39.3 MB 


public class MiddleOfLinkedList {

	
	  public ListNode middleNode(ListNode head) {
	        int count=0;
	        ListNode node= head;
	        
	        while(head.next!=null){
	            count++;
	            head=head.next;
	        }
	        count++;
	        
	        if(count==1){  return node;}
	        if(count==2){  return node.next;}
	        
	        int len= count/2;
	        
	        
	        for(int i=0;i<len;i++){
	            node=node.next;
	        }
	        
	         return node;
	  }
	  public class ListNode {
		       int val;
		       ListNode next;
		       ListNode() {}
		       ListNode(int val) { this.val = val; }
		       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		   }
}
