import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

    // add elements
        list.add(1);
        list.add(3);
        list.add(7);

        System.out.println(list);

    // get elements[get method always need index number]
        int elem = list.get(0);
        System.out.println(elem);

    // add elements in between arraylist
        list.add(1,9);
        System.out.println(list);

    // set element
        list.set(3,11);
        System.out.println(list); 
        
    // delete element[it also takes index number]
        list.remove(0);
        System.out.println(list);

    // size
        int size = list.size();
        System.out.println(size);

    // loops
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

    // sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
