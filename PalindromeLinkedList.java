package leetCode;

//	234. Palindrome Linked List
//	https://leetcode.com/problems/palindrome-linked-list/

public class PalindromeLinkedList {

	 public boolean isPalindrome(ListNode head) {
		    ListNode node=head;
		    int count=0;
		        while(head!=null){
		            count++;
		            head=head.next;
		        }
		        
		    int[] arr=new int[count];
		    int j=0;
		    while(node !=null){
		        arr[j++]=node.val;
		        node=node.next;
		    }
		    for(int i=0;i<count;i++){
		        if(arr[i]!=arr[count-i-1]){
		            return false;
		        }
		    }
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
