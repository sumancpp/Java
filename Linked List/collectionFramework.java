import java.util.*;
public class collectionFramework {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.add("Linkedlist");// By default add behave like addlast
        //list.addLast("Linkedlist");
        System.out.println(list);

        // Size
        System.out.println(list.size());

        // print using loop
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");


        // delete first
        list.removeFirst();
        System.out.println(list);


        // delete last
        list.removeLast();
        System.out.println(list);

        // delete using index no
        list.remove(1);
        System.out.println(list);
    }
}
