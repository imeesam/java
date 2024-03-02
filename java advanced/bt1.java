import java.util.*;

class java1 {

    //   sb sy phely tu function create in which str , indx or new str ya perm pass kiya then loop chalya ky i jaye str  ki length tk or hr bar increase ho then curr char ko store kiya with the help of index then new string banya jis my curr char ko remove kia with the help of substring and then dubara function ko call kiya for next index aur is m permutationn ky andr current value add krwaddi.

    public static void BackTracking(String str, String Permutation, int indx) {

        if (str.length() == 0) {
            System.out.println(Permutation);
            return;

        }

        for (int i = 0; i < str.length(); i++) {

            char currchar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            BackTracking(newstr, Permutation + currchar, indx + 1);

        }

    }

    public static void main(String arg[]) {
        String str = "ABC";
        BackTracking(str, "", 0);

    }
}
