import java.util.*;

class java4 {


    // ab ek function banaya h print subset ky lie is ky andr ek loop chala liya h ky subset ,ky i = o sy subset ki  size tk or phir get i function  ki madad sy sary subset ko print krliya 
    
    public static void printsub(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();

    }

    public static void fiSub(int n, ArrayList<Integer> subset) {

        // jesy hi sab ny choice krli tu phir print krna h 
        if (n == 0) {
            printsub(subset);
            return;
        }
        // add hoga
        // hr level m elemet ky pass choice h ky wo chaye tu add hojye subset m ya nhi if yes then ye add wali command use ki or add kiya then dubra function ko call  and this time for n-1 
        subset.add(n);
        fiSub(n - 1, subset);



        // add nhi hoga
        // agar add nhi horha chara tu hum ussy remove krdyen gye us subset array list ky andr sy or jo n store h wo index ki akhri index per store h ab wo add nhi huwa
        subset.remove(subset.size() - 1);
        fiSub(n - 1, subset);

    }

    public static void main(String arg[]) {

        // sb sy phely tu ek integer bana liya ky kitny elemet hongye set ky andr
        int n = 4;
        // array list banaya so we cna store elemets of subset in it   
        ArrayList<Integer> subset = new ArrayList<>();
        fiSub(n, subset);

    }
}
