import java.util.Scanner;

public class Printindexelement {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]=new int[size];

        System.out.println("Enter the elements: ");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter search number: ");
        int search = sc.nextInt();
        
        boolean found = false;
        for(int i=0; i<size; i++){
            if(arr[i] == search){
                System.out.println("Your search element index number is "+ i);
                found = true;
            }}
            if (!found) {
            System.out.println("Your search number is not found");
        }
        sc.close();
    }
}
