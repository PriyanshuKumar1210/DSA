package LinkedList;


public class Linked {

    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null; // By default no need to assign explicitly
        }
    }

    public void printList() 
    { 
        Node n = head; 
        while (n != null) 
        { 
            System.out.print(n.data+" "); 
            n = n.next; 
        } 
    } 

    public static void main(String[] args) {
        Linked obj = new Linked();
        obj.head = new Node(1);
        // Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        obj.head.next = second;
        // first.next = second;
        second.next = third;
        third.next = null;
        obj.printList();

    }
 
}