import java.util.*;

public class RemoveDups{

	public static void deleteDups(LinkedListNode node){
		HashSet hs = new HashSet();
		LinkedListNode previous=null;
		while(node!=null){
			if(hs.contains(node.data)){
				previous.next=node.next;
			}
			else{
				hs.add(node.data);
				previous=node;
			}
			node=node.next;
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
