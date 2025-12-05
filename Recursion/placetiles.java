// Place tiles of size 1xm in a floor of size nxm

public class placetiles {
    public static int placeTiles(int n, int m){
        if(n == m){
            return 2;
        }
        if(n < m){
            return 1;
        }

        //vertically
        int verplacement = placeTiles(n-m, m);

        //horizontally
        int  horplacement = placeTiles(n-1, m);

        return verplacement + horplacement;

    }
    public static void main(String[] args) {
        int n = 4, m = 2;
        System.out.println(placeTiles(n, m));
    }
}
