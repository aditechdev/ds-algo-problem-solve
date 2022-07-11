package basic.pattern_problem;
/*
 * 1 2 3 4 5 6 7 8 9
 *   1 2 3 4 5 6 7
 *     1 2 3 4 5
 *       1 2 3
 *         1
 *       1 2 3
 *     1 2 3 4 5
 *   1 2 3 4 5 6 7
 * 1 2 3 4 5 6 7 8 9
 *
 * Time : 3: 49
 * ith = 1+ (i-1)d
 *      = 1 + (i-1)1
 *      = i
 *
 *
 *
 * */

import java.util.Scanner;

public class hour_glass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        int val = num;

        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);

            }
            System.out.println(i);
        }


    }
}
