import java.util.Scanner;

public class tableofnnumber {

    public static void maketable(int num) {
        for(int i=1; i<=10; i++){
            System.out.println(num+"x"+i+" = "+num*i);
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        maketable(number);

    }
}
