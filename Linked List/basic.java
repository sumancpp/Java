public class basic {
    Node head;
    private int size;

    basic(){
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        // Stop at the LAST node, not AFTER the last node
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        // Traverse until currNode itself becomes null
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last
    public void deleteLast(){
        if(head == null){
            System.out.println("This list is empty");
        }
         
        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        basic list = new basic();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("linkedlist");
        
        // Output: This -> is -> a -> linkedlist -> NULL
        list.printList();

        list.deleteFirst();
        list.printList();


        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());

        list.addFirst("This");
        list.printList();
        System.out.println(list.getSize());
    }
}