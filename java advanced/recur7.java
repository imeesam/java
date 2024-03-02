import java.util.*;

class recur7 {
    // Ques print all subsequences of a string



    // bhaiee is my whoi kaam krt arhynhein bus is my ye h ky sbusequcne print hogyi bus recursion ko call krani h indx m plus 1 krdyenn ya or agr nhi hona h tu wesa hi rhny dyen 

    public static void subSeq(String str, int indx, String newString) {

        if (indx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(indx);
        // to be
        subSeq(str, indx + 1, newString + currChar);

        // to not ne
        subSeq(str, indx + 1, newString);

    }

    public static void main(String arg[]) {

    String str = "aaa";
    subSeq(str, 0, "");

    }
}