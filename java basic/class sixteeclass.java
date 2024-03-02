import java.util.*;

class sixteeclass {
    public static int calStack(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        // if n is even
        if (n % 2 == 0) {
            return calStack(x, n / 2) * calStack(x, n / 2);
        } else {
            return calStack(x, n / 2) * calStack(x, n / 2) * x;
        }
    }

    public static void main(String arg[]) {

        int x = 2, n = 5;
        int ans = calStack(x, n);
        System.out.println(ans);

    }
}
