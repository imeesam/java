import java.util.*;

class Ninthclass {
    public static void main(String arg[]) {

        // String declartion

        // String name = "Meesam";
        // String fullName = "Meesam Rizvi";
        // String sentence = "My name is Syed Muhammad Meesam Abbas Rizvi.";
        // System.out.println(name);
        // System.out.println(fullName);
        // System.out.println(sentence);

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("your name is : " + name );

        // concatanetion

        // Scanner sc = new Scanner(System.in);
        // String Name = "Meesam";
        // String lastName = "Abbas" ;
        // String fullName = Name + "-" + lastName ;
        // System.out.println(fullName);
        // System.out.println(fullName.length());

        // char at printing each characters of the string .

        // Scanner sc = new Scanner(System.in);
        // String Name = "Meesam";
        // String lastName = "Abbas" ;
        // String fullName = Name + "-" + lastName ;
        // System.out.println(fullName);
        // System.out.println(fullName.length());
        // for(int i = 0; i < fullName.length() ; i++){
        // System.out.println(fullName.charAt(i));
        // }

        // COMPARING STRINGS

        // String name1 = "meesam";
        // String name2 = "meesam";

        // cases

        // 1) s1 > s2 will return +ve value
        // 2) s1 == s2 will retuen zero
        // 3) s1 < s2 will return -ve value

        // hello < wello                  example in comparsion of string
        // aaahello < aaauello           example in comparsion of string

        // if (name1.compareTo(name2) == 0) {
        //     System.out.println("strings are equal");
        // } else {
        //     System.out.println("strings are not same");

        // }

            String sentence = " my name is Meesam";
            // sub string (begning index , ending index)
            // sentence.length sy muraad h ky akhiri index tk jana h bhaiyaa
            String name = sentence.substring(12, sentence.length());
            System.out.println(name);





    }
}
