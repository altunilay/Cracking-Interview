public class LinkedListNode {  
    public int data;  
    public LinkedListNode next;  

    public LinkedListNode(int data) {  
        this.data = data;    
    }
    public void appendToTail(int d){
        LinkedListNode newnode = new LinkedListNode(d);
        LinkedListNode n=this;
        while(n.next!=null){
            n=n.next;
        }
        n.next=newnode;
    }

    public void print(){
        LinkedListNode n=this;
        System.out.print("Linked List: ");
        while(n.next!=null){
            System.out.print(n.data+" -> ");
            n=n.next;
        }
        System.out.println(n.data);
    }
}