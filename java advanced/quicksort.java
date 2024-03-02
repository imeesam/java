import java.util.*;

class quicksort {
    public static int partiotion(int arr[], int low, int high) {  // sara main kaam ye kry ga  
        int pivot = arr[high];     // sb sy phely tu pivot choose kiya h yahan per last elemet m wrna umman 4 stpes hoty hein un my sy koi bhi choose krskrty hein 
        int i = low - 1;           // ye i traack kry ga ky pivot sy choty kitny element ayengye humary pass  basciacally kahli jaga banay ky lie track kry ga 

        for (int j = low; j < high; j++) {   // array per trivares krna h 
            if (arr[j] < pivot) {  // agar humaye ek aesa elemt milgye jo pivot sy kaam h tu is ka mtlb h ky humny7 ek hjaga aur milgyi for that i +++
                i++;
                // ab swap krna h      ye saarry choty elemnt sary shur m agye hein or ab pivot ko set krna h  
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }

        }
        // ab pivot ky lie jaga banani h tu ek kahlai jaga aur chayie so i++
        i++;
        // then swap 
        int temp = arr[i];
        arr[i] = pivot;    //pivot[high]= pivot
        arr[high] = temp;
        return i;
    }

    public static void quicsort(int arr[], int low, int high) {
        if (low < high) { // phely step m ye dekha h ky humara low jo h high sy km ho is m quic sort
                          // implement hoga

            int pidx = partiotion(arr, low, high);     // ye function partion kry ga ye main kaam krky dega or ye functiobn sari information la kr dy ga  

            quicsort(arr, low, pidx - 1);    //pivot sy chotty waly elemt ko sort krdiya 
            quicsort(arr, pidx + 1, high);   // pivot sy bary elemt sort krny ky lie call krsiya 

        }

    }

    public static void main(String arg[]) {
        int[] arr = { 6, 3, 9, 5, 2, 8 }; // array defined
        int n = arr.length; // lenght of array

        quicsort(arr, 0, n - 1);

        // print
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}