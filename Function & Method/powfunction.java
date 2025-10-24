//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

import java.util.Scanner;

public class powfunction {
    public static void pow(int a, int b){
        double result = Math.pow(a,b);
        System.out.println(a+" raised to "+b+" is "+result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter another number: ");
        int num2 = sc.nextInt();

        pow(num1,num2);
        sc.close();
    }
}
