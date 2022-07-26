package basic.twoDArray;

import java.util.Scanner;

public class twoDArrayPractice {
    static void hardCodedArray() {
        int[][] arr = {
                {10, 20, 40, 59},
                {4, 93, 23},
                {80, 90}
        };
//        Print
        int rows = arr.length;
        System.out.println(rows);

//        print column
        for (int i = 0; i < rows; i++) {
            int column_in_each_rows = arr[i].length;
            for (int j = 0; j < column_in_each_rows; j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
    }

    static int[][] create2dArray(){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] arr = new int[row][column];
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        return arr;
    }
    static void displayArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            int column_in_each_rows = arr[i].length;
            for (int j = 0; j < column_in_each_rows; j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        Hardcoded Array
//        hardCodedArray();
        int[][] arr = create2dArray();
//        jagged Array: Variable no of columns
        displayArray(arr);

    }
}
