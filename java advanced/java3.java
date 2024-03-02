import java.util.*;

class java3 {

    // is m basically ye kia h humny ky sb sy phely function banya h us m sb sy phely ye assume kiya h ky jis ko bulna h wo singlr aye ga  tu n-1 fuc ko call krky store krya int m or phir pair ky lie humnny n-1 * calguest(n-2) ko call kridiya or usko store krdiya or phir dono ko return krdiya. publiuc static int is liye use kiya h 

    // or base case m humny ye pass kiya h ky agar n less tahn or equal to one hu tu 1 pass krdo or phir in the end humny print krdiya 

    public static int calGuest(int n) {
        if (n <= 1) {
            return 1;

        }

        // for single ways

        int singPair = calGuest(n - 1);

        // for pair wayas
        int Pair = (n - 1) * calGuest(n - 2);

        return singPair + Pair;

    }

    public static void main(String arg[]) {

        int n = 4;
        System.out.println(calGuest(n));

    }
}
