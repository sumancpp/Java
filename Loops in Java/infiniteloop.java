public class infiniteloop {
    public static void main(String[] args) {
        int count=1;
        do{
            System.out.println(count);
            count++;
        }while(count>0);
    }
}
