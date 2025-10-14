//Write a program to print Fibonacci series of n terms where n is input by user :
//0 1 1 2 3 5 8 13 21 ..... 

import java.util.Scanner;

public class FibonacciSeries {
    public static void calfibonacci(int n){
         int first = 0, second = 1;
        System.out.println(first);
        System.out.println(second);

        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.println(next);
            first = second;
            second = next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        calfibonacci(n);
        sc.close();
    }
}

