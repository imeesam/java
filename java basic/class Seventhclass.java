import java.util.*;
class  Seventhclass {
    public static void main(String arg[]){
    //         int [] marks = new int[3];
    //         marks[0] = 14;   // phy marks
    //         marks[1] = 27;   // maths marks
    //         marks[2] = 34;   // urdu marks 
    //         // System.out.println(marks[0]); 
    //         // System.out.println(marks[2]); 
    //         // System.out.println(marks[1]);      // avoiding this shittttt using loop


    //           for(int i = 0 ; i<3 ; i++){
    //     System.out.println(marks[i]); }

    // Scanner sc = new Scanner(System.in);
    // int size = sc.nextInt();
    //                                         // a program taking random number as input and then printing the array(null).
    // int marks[] = new int[size];
    // for(int i = 0 ; i<size ; i++){
    //     System.out.println(marks[i]); }





    //  Scanner sc = new Scanner(System.in);
    //  int size = sc.nextInt();
    //                                         // a program taking random number as input and then taking the numbers input and then printing the array(null).
    //  int marks[] = new int[size];

    //  // for inputing number 
    //   for(int i = 0 ; i<size ; i++){
    //     marks[i] = sc.nextInt(); }

    // // for displaying value 
    //  for(int i = 0 ; i<size ; i++){
    //     System.out.println(marks[i]); }



    // EXERSICE



    
     Scanner sc = new Scanner(System.in);
     int size = sc.nextInt();
                                            // a program taking random number as input and then taking the numbers input and then printing the array(null).
     int marks[] = new int[size];

     // for inputing number 
      for(int i = 0 ; i<size ; i++){
        marks[i] = sc.nextInt(); }

        int x = sc.nextInt();

    // for displaying value 
     for(int i = 0 ; i<marks.length ; i++){
        if(marks[i]==x){
            System.out.println("x found at index of : " + i );
        }
     }




            











}}
