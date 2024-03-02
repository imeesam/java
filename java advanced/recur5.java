import java.util.*;

//  QUESTION move all x to end of the string 

class recur5 {

    // is my toh sb sy phely fun def kia and us my indx str count or new string pass kiya phir indx ki madad sy curr char track kiya and us my dekha ky agar curr char x ky barabr h tu phir count m ++kiya or dubra function ko call lagyi indx m +1 kr ky or else m ye kiya h agar curr char x ky ilawa kuch aur h tu usko newstring m add krdo or phir fun ko call laga di , phir x ko bhi print kra diya for loop ky zaryie us m count ajye ga or new string ko print krwaliya...
    public static void moveX(String str, int indx, int count, String newString) {
        if (indx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
              }
            System.out.println(newString);
            return;

        }
        char currChar = str.charAt(indx);
        if (currChar == 'x') {
            count++;
            moveX(str, indx + 1, count, newString);
        } else {
            newString += currChar;
            moveX(str, indx + 1, count, newString);
        }

    }

    public static void main(String arg[]) {
        String str = "axbxbxax";
        moveX(str, 0, 0, "");

    }
}