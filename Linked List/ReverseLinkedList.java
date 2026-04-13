//import java.sql.Time;
import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {

    Node head; // Head of the linked list

    // Node class
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add node at the beginning
    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add node at the end
    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;

        // Traverse to last node
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        
        currNode.next = newNode;
    }

    // Print linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }

    // Reverse linked list (iterative)
    // Time complexity - O(n)
    // Space complexity - O(1)

    public void reverseList() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while (currNode != null) {
            Node nextNode = currNode.next; // Save next node
            currNode.next = prevNode;      // Reverse link

            prevNode = currNode;           // Move prev forward
            currNode = nextNode;           // Move curr forward
        }

        head.next = null; // Old head becomes last → set next = null
        head = prevNode;  // Update head
    }

    // Recursive Method
    // Time complexity - O(n)
    // Space complexity - O(1) 
    public Node reverseListRecursive(Node head) {
       //empty node || last node or only one node
       if(head == null || head.next == null) {
           return head;
       }


       Node newHead = reverseListRecursive(head.next);
      
       head.next.next = head;
       head.next = null;
       return newHead;
   }


    // Main method
    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();

        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("linkedlist");

        //System.out.println("Original List:");
        //list.printList();

        //list.reverseList();

        //System.out.println("Reversed List:");
        //list.printList();

        //list.head = list.reverseListRecursive(list.head);
        //list.printList();



    //    Collections Method
    //    Time complexity - O(n)
    //    Space complexity - O(1)  

       LinkedList<Integer> list2 = new LinkedList<>();
       list2.add(1);
       list2.add(3);

       System.out.println("Before: " + list2);

       Collections.reverse(list2);

       System.out.println("After: " + list2);
    }
}
