public class gretestcommondivisor {

     public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;//temp=4
            b = a % b;//b=0
            a = temp;//a=4
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 8;

        int result = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
    }
}
