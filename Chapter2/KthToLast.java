import java.util.*;

public class KthToLast{
	public static int findKthToLast(LinkedListNode head, int k){
		int length=0;
		int kth=0;
		LinkedListNode current=head;
		while(current!=null){
			length++;
			current=current.next;
		}
		kth=length-k;
		for(int i=1; i<kth; i++){
			head=head.next;
		}
		return head.data;
	}

	public static void main(String[] args){
		LinkedListNode head= new LinkedListNode(1);
		head.appendToTail(4);
		head.appendToTail(5);
		head.appendToTail(7);
		head.appendToTail(9);
		System.out.println(findKthToLast(head,2));
	}
}