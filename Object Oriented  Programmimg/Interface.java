interface Animal{
    int eyes = 2; //Public, static and final by default
}

interface Goat {

}

class Horse implements Animal , Goat {//Multiple inheritence 
    public void walk(){
        System.out.println("Walks on four legs");
    }
}

public class Interface {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
    }
}
