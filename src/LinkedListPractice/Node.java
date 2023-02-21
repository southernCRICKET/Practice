package LinkedListPractice;

public class Node {
    int value;
    Node next;

    public Node(int value, Node next){
        this.value=value;
        this.next=next;
    }

    public Node(int value){
        this.value=value;
        this.next=null;
    }
}
