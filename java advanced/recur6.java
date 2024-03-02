import java.util.*;

class recur6 {
    // Ques removing duplicates in string


    // tu sb sy phely tu humny is m fuc banya then us m str , indx , new string pass kiya  acha phir map ko static krdiya , phir curr char ko trace kiya with the help of index , phir cnditionn rkhi ky map m us current char ki value true h tu dubra recall kro function agr nhi h tu us ko new string m add kro or phir us jaga per value true krdo or dubra call kro base case ye h ky agr last index ajye tu usko print kr ky return hojao;

    public static boolean[] map = new boolean[26];

    public static void remDup(String str, int indx, String newString) {

        if (indx == str.length()) {
            System.out.println(newString);
            return;

        }

        char currChar = str.charAt(indx);
        if (map[currChar - 'a'] == true) {
            remDup(str, indx + 1, newString);

        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            remDup(str, indx + 1, newString);

        }

    }

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        remDup(str, 0, "");

    }
}