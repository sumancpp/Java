class Pen{
    String color;
    String type;//Ballpen , Gelpen

    public void write(){
        System.out.println("Writing somthing...");
    }

    public void printcolor(){
        System.out.println(color);
        System.out.println(type);
    }
}

class Student {
    String name;
    int age;

    public void studentinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class definneClass {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "Black";
        // pen1.type = "gel";

        // Pen pen2 = new Pen();
        // pen2.color = "Red";
        // pen2.type = "BallPen";

        // pen1.write();
        // pen1.printcolor();
        // pen2.printcolor();

        Student s1 = new Student();
        s1.name = "Suman Maity";
        s1.age = 21;

        s1.studentinfo();
        
    }
}
