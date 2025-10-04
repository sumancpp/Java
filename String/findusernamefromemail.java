//nput an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.

import java.util.Scanner;

public class findusernamefromemail {
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     System.out.print("Enter your email: ");
     String email = sc.next();
     String userName = "";


     for(int i=0; i<email.length(); i++) {
       if(email.charAt(i) == '@') {
        break;
       } else {
         userName += email.charAt(i);
       }
     }


     System.out.println("Your user name is "+userName);
    }
}
