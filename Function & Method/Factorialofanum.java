import java.util.Scanner;

public class Factorialofanum {
    public static int calfactorial(int a){
      if(a < 0){
        System.out.println("Invalid Number");
        return 0;
      }
        int fact = 1;
        for(int i=a; i>=1; i--){
          fact = fact * i;
        }
      System.out.println("The factorial of "+a+" is "+fact);

        return fact;
    }

  public static void main(String[] args) {
    System.out.print("Enter a number ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    calfactorial(num);
    //System.out.println("The factorial of "+num+" is "+result);
    sc.close();
  }   
}
