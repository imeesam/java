import java.util.*;

class java2 {

    // shuru m i , j ko hoga wo hoga 0,0 aur end wala cell hoga n-1 , m-1  
    // n-1 or m-1  walyy cell pr srif jab i , j bara hojye tu iska ka matlb ky wo 1 return krye ga mtlb ab agye koi path nhi hein ap wahin per rhyen 
    // agar kisi bhi point per i or j n-1 , m-1 ky barbr hojye tu is ka mtlb h ky ap boundarry per hein ab no ways 
    public static int countPaths(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }                                            // these are bases cases
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // move downwards
        int downPath = countPaths(i + 1, j, n, m);
                                                    // recursionn ki condition 
        // move right
        int rightPath = countPaths(i, j + 1, n, m);

        return downPath + rightPath;

    }

    public static void main(String arg[]) {
        int n = 2 , m = 2 ;
        int totalPaths = countPaths(0, 0, n, m);
        System.out.println(totalPaths);


    }
}