class Student {
    String name;
    static String collage;

 public static void changeClg() {
    collage = "New Collage";
    System.out.println(collage);
 }
}

public class Static {
    public static void main(String[] args) {
        Student.collage = "omdayal";
        Student s1 = new Student();
        System.out.println(s1.collage);
        s1.changeClg();
        s1.name = "Suman";
        System.out.println(s1.name);
    }
}
