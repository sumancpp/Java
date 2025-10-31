public class fibonacci {
    public static void printfibonacci(int first, int second, int n){
        if(n == 0){
            return;
        }
        int third = first + second;
        System.out.println(third);
        printfibonacci(second, third, n-1);

    }
    public static void main(String[] args) {
        int  first = 0;
        int second = 1;
        int n = 7;
        System.out.println(first);
        System.out.println(second);
        printfibonacci(first, second, n-2);
 
    }
}
