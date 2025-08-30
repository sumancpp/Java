import java.util.Scanner;

public class printtranspose {
   
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the row number: ");
      int n = sc.nextInt();
      System.out.print("Enter the col number: ");
      int m = sc.nextInt();

      System.out.println("Enter elements: ");
      int matrix[][] = new int[n][m];
      for(int i=0; i<n; i++) {
           for(int j=0; j<m; j++) {
               matrix[i][j] = sc.nextInt();
           }
      }

      System.out.println("The transpose is : ");
      for(int j=0; j<m ;j++) {
          for(int i=0; i<n; i++) {
              System.out.print(matrix[i][j]+" ");
          }
          System.out.println();
      }

      sc.close();
   }
}


