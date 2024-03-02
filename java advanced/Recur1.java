import java.util.*;

class Recur1 {
    public static void towHanoi(int n, String src, String helper, String dest) {

        // ye tower of hanoi ka procedure h is my sb sy phely humny ek integer n liya or 3 strings source helper and destination, sb sy phely hum n-1 ky lie function ko call lagyi or sb sy phely helper ko destination bandiya or destination ko helper phir humny print krna h ky disk number fallan source sy destination gya h then dubra function ko call laga kr using source as a helper destination m wo trnasfer kiya phir base call lagi ky agar n =1 ky bar br h tu wo directly chla jaye ga us ky liye bhi function print krna hooga then main function m kintny disk chaiye wo pass kiya and function ko call laga di aur phir helper , source and destination ki jaga H , S , D pass krdiya 

        if (n == 1) {
            System.out.println(" transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towHanoi(n-1, src, dest, helper);
        System.out.println(" transfer disk " + n + " from " + src + " to " + dest);
        towHanoi(n-1, helper, src , dest);

    }

    public static void main(String arg[]) {
        int n = 3;
        towHanoi(n, "S", "H", "D");

    }
}
