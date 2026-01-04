class Student {
    String name;
    int age;
    public double hight;

    public void studentInfo(){
        System.out.println(name);
        System.out.println(age);
    }

    // Student() {
    //     System.out.println("HI, I am a constructor");
    // }


    // Student(String name, int age){
    //   this.name = name;
    //   this.age = age;
    // }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student(){
        
    }

    public void Printinfo(String name2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Printinfo'");
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Suman Maity";
        s1.age = 21;
       

        Student s2 = new Student(s1);
        s2.studentInfo();
        
    }
}
