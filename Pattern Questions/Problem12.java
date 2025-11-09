public class Problem12 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++) {
           //spaces
           for(int j=1; j<=5-i; j++) {
               System.out.print(" ");
           }


           //numbers
           for(int j=1; j<=i; j++) {
               System.out.print(i+" ");
           }
           System.out.println();
       }

    }

}


