public class comparetwostring {
    public static void main(String[] args) {
        String name1 = "Suman";
        String name2 = "Sumana";

        // s1 > s2 : +ve value
        // s1 = s2 : 0
        // s1 < s2 : -ve value

         int result = name1.compareTo(name2);

        // if (result == 0) {
        //     System.out.println("Strings are equal");
        // } else if (result > 0) {
        //     System.out.println("name1 is bigger");
        // } else {
        //     System.out.println("name2 is bigger");
        // }



       //DO NOT USE == to check for string equality
       //Gives correct answer here
    //    if(name1 == name2) {
    //        System.out.println("They are the same string");
    //    } else {
    //        System.out.println("They are different strings");
    //    }


       //Gives incorrect answer here
       if(new String("Tony") == new String("Tony")) {
           System.out.println("They are the same string");
       } else {
           System.out.println("They are different strings");
       }

    }
}
