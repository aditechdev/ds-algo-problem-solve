package basic.pattern_problem;

import java.util.Scanner;

public class pattern_problem_full_pyramid {
    public static void main(String[] args) {
        /*
        * Full Pyramid Problem
        *
        *      1        i=1
        *     232       i-2
        *    34553      1=3
        *   4567654     1=4
        *
        * Observation:
        * This is something called Arithmetic Progression
        * -------------------------------------------------------
        * Every row starts with the value equal to row number
        * We have to print N number of ROWS
        * Every row has N-i spaces, n number in increasing order
        * followed by i-1 number in decreasing order
        *
        *
        * For this we have used Airethematic Progression
        * eg: 3,7,9,
        * Ti = a + (i-1)d
        * So,
        *   = 3 +(i-1)2
        *   = 3 + 2i - 2
        *   = 1 + 2i
        *   = 2i + 1
        * */







//TODO Hour GLass Pattern
        System.out.println("Hello world");
   /*     Hour Glass Problem
        1 2 3 4 5 6 7 8 9
          1 2 4 5 6 7 8
            1 2 3 4 5
              1 2 3
                1
              1 2 3
            1 2 3 4 5
          1 2 3 4 5 6 7
        1 2 3 4 5 6 7 8 9
        spaces: o, 2, 4, 6, 8
        
    */

        Scanner sc = new Scanner(System.in);
        int myNumber = sc.nextInt();
        for (int i = myNumber; i > 0; i--){

            for (int j =  myNumber -i; j>=1; j-- ){
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print(k+" ");
            }
            System.out.println();

        }
    }
}
