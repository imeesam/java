import java.util.*;

class tenclass {
    public static void main(String arg[]) {

        StringBuilder name = new StringBuilder("Meesam");
        System.out.println(name);

        // char at 0 index
        // System.out.println(name.charAt(0));

        // // set char at index 0
        // name.setCharAt(0, 'p');
        // System.out.println(name);

        // insert char at index 0
        // name.insert(2,'e');
        // System.out.println(name);

        // delete a substring using . delete
        // name.delete(2, 4);
        // System.out.println(name);

        // appending in exsisting string
        // name.append(" "); // str = str + "e" if we do this string
        // name.append("A");
        // name.append("B");
        // name.append("B");
        // name.append("A");
        // name.append("S");
        // System.out.println(name);
        // System.out.println(name.length());

        // REVERSING A STRING

        for (int i = 0; i < name.length() / 2; i++) {
            int front = i;                                      // yahan per humny sb sy phely front or back index calculate kiya jisko humny aps m relpace krna h 
            int back = name.length() - 1 - i; // 5 - 1 - 0 = 4

            char frontchar = name.charAt(front);    // front or back per jo bhi char store thy unko humny iski madad sy phley find kiya 
            char backchar = name.charAt(back);

            name.setCharAt(front, backchar);        // then setCharAt ki madad sy humny char koreplace krdiya front ko back sy or back ko front sy 
            name.setCharAt(back, frontchar);
        }
        System.out.println(name);
    }
}