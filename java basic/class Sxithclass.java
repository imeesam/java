import java.util.*;

class Sxithclass{ 
         
     public static void calFactorial(int n ){
        int factorial = 1 ;
        for( int i = n; i>=1 ; i-- ){
            factorial = factorial * i ;
          }
             System.out.println(factorial);
             return ;
     }

    public static void main(String arg[]){
            Scanner sc = new Scanner(System.in);        // scanner class
            int n = sc.nextInt();                       // taking input a and b
            calFactorial( n );                          // calling function 

    }}
