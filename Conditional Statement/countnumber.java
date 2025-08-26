import java.util.Scanner;

public class countnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive = 0;
        int negetive = 0;
        int zero = 0;
        System.out.print("How many numbers you want to check: ");
        int check = sc.nextInt();
        System.out.print("Enter numbers: ");
        
        for(int i=1; i<=check; i++){
            int number = sc.nextInt();
            if(number > 0){
                positive++;
            }else if(number < 0){
                negetive++;
            }else{
                zero++;
            }
            
        }
        System.out.println("You enter "+positive+" positive number");
        System.out.println("You enter "+negetive+" negetive number");
        System.out.println("You enter "+zero+" zero number");
        sc.close();
    }

}
