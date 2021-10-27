public class TopDown {
    public static int fibTopDown(int n) {

        if(n==0) {
            return 0;
        }
        if(n==1) {
            return 1;
        }
        return fibTopDown(n-1) + fibTopDown(n-2);
    }
}

