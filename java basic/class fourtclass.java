import java.util.*;

class fourtclass {

    // basically ye ek function banya h or recursion function m hoti h tu iis m
    // basically ek ye kaam tha ky number print krwany thy so phely class bani
    // thprintnumber ky nam sy or int type declare ki or usky andr condition lagyi
    // ky agar 0 hoje tu value return hoje then ye kha kt us nummber ko print kro
    // phir dubra usi ky andr us ko call lagyi taky n-1 numbers tk jasky phir main
    // function m ussy call lagadi

    // public static void printNumber(int n){ // task 1
    // if(n==0){ //base case
    // return ;
    // }
    // System.out.println(n); // print
    // printNumber(n-1); // recursive call
    // }





    // public static void printNumber(int n){ task 2
    // if(n==6){
    // return;
    // }
    // System.out.println(n);
    // printNumber(n+1);};





    // public static void printSum(int i, int n, int sum) { // task 3
    //     // sb sy phely intial condition pass ki like (i) ye ye batye ga ky values kahan sy start hein, or phir second ye ky value kahan tk jaye gyien jo ky (n) h or last wo jahan per sb ka sum store hoga jis (sum) decklare kiya h  
    //     if (i == n) {
    //         sum += i;
    //         System.out.println(sum);
    //         return ;}
    //       sum += i;
    //      printSum(i + 1, n, sum);
    //      System.out.println(i);}



    // public static int calFactorial(int n){   // task 4   
        // sb sy phely humy n-1 calculate krna tha tu humny function ko dobra  call laga di then us ko store krway liya kisi int varible or phir factorial ky lie usko multiply kra diya n sy jo ky formula h then us cheez ko return krdi hunmy pir ek base lia jis m humnny ye condition rkhi ky agar user ghlti sy 0 ya 1 input kry tu wo 1 return kry becuz 0 or 1 ka factorial 1 hota h nicchy waly my m ny basically input lia h or phir function ko call krky usko store krwaliya h or phir print krliya h 
    //     if(n==1 || n == 0){
    //      return 1 ;
    //     }
    //    int fact_nm1=  calFactorial(n-1);
    //    int fac_n = fact_nm1 * n ;
    //    return fac_n;
    //  }


    public static void main(String arg[]) {
        // int n = 10; // task 1
        // printNumber(n);


        // int n = 1; // task 2
        // printNumber(n);



        // Scanner sc = new Scanner(System.in);  // task 3   
        // int i = sc.nextInt();
        // int n = sc.nextInt();
        // printSum(i, n, 0);



        // Scanner sc = new Scanner(System.in);  // task 4   
        // int i = sc.nextInt();
        // int ans = calFactorial(i);
        // System.out.println(ans);
    }
}
