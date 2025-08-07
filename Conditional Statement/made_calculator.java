// Q. Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
// 	1 : + (Addition) a + b
// 2 : - (Subtraction) a - b
// 3 : * (Multiplication) a * b
// 4 : / (Division) a / b
// 5 : % (Modulo or remainder) a % b
// Calculate the result according to the operation given and display it to the user

import java.util.Scanner;

public class made_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        
        System.out.println("Enter which operation you want ");
        Scanner sc = new Scanner(System.in);
        String symbol = sc.nextLine();
        switch(symbol){
            case "+":
            System.out.println("The addition is "+ num1 + num2);
            break;
            case "-":
            System.out.println("The subtraction is "+ (num1 - num2));
            break;
            case "*":
            System.out.println("The multipication is "+num1 * num2);
            break;
            case "/":
            System.out.println("The division is "+num1 / num2);
            break;
            case "%":
            System.out.println("The modulo is "+num1 % num2);
            break;

            default:
            System.out.println("Enter a valid operations");
        }
    }
}
