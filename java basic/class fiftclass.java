import java.util.*;

class fiftclass {

    // int a and b are intinal terms jis ko hum print kraweyengye and then number
    // pass kryengye n jo ky jis digit tk jana h phir hum function ko call layenye
    // or us my sy 2 minus kryengye kyu 0 and 1 print krwa chukye hien phir hum ny
    // base case dia ky agar n = 0 ky bara br hu tu return hoje phir third number
    // cal ky lie perv ka sum kiya then recursive call lgyi us my a ki jaga b or b
    // ki jaga c daaali or n-1 kiya kyu c bhi achuka h
    // public static void fibbPrint(int a , int b , int n){ // task 6 print
    // fibbonaci
    // if(n==0){
    // return; }
    // int c = a + b ;
    // System.out.println(c); //ye tu c mtlb next term hogya
    // fibbPrint(b, c, n-1); //for next term ye call lagyi h n-1 kr ky or a ko b sy
    // or b ko c sy replace krdiya h }

    public static int calStack(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        int xpownm1 = calStack(x, n - 1);
        int xpown = x * xpownm1;
        return xpown;
    }

    public static void main(String arg[]) { // task 6
        // int a = 0 , b = 1 ;
        // System.out.println(a);
        // System.out.println(b);
        // int n = 7 ;
        // fibbPrint(a, b, n-2);




        int x = 2 , n = 5;
        int ans = calStack(x, n) ;
        System.out.println(ans);

    }
}