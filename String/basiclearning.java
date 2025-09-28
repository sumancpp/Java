import java.util.Scanner;

public class basiclearning {
    public static void main(String[] args) {
        // String name = "Suman";
        // String fullname = "Suman Maity";
        // String sentence = "I am a programmer";

    //     Scanner sc = new Scanner(System.in);
    //     // String name = sc.next();// Suman Maity
    //     // System.out.println("My name is "+name);//Suman

    //     String fullname = sc.nextLine();// Suman Maity
    //     System.out.println("My name is "+fullname);//Suman Maity
    String firstname = "Suman";
    String lastname = "Maity";
    String fullname = firstname +" "+ lastname;// Joining two string is called Concatenation
    System.out.println(fullname);
    // System.out.println(fullname.length());



    //charAt
    for(int i=0; i<fullname.length(); i++){
        System.out.println(fullname.charAt(i));
    }

    
     }
}
