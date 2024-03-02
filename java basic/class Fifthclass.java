import java.util.*;

class Fifthclass{ 
//     public static int calSum(int a , int b){    // declaring function and then callinhg it in main function 
//         int sum = a + b ;
//         return sum ; 
//  }

  public static int calprod(int a , int b){    // declaring function and then callinhg it in main function we can also direct return it with out declaring another type  
        return a * b;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);        // scanner class
        int a = sc.nextInt();                       // taking input a and b
        int b = sc.nextInt();
        
         int prod =  calprod(a , b);                  // passing argumnets
         System.out.println("product of 2 numbers is:" +prod );                   // printing sum





    }}