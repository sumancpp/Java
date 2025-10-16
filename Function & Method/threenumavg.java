//Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;

public class threenumavg {
    public static String printavg(int a, int b, int c){
       double ans = (double)(a+b+c)/3.0;
       String result = String.format("%.2f",ans);
       return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter a number: ");
        int num3 = sc.nextInt();

        String result = printavg(num1,num2,num3);
        System.out.printf("The avg of the three number is "+result);
         sc.close();
    }
}
