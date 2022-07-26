package basic.twoDArray;

import java.util.Scanner;

public class pascalsTriangle {

    static int[][] pascalsTriangle(int n){
        int[][] arr = new int[n][];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i+1];
            arr[i][0] = arr[i][i] =  1;
            for (int j = 1; j <= i-1; j++) {
                arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
                
            }
            
        }
        return arr;

    }

    public static void main(String[] args) {
        System.out.println("Enter No of Rows");
        Scanner sc = new Scanner(System.in);
        int[][] arr = pascalsTriangle(sc.nextInt());
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (j == arr[i].length){
                    System.out.print(arr[i][j]);
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
