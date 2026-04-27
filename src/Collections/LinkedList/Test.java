package Collections.LinkedList;

//This is manual linked list class created but java provides internally linked list class
public class Test {
    public static void main(String[] args) {
        Node node1 = new Node();
        Node node2 = new Node();
        node1.value = 23;
        node1.next = node2;
        node2.value = 98;
        node2.next = null;
        node2.prev = node1;
        node1.prev = null;
    }
}

class Node{
    public int value; // this stores integer data of node
    public Node next; // this stores reference of another node.
    public Node prev;
}
