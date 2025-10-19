//Write a function that takes in the radius as input and returns the circumference of a circle.


import java.util.Scanner;

public class curcumference {
    public static double calradius(int a){
        double ans = 2 * 3.14 * a;
        return ans;
    }
    public static void main(String[] args) {
        System.out.print("Enter the radius of a circle ");
        Scanner sc=new Scanner(System.in);
        int radius = sc.nextInt();
        double answer = calradius(radius);

        System.out.println("The circumference of a circle is "+answer);

        sc.close();

    }
}
