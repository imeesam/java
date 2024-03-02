import java.util.*;

class thirtclass {

    public static void main(String arg[]) {
        // for sorting sb sy phely array banalia tky usky ky sth masti kryen

        // int arr[] = { 7, 8, 2, 3, 1 };

        // // buble sort

        // // ye wala outer loop h like counter loop h n-1 iterations ko count kry ga or
        // yahan n bascically arr.length h
        // for (int i = 0; i < arr.length - 1; i++) {

        // // innep loop h jahan per basically hum ny jo element sort hoty jarhy hein
        // unko loop sy hata ty ja rhy hein
        // for (int j = 0; j < arr.length - 1 - i; j++) {

        // // agar paros wala elemnt bara h tu loop ky andr jaye ga
        // if (arr[j] > arr[j + 1]) {
        // // swap // mtlb aros or paros waly ko swap krdiya
        // int temp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = temp;
        // }
        // }
        // // in the end sb number ko print krdiya
        // }
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // selection sort is m humn sy choty waly ko swap krty hein ek hi loop lagta h
        // bus

        // int arr[] = { 7, 8, 2, 3, 1 };

        // // outer loop n time runkr rha h mtlb arr.length
        // for (int i = 0; i < arr.length; i++) {
        // // phir jo phela element h usko smallest declarr krdiya tky usky agy waly
        // hissy
        // // sy loop riun kryen
        // int smallest = i;
        // // phir loop run kr rhyen samllest waly ky baad wala jo bhi digit usy sy
        // akhir
        // // tk
        // for (int j = i + 1; j < arr.length; j++) {
        // // condition lagyi h ky agar jo smallest h wo bara niklta h baad waly ky tu
        // us
        // // case m baad waly ko chota bando
        // if (arr[smallest] > arr[j]) {
        // smallest = j;

        // }
        // // phir swap ki logic lagyi h ky choty waly ko bary waly sy swap krdo
        // }
        // int temp = arr[smallest];
        // arr[smallest] = arr[i];
        // arr[i] = temp;

        // }
        // // then print ka rona dala h nichy
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");}

        // INSERTION SORT is m basically ye krty hein ky sb sy phely arr ko do hissy m
        // divide krtye hein ek hota h sorted or dusra hota h unsorted then ahista
        // ahista unsorted waly ko sorted m lekr aty hein .

        int arr[] = { 7, 8, 2, 3, 1 };
        // ye sorted part ky lie code h 
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i]; 
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            // placement
            arr[j+1] = current;
        }
        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");}

    }
}
