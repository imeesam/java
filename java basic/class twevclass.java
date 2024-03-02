import java.util.*;

class twevclass {
    public static void main(String arg[]) {

        // BIT MAUPLATIONN

        // GET BIT ( TO FIND ANY NO ON GIVEN BINARY NUMBER AT POSITION I )

        // int n = 5; // binary num jis ka positon find krna h // [{5 == 0101}]
        // int pos = 2; // postion per bit find krna h zero h ya one
        // int bitMask = 1 << pos; // bit ko phir left shift krky dekha h
        // if ((bitMask & n) == 0) {
        // System.out.println("Bit was zero"); // phir condition lagyi h ky agr
        // opreation AND (&) bara ber h zero ky tu
        // // zero bit h other wise other wise non zero bit h

        // } else {
        // System.out.println("Bit was one");
        // }

        // SET BIT koi bhi position di hui hogyi us positon ki bit ko one bana h mtlb
        // set krna h

        // int n = 5; // binary num jis m ungli krni h // [{5 == 0101}]
        // int pos = 1; // postion per bit set krna h
        // int bitMask = 1 << pos; // bit ko phir left shift krky dekha h

        // int newNumber = bitMask | n ; // us ky baad OR opreation perform kiya h tk
        // bit set hojye
        // System.out.println(newNumber);

        // CLEAR BIT koi bhi position di hui hogyi us positon ki bit ko zero bana h mtlb
        // clear krna h

        // int n = 5; // binary num jis m ungli krni h // [{5 == 0101}]
        // int pos = 2; // postion per bit set krna h
        // int bitMask = 1 << pos; // bit ko phir left shift krky dekha h
        // int notBitMask = ~(bitMask); // bit ko phir left shift krky dekha h

        // int newNumber = notBitMask & n; // us ky baad OR opreation perform kiya h tk
        // bit set hojye
        // System.out.println(newNumber);

        // UPDATE BIT kis bhi inary no per kisi bhi postion pernbit update kiya jaskta h
        // zero ya phir one .
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();

        int n = 5;      // is bit(0101) ko agar set(1) kiya tu result aye ga (0111) or agar is bit ko clear(0) krdiya tu result ayga 0001 .
        int pos = 1;
        int bitMask = 1 << pos;

        if (oper == 1) {
            // set     oper = 1 
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {      
            // clear      oper = 0 
            int notBitMask = ~(bitMask);
            int newNumber = notBitMask & n;
            System.out.println(newNumber);

        }
    }
}