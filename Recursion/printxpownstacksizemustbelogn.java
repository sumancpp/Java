public class printxpownstacksizemustbelogn {

    public static int calculate(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return calculate(x, n/2) * calculate(x, n/2);
        }else{
            return calculate(x, n/2) * calculate(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
         int x=2, n=5;
        int ans = calculate(x, n);
        System.out.println(ans);
    }
}
