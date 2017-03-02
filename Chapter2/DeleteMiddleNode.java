import java.util.*;

public class DeleteMiddleNode{
	public static void deleteMiddle(LinkedListNode element){

		if(element.next!=null && element!=null){	
			element.data=element.next.data;
			element.next=element.next.next;
		}
		
	}
	public static void main(String[] args){
		LinkedListNode head=new LinkedListNode(2);
		head.appendToTail(3);
		head.appendToTail(4);
		head.appendToTail(5);
		head.appendToTail(6);
		LinkedListNode secondElement=head.next;
		deleteMiddle(secondElement);
		head.print();

	}
}