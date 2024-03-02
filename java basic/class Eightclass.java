import java.util.*;

class Eightclass {
    public static void main(String arg[]) {
        // Scanner sc = new Scanner(System.in);
        // int rows = sc.nextInt();
        // int cols = sc.nextInt();

        // int matrix[][] = new int[rows][cols];

        // // inputs
        // // rows
        // for(int i = 0 ; i < rows ; i++){
        // // columns
        // for(int j = 0 ; j < cols ; j++){
        // matrix[i][j] = sc.nextInt();
        // }
        // }
        // // output
        // for(int i = 0 ; i < rows ; i++){
        // // columns
        // for(int j = 0 ; j < cols ; j++){
        // System.out.println(matrix[i][j] + " ");
        // }
        // System.out.println();
        // }

        // EXERSICE
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];

        // inputs
        // rows
        for (int i = 0; i < rows; i++) {
            // columns
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            // columns
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == x) {
                    System.out.println("x found at location (" + i + ", " + j + ") ");
                }
            }

        }

    }
}
