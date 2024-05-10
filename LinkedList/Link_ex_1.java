package LinkedList;

class Node {
    int data;
    Node next;
};

class LinkedList {
    Node head;

    void insertAtFront(int data){
        Node New_node = new Node();

        New_node.data = data;

        New_node.next = head;

        head = New_node;
    }

    void printList (){
        Node node = head;

        while(node != null){
            System.out.println(node.data + " ");
            node = node.next;
        };
    }
}

public class Link_ex_1 {
    public static void main(String args[]){
        System.out.println("Hello World");
    }
}
