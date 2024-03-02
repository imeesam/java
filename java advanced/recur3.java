import java.util.*;

class recur3 {
    public static int first = -1;
    public static int last = -1;
// recursion m humshea jab bhi variable pass kryen tu wo meomeory m bar bar banty heinn tu hum chatye hein ky wo bar bar na banye static rhyen tahts why we used this 
    public static void findOccurence(String str, int indx, char element) {
    // ab humny occ print krani h tu humny cndtion di ky agaar indx jo h wo bilkul akhri tk ponchy jaye tu first or last occ ko print kr ky return krdo 
        if (indx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
// yahan per humny normally ek function banya 3 para meter pass kiye or str indx and char phir ye kiya ky ek char banya jo ky str ky elemt ko index ky zariye dekhya ga phir condition rkhi ky agar current char jo h elemet ky bara br h jo humnny pass kia h for e.g (a) tu us my bhi agr wo pheli bar aya h tu usko first m update krdo nhi tu bar bar arha tu usko last m update krty rho or bilkul last element hoga uska index store hojye ga .
        char currentChara = str.charAt(indx);
        if (currentChara == element) {
            if (first == -1) {
                first = indx;
            } else {
                last = indx;
            }
// funtion ko dubra call lagyi h +1 krky taky hr char sy hota huwa guzry
        }
        findOccurence(str, indx + 1, element);

    }

    public static void main(String arg[]) {
        // yahan per humny 0 pass kiya h  , or elemet 0 
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        findOccurence(str, 0, 'a');

    }
}
