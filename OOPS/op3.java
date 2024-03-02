import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


// agar hum pareeshan hein baar baar import krky tu ek bhi baar import krlety hein

// import java.util.*;

public class op3 {
    public static void main(String args[]) {
        // defining array list (Array list objects ki hony wali so we will not use int
        // for this we will use class of int and float)
        // Integer | Float | Boolean |String

        // ArrayList<Integer> list = new ArrayList<Integer>(); // for Integer
        // ArrayList<String> list1 = new ArrayList<String>(); // for String
        // ArrayList<Boolean> list2 = new ArrayList<Boolean>(); // for Boolean

        ArrayList<Integer> list = new ArrayList<Integer>();

        // Performing opreations

        // adding elements in array list
        // for (int i = 0; i < 10; i++) {
        // Scanner sc = new Scanner(System.in);
        // int no = sc.nextInt();
        // list.add(no);
        // }

        list.add(90);
        list.add(30);
        list.add(70);
        System.out.println(list);
        // printing arraylist
        // System.out.println(list);

        // geting this element
        // int element = list.get(2);
        // System.out.println(element);

        // adding elment in b/w
        // list.add(3 , 1);
        // System.out.println(list);

        // setting element
        // list.set(0, 5);
        // System.out.println(list);

        // delete element
        // list.remove(0);
        // System.out.println(list);

        // size of array list
        // int size = list.size();
        // System.out.println(size);

        // printing element of array list thourgh loops
        // for (int i = 0; i < list.size(); i++) {
        //     System.out.println(list.get(i));}

        // SORTING 

        // in array list we can easily sort elements in ascending order using a simple function 

        // we have to import this collection before using it 

        // we dont have to write code from strach for sorting its alread have a claass for this purpose

        // collection is also an class for sorting 

        Collections.sort(list);    
        System.out.println(list); 
        



    }

}
