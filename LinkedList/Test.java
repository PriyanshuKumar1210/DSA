package LinkedList;

class Node {
    private int data;
    private Node next;

    public Node() {
        data = 0;
        next = null;
    }

    public Node(int data, Node n) {
        this.data = data;
        next = n;
    }

    public void setData(int d) {
        data = d;
    }

    public void setNext(Node n) {
        next = n;
    }

    public Node getNext() {
        return next;
    }

    public int getData() {
        return data;
    }
}

class LinkedList {
    private int size;
    private Node start;

    public LinkedList() {
        size = 0;
        start = null;
    }

    public boolean isEmpty() {
        if (start == null)
            return true;
        else
            return false;
    }

    public void viewList() {
        Node t;
        // if (isEmpty())
        //     System.out.println("List is empty");
        // else {
            t = start;
            for (int i = 1; i <= size; i++) {
                System.out.println(t.getData());
                t = t.getNext();
            }
      //  }
    }
    /* -------- Insert the value at first node ---------------- */

    public void insertFirst(int val) {
        Node n; // Reference variable of node type
        n = new Node(); // Assinging n into new node
        n.setData(val);
        n.setNext(start); //
        start=n;
        size++; // Increament the size
        /*
         * There are two cases rise here 1) Node is Empty 2) Node is Non - Empty
         * 1) If empty start = n;
         * 2) non- empty
         * n.setNext(start) new node assign with the previous(first)node
         * after that we change the value of start -> start = n
         */
    }

    /* -------- Insert the value at last node ---------------- */

    public void insertLast(int val) {
        Node n, t;
        n = new Node();
        n.setData(val);
        t = start; // t has a first node address
        if (t == null)
            start = n;
        else {
            while (t.getNext() != null) {
                t = t.getNext();
                t.setNext(n);
            }
            size++;
        }

        /*
         * There are two cases rise here 1) Node is Empty 2) Node is Non - Empty
         * 1) If empty start = n;
         * 2) non- empty
         * while loop goes to the last node and if t(next refernce)has equal to null
         * then it assign the value start = null
         * at that situation start are present in last node(that means start moves from
         * first node to the last node)
         */

    }

    /* -------- Insert the value at Position node ---------------- */

    public void insertAtPos(int val, int pos) {
        if (pos == 1)
            insertFirst(val);
        else if (pos == size + 1)
            insertLast(val);
        else if (pos > 1 && pos <= size - 1) {
            Node n, t;
            n = new Node(val, null); // creating a new node
            t = start; // t pointing to the first node
            for (int i = 1; i < pos - 1; i++) {
                t = t.getNext(); // it assign the next node address
            }
            n.setNext(t.getNext()); // New node point to the next node from the position which are given
            t.setNext(n); // Position -1 node point to the new node
        }
    }

}

public class Test {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        // System.out.println(list.isEmpty());
        list.insertFirst(10);
        // list.insertLast(20);
        list.viewList();

    }

}
