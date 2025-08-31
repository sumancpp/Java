import java.util.Scanner;

public class searchindexnumberina2darray {
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
        System.out.println("Enter your search element ");
        int search = sc.nextInt();

        boolean found = false;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(search==array[i][j]){
                    
                    System.out.println("Your element index number is "+i+","+j);
                    found = true;
                }
            }
        }
        if(!found){
        System.out.println("Not found");
        }

        sc.close();
    }
}
