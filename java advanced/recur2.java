import java.util.*;

class recur2 {

    // humy number ko reverse print krwana h is liye sb sy phely humny charcter index krwaya aur phir function ko dubrra call kiya or n-1 pass krdia base case dia ky agar indx zerro h tu char phrint krdo sb sy phely or return. or phir function ko call laga di
    public static void revStrin(String str, int indx) {
        if (indx == 0) {
            System.out.println(str.charAt(indx));
            return;

        }
        System.out.println(str.charAt(indx));
        revStrin(str, indx - 1);

    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        revStrin(str, str.length()- 1);
    }
}
