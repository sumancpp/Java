//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

import java.util.Scanner;

public class findcombinedlengthofstrings {
    public static void main(String[] args) {
        
     Scanner sc = new Scanner (System.in);
     System.out.print("Enter the size of the array: ");
     int size = sc.nextInt();
     String array[] = new String[size];
     int totLength = 0;

    System.out.println("Enter the strings: ");
     for(int i=0; i<size; i++) {
       array[i] = sc.next();
       totLength += array[i].length();
     }


     System.out.println("Total strings length is "+totLength);
     sc.close();
    }
}
