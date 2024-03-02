import java.util.*;

class merSort {

    public static void conquer(int arr[], int si, int mid, int ei) {
        // for this purpose first of all we have to create a merge array which willl be
        // new memory location
        int mergearr[] = new int[ei - si + 1]; // is ka size hoga starting sy lekr ending elemnt h us ky equal (+1 ki
                                               // wjha zero indexing h)

        // agar ab merged array m index dalna start krna h usky lie do indx bana lia
        int indx1 = si; // ind 1 tracking 1 array} {starting from si
        int indx2 = mid + 1; // ind 2 tracking 2 array} {starting fromm mid +1
        int x = 0; // x tracking mergearr

        while (indx1 <= mid && indx2 <= ei) { // jab tk ye cndition h hum jb tk sort kryengye
            if (arr[indx1] <= arr[indx2]) { // do array hein or 3 elemt hein so hum compare kr kry hein ky si of arr 1
                                            // agar bara h from mid+1 of ei tu is ki value new merge array m store
                                            // krwado
                mergearr[x++] = arr[indx1++];

            } else {
                mergearr[x++] = arr[indx2++];
            }

            // above loop will only work when comparing btw both array what happen if ek
            // array m compparsion hogyi or dusara arry rhy gya for this

        }
        while (indx1 <= mid) {
            mergearr[x++] = arr[indx1++];
        }

        while (indx2 <= ei) {
            mergearr[x++] = arr[indx2++];
        }

        // orginal array ky andr merge arry ky elements ko copy krna h for this for loop
        // lagay h
        for (int i = 0, j = si; i < mergearr.length; i++, j++) {
            arr[j] = mergearr[i];

        }

    }

    public static void divide(int arr[], int si, int ei) { // purpose of this function is to divde array ; is step m
                                                           // array ki zaroot h statring ya ending

        // kis bhi poinnt per agar si ei sy bara ya barabr hony lagye tu is ka mtlb h ek
        // ab single elemet agya h ya bilkul ktm hi krdiya h
        if (si >= ei) {

            return;
        }

        // sb pheli cheez apny array ki mid ko nikalna
        int mid = si + (ei - si) / 2; // although si + ei/2 and si+(ei-si) are same but if the value are
        // greater and if add them then a problem of space would be arrived .
        divide(arr, si, mid); // for next step statring index will be si and ending will be mid.(phela hissa)
        divide(arr, mid + 1, ei); // dusra hisa break krny ky baad ky step hein ye

        // ab ye hissa jo tha wo tu divide ka tha ab krna h sorting us ky lie use hoga
        // conquer
        conquer(arr, si, mid, ei);

    }

    public static void main(String arg[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length; // array ka size

        divide(arr, 0, n - 1); // calling function
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
