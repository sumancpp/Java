import java.util.Scanner;

public class checkprimeornot {

    public static void checkprime(int num){
        int count = 0;
        for(int i=1;i<=num;i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("You enter a prime number.");
        }else{
            System.out.println("You don't enter a prime number.");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        checkprime(number);

        
    }
}
