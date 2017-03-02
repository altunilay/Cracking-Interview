import java.util.*;

public class RemoveDubsRunner{

	public static void deleteDups(LinkedListNode head){
		LinkedListNode current=head;
		while(current!=null){
			LinkedListNode runner=current;
			while(runner.next!=null){
				if(runner.next.data==current.data){
					runner.next=runner.next.next;
				}
				else{
					runner=runner.next;
				}
			}
			current=current.next;
		}
	}

	public static void main(String[] args){
		LinkedListNode head=new LinkedListNode(1);
        head.appendToTail(5);
        head.appendToTail(1);
        head.appendToTail(3);
        head.print();
        deleteDups(head);
        head.print();
	}
}
