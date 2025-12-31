class Student{
    String name;
    int age;
    float height;

    public void Printinfo(String name){
        System.out.println(name);
    }

    public void Printinfo(int age){
        System.out.println(age);
    }

    public void Printinfo(float hight){
        System.out.println(hight);
    }

    public void Printinfo(String name, int age){
        System.out.println(name+" "+age);
    }
}


public class FunctionOverloading {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Suman";
        s1.age = 21;
        s1.height = 5.8f;

        //s1.Printinfo(s1.age);
        s1.Printinfo(s1.name, s1.age);
    }
}
