import java.util.Scanner;

public class calculatesumofNnum {
    public static void calsum(int num, int sum , int st){
        if(st > num){
             System.out.println("The sum is "+sum);
            return;
        }
        sum += st;
      calsum(num, sum, st + 1);
    }
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int st = 1;
        calsum(num, sum, st);
        sc.close();
    }
}
