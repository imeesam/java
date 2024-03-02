import java.util.*;

class recur9 {
 // print keypad combination 
    public static String[] keypad = {"." ,"abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void keyComb(String str , int indx , String combination){
        if(indx == str.length()){
            System.out.println(combination);
            return;
        }

        char currChar = str.charAt(indx);
        String mapping = keypad[currChar-'0'];

        for(int i = 0 ; i <mapping.length(); i++ ){
            keyComb(str, indx+1, combination+mapping.charAt(i));
        }

    }

    public static void main(String arg[]) {
        String str = "23";
        keyComb(str , 0, "");
    }
}
 