package LinkedList;
// import java.io.*;
// A linked list is a fundamental data structure in computer science. 
//It consists of nodes where each node contains data and a reference (link) to the 
//next node in the sequence. This allows for dynamic memory allocation and 
// efficient insertion and deletion operations compared to arrays.

// import javax.xml.soap.Node;

// INSERTION IN LINKED LIST
//At the front of the linked list  

// A Linked List Node
class Node {
    int data;
    Node next;
};

// Class to insert element in Linked List
class LinkedList {
    Node head; // head of list

    // Given a reference (pointer to pointer)
    // to the head of a list and an int, inserts
    // a new node on the front of the list.
    void inserAtFront(int new_data){
        // 1. allocate node
        Node new_node = new Node();

        //2. put in the data
        new_node.data = new_data;

        // 3. Make next of new node as head
        new_node.next = head;

        // move the head to point
        // to the new node
        head = new_node;
    }

    // Printing content of a linked list starting from head
    void printList(){
        Node node = head;
        while (node != null){
            System.out.print(node.data + " ");
            node = node.next;
        };
        System.out.println();
    }

};

public class Link_01 {
    public static void main(String args[]){
        LinkedList list = new LinkedList();

        list.inserAtFront(6);
        list.inserAtFront(5);
        list.inserAtFront(3);
        list.inserAtFront(2);
        list.inserAtFront(1);
        list.inserAtFront(0);

        System.out.print("After inserting nodes at their front: ");
        list.printList();
    }
}