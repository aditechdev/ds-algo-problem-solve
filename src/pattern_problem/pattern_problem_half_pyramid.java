package pattern_problem;

import java.util.Scanner;

public class pattern_problem_half_pyramid {
    public static void main(String[] args) {
  /*Half pyramid Problem
  ***************************************
        1
        2 3
        4 5 6
        7 8 9 10
  *****************************************
   Observation
   * We have N number of Rows
   * Each Row has number of column equal to row number
   * Value is incremented by 1
   * co
   *
*/
        int value = 1;

        Scanner sc = new Scanner(System.in);
        int numberOfRow = sc.nextInt();



        for (int n = 1; n <= numberOfRow; n++) {
            for (int m = 1; m <= n; m++) {
                System.out.print(value + " ");
                value++;
            }
            System.out.println();
        }
/******************
//        *
//        * *
//        * * *
//        * * * *
*********************/
        for (int n = 1; n <= numberOfRow; n++) {
            for (int m = 1; m <= n; m++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        /*******
        1
        1 2
        1 2 3
        1 2 3 4
        *
        *
        * *****/


        for (int n = 1; n <= numberOfRow; n++) {
            for (int m = 1; m <= n; m++) {
                System.out.print(m+" ");
            }
            System.out.println();
        }
        /**************************
          a
          b c
          d e f
          g h i j

        *
        * *************/
        char ch = 'a';

        for (int n = 1; n <= numberOfRow; n++) {
            for (int m = 1; m <= n; m++) {
                System.out.print(ch+" ");
                if (ch == 'z'){
                    ch = 'a';
                }else{
                    ch++;

                }


            }
            System.out.println();
        }

//        Useing WHile
        /*
        *1
        *2 3
        *4 5 6
        *7 8 9 10
        *
        * Logic
        * There is N rows
        * Number of rows = no of digits in column
        * Increment by 1 value
        *
        * */

        int row = 1;
        int newValue = 1;


        while (row <= numberOfRow){

            int col = 1;

            while (col <= row){
                System.out.print(newValue + " ");
                col ++;
                newValue++;
            }
            System.out.println();
            row++;
        }

    }
}
