//Make a function to check if a given number n is even or not.

import java.util.Scanner;

public class checkevenornot {

    public static void checknum(int num){
        if(num % 2 ==0){
            System.out.println("This is a even number.");
        }else{
            System.out.println("This is a odd number");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc =new Scanner (System.in);
        int number=sc.nextInt();
        sc.close();

        checknum(number);
        
    }
}
