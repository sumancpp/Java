public class printNumform1to5 {
    public static void printNum(int n){
        if (n == 6){
            return ;
        }
        System.out.println(n);//1 , 2, 
        printNum(n + 1);
    }
    public static void main(String[] args) {
        int num = 1;
        printNum(num);
    }
}
