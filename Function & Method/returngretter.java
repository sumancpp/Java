//Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;

public class returngretter {

    public static void gretter(int a, int b){
        if(a > b){
            System.out.println(a +"is gretter than"+b);
        }else{
            System.out.println( b +" is gretter than "+ a );
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1=sc.nextInt();
        System.out.print("Enter another number: ");
        int num2=sc.nextInt();

        gretter(num1, num2);
        sc.close();;
    }
}
