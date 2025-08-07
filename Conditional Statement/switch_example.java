import java.util.Scanner;

public class switch_example {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        switch(number){
          case 1:
          System.out.println("Hello");
          break;
          case 2:
          System.out.println("Namaste");
          break;
          case 3:
          System.out.println("Bonjur");
          break;
          default:
          System.out.println("Enter a valid number between 1 and 3");
        }
    }
}
