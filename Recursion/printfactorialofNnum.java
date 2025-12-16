import java.util.Scanner;

public class printfactorialofNnum {
    public static int printfac(int num){
        if(num == 0 || num == 1){
            return 1;
        }

        int fact_nm1 = printfac(num - 1);
        int fact_n = num * fact_nm1;
        return fact_n;


        // int fact_n = num * printfac(num - 1);
        // return fact_n;
    }
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = printfac(num);
        System.out.println("The factorial of "+num+" is "+result);
        sc.close();
    }
}
