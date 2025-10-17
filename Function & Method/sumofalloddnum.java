//Write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;

public class sumofalloddnum {

    // public static void printsum(int x){
    //     int total = 0;
    //     for(int i=1; i<=x; i++){
    //         if(i % 2 != 0){
    //             System.out.println(i);
    //             total+=i;
    //         }
    //     }
    //     System.out.println("The sum of all odd numbers from 1 to "+x+" is "+total);
    // }



    // public static void printsum(int x){
    //     int total = 0;
    //     for(int i=1; i<=x; i=i+2){
    //         total+=i;
    //     }
    //     System.out.println("The sum of all odd numbers from 1 to "+x+" is "+total);
    // }



    public static void printsum(int x){
        int low = 1;
        int high = x - 1;
        int count = x / 2;
        
        int total = ((low+high)/2)*count;
        
        System.out.println("The sum of all odd numbers from 1 to "+x+" is "+total);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printsum(n);

        sc.close();
    }
}
