import java.util.HashSet;

class recur8 {
    // Ques print all unique subsequences of a string

    public static void uniqsubSeq(String str, int indx, String newString, HashSet<String> set){

        if (indx == str.length()) {
            if (set.contains(newString)) {
                return;

            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }

        }

        char currChar = str.charAt(indx);
        // to be
        uniqsubSeq(str, indx + 1, newString + currChar , set);

        // to not ne
        uniqsubSeq(str, indx + 1, newString , set);

    }

    public static void main(String arg[]) {

        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqsubSeq(str, 0, "", set);

    }
}
