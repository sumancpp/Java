import java.util.Scanner;

public class maxandmininanarray {

   public static void main(String args[]) {
      System.out.print("Enter the size of the array: ");
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int numbers[] = new int[size];


      System.out.println("Enter array elements: ");
      for(int i=0; i<size; i++) {
          numbers[i] = sc.nextInt();
      }


    //   int max = Integer.MIN_VALUE; // -2147483648
    //   int min = Integer.MAX_VALUE; // 2147483647

      int max = numbers[0] ; 
      int min = numbers[0] ; 
     
       for(int i=0; i<numbers.length; i++) {
           if(numbers[i] < min) {
               min = numbers[i];
           }
           if(numbers[i] > max) {
               max = numbers[i];
           }
       }


       System.out.println("Largest number is : " + max);
       System.out.println("Smallest number is : " + min);
      
   sc.close();
}

}
