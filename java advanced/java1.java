import java.util.*;

class java1 {

    // is sawal m sb sy phely func banya then loop lagay ky i= 0 or str ki last ind tk jaye or hr bar wo curr char m storee ho then us ko new string m add hoga aur jo do remainng hyein wo sub string ki madad sy hojye ga or phir functionn ko bubara call algyen is martaba curr char ko add kr ky . phir base case m agr str ki lenght khtm hojye tu smiply ussy print kr ky retuern krnah 
    public static void priPermutation(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currchar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            priPermutation(newstr, permutation + currchar);
        }

    }

    public static void main(String arg[]) {
        String str = "abc";
        priPermutation(str, "");

    }
}
