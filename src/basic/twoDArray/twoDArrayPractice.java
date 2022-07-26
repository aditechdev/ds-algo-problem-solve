package basic.twoDArray;

public class twoDArrayPractice {
    public static void main(String[] args) {
//        Hardcoded Array
//        jagged Array: Variable no of columns
        int[][] arr = {
                {10, 20, 40, 59},
                {4, 93, 23},
                {80, 90}
        };
//        Print
        int rows = arr.length;
        System.out.println(rows);

//        print column
        for (int i = 0; i< rows; i++){
            int column_in_each_rows = arr[i].length;
            for (int j = 0; j<column_in_each_rows; j++){
                System.out.print(arr[i][j]+", ");
            }
            System.out.println();

        }
    }
}
