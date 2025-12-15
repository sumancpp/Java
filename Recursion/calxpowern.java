public class calxpowern {
    public static int calculate(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xpown = x * calculate(x, n-1); 
        return xpown;
        
    }
    public static void main(String[] args) {
        int x=0, n=3;
        int ans = calculate(x, n);
        System.out.println(ans);
    }
}
