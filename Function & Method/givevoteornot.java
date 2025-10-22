//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.Scanner;

public class givevoteornot {
    public static String calage(int age){
        String sms = (age>18)?"You can give vote":"You can not give vote";
        System.out.println(sms);
        return sms;

        
        // if(age >= 18){
        //     System.out.println("You can give vote");
        // }else{
        //     System.out.println("You can not give vote");
        // }
    }
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        calage(age);

        sc.close();
        
    }
}
