import java.util.Scanner;

public class printstring {


   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of the array: ");
      int size = sc.nextInt();
      String names[] = new String[size];


      System.out.println("Enter array elements: ");
      for(int i=0; i<size; i++) {
          names[i] = sc.next();
      }
       

       for(int i=0; i<names.length; i++) {
           System.out.println("name " + (i+1) +" is : " + names[i]);
       }

       sc.close();
      
   }
}


