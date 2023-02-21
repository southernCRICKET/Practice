package LinkedListPractice;

public class LinkedList {
    Node head;

    public LinkedList(){
        head=null;
    }

    public LinkedList(Node head){
        this.head=head;
    }

    public void AddNodeBeginning(Node n){
        if(head==null) {
            this.head = n;
        }
        else{
            n.next=head;
            head=n;
        }
    }

    public void AddNodeEnd(Node n){
        if(head==null)
            this.head=n;
        else{
            Node prev, tmp;
            tmp=head;
            prev=head;
            while(tmp!=null){
                prev=tmp;
                tmp=tmp.next;
            }
            prev.next=n;

        }
    }

    public void PrintLinkedList()
    {
        Node tmp = head;
        while(tmp!=null){
            System.out.print(tmp.value+" --> ");
            tmp=tmp.next;
        }
        System.out.println(tmp);
    }
}
