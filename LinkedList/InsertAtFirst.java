package LinkedList;

class Node{
    int data;
    Node next;

    Node(int data){

        this.data = data;
        /* No need to assign next . It by deafult assign the null Value in it */
    }

}
class LinkedList{

    int size;
    Node start;

    LinkedList(){
        size =0;
        start = null;
    
    }

    public void insertFirst(int data){
       // Node n;
        Node n = new Node(data);
        n.next = start;
        start = n;


    }

    public void print(){
        Node temp;
        temp = start;
        while(temp!= null){
            System.out.print("  "+temp.data);
            temp = temp.next; 
        }
    }
}
public class InsertAtFirst {

    public static void main(String[] args) {
       LinkedList list = new LinkedList();
       /* Node obj = new Node(10);
        System.out.println(obj.data);
        list.print();
        list.insertFirst(20);
        list.print();
        */

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.print();
    }
}
