import java.util.Scanner;

public class For_loop{
    public static void main(String[] args) {
    //  for(int i=1; i<=10; i++){
    //     System.out.println(" Hello world");
    //  }


    //Q. Print the number from 0 to 10 using for loop
    // for(int i=1; i<=10; i++){
    //     System.out.println(i);
    // }


    //Q. print the sum of 1 to 10.
    //   int sum = 0;
    //  for(int i=1; i<=10; i++){
    //   sum = sum + i;
    //  }
    //  System.out.println("The sum is "+sum);


    //Q. print the table of a number input by a user
     System.out.print("Enter the number ");
     Scanner n = new Scanner(System.in);
     int number = n.nextInt();

     for(int i=1; i<=10; i++){
        System.out.println(number +" x " +i +" = "+ number*i);
     }
}
}