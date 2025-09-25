public class integerandstringinterchange {
    public static void main(String[] args) {
       String str = "123";
       int number = Integer.parseInt(str);
       System.out.println(number);


      int anothernumber = 123;
      String anotherstr = Integer.toString(anothernumber);
      System.out.println(anotherstr.length());
    }
}
