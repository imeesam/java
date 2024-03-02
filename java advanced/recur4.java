import java.util.*;

class recur4 {
    public static boolean isSorted(int arr[], int indx) {
        if (indx == arr.length - 1) {
            return true;

        }

        if (arr[indx] < arr[indx + 1]) {
            // array is sorted till now
            return isSorted(arr, indx + 1);
        
        } else {
            return false;
        }



        // reversed condition can be used here 
        // if (arr[indx] < arr[indx + 1]) {
        // arrray is unsorted 
        // return false;}
        // return isSorted(arr, indx + 1);

    }

    public static void main(String arg[]) {
        int arr[] = { 1, 2, 3 };
        System.out.println(isSorted(arr, 0));

    }
}

// Certainly, let's break down each line of the code and explain what it does:

// 1. `public static boolean isSorted(int arr[], int indx) {`
//    - This line defines a method named `isSorted`. It takes two parameters: an integer array `arr` and an integer `indx`. It's a boolean function, meaning it will return either `true` or `false`.

// 2. `if (indx == arr.length - 1) {`
//    - This line checks if the `indx` is equal to the last index of the array `arr` (i.e., if we're at the end of the array).

// 3. `return true;`
//    - If the condition in line 2 is met, it means the array is sorted. In this case, the function returns `true`.

// 4. `if (arr[indx] < arr[indx + 1]) {`
//    - If the condition in line 2 is not met, this line checks if the element at the current index `indx` is less than the element at the next index (`indx + 1`).

// 5. `return isSorted(arr, indx + 1);`
//    - If the elements are in the correct order, it calls the `isSorted` function recursively with an incremented index (`indx + 1`) to check the next pair of elements.

// 6. `} else {`
//    - If the condition in line 4 is not met (i.e., if the current element is greater than or equal to the next element), it enters this block.

// 7. `return false;`
//    - It returns `false` because the array is not sorted in ascending order.

// 8. `}`
//    - Closes the else block.

// 9. `public static void main(String arg[]) {`
//    - This line defines the `main` method, which is the entry point of the Java program. It takes an array of strings as its argument.

// 10. `int arr[] = { 1, 2, 3 };`
//     - Here, an integer array named `arr` is declared and initialized with the values 1, 2, and 3.

// 11. `System.out.println(isSorted(arr, 0));`
//     - This line calls the `isSorted` function with the array `arr` and an initial index of 0. It then prints the result of the function to the console.

// 12. `}`
//     - Closes the `main` method.

// This code essentially defines a function (`isSorted`) to check if an array is sorted in ascending order and then tests this function in the `main` method with a sample array to see if it's sorted or not, printing the result.