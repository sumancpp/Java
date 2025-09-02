import java.util.Scanner;

public class basicof2darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the row number: ");
        int rows = sc.nextInt();
        System.out.print("Enter the coloum number: ");
        int cols = sc.nextInt();

        int array[][]=new int[rows][cols];

        System.out.println("Enter the array elemnts: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
            array[i][j]=sc.nextInt();
            }
        }
        System.out.println("Your 2D array is ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
            System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
