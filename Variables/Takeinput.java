import java.util.Scanner;

public class Takeinput {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String name1 = sc.next();//Suman Maity
        // System.out.println(name1); // Suman
        

        // Scanner sc1 = new Scanner(System.in);
        // String name2 = sc1.nextLine();//Suman Maity
        // System.out.println(name2); // Suman Maity


       // Q.Take two variables and print their sum

       Scanner input = new Scanner(System.in);
       int num1 = input.nextInt();

       int num2 = input.nextInt();

       int sum = num1 + num2;

       System.out.println("The sum is " + sum);

    }
}
