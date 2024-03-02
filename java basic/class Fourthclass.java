import java.util.*;

class Fourthclass{ 
    public static void printMyName(String name){    // declaring function and then callinhg it in main function 
        System.out.println(name);
        return ; 
 }
    public static void main(String arg[]){
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.next();                    // taking input as sc.next
            
             printMyName(name);                         // calling function 
        }





    }}