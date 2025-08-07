import java.util.Scanner;

public class if_else {

    public static void main(String[] args) {
        // System.out.print("Enter your age: ");
        // Scanner input = new Scanner (System.in);
        // int age = input.nextInt();

        // if(age >= 18){
        //     System.out.println("You are adult");
        // }
        // else {
        //     System.out.println("You are not adult");
        // }




        // Check odd even

        // System.out.print("Enter a number: ");
        // Scanner input = new Scanner (System.in);
        // int number = input.nextInt();

        // if(number % 2 == 0){
        //     System.out.println("This is a even number");
        // }
        // else {
        //     System.out.println("This is a odd number");
        // }



        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = input.nextInt();
        System.out.print("Enter the value of b: ");
        int b = input.nextInt();

        if(a == b){
            System.out.println("a and b are same.");
        }else if (a > b){
            System.out.println("a is bigger than b");
        }else if (b > a){
            System.out.println("b is bigger than a");
        }

    }
}
