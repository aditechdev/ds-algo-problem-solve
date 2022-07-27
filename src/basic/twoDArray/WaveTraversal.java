package basic.twoDArray;

/**
 * WaveTraversal
 *
 * ⬇1 ⬆2⤵ 3 ⬆4
 * ⬇5 ⬆4 ⬇6 ⬆9
 * ⬇5⤴ 5 ⬇8⤴ 6
 *
 * Print Number in Wave form
 * 1 5 5 5 4 2 3 6 8
 */
public class WaveTraversal {
    static void disPlayWaveTraversal(int[][] arr){
        /**
         *  @param flag we can also use odd even instead of flag, named flag
         */
        boolean flag = false;
        for (int i = 0; i < arr.length ; i++) {

            if (flag == false) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j]+ " ");
                }
                flag = true;
            }else{
                for (int j = arr[i].length-1; j >=0 ; j--) {
                    System.out.print(arr[i][j]+" ");
                }
                flag = false;
            }

        }


    }
    public static void main(String[] args) {
        int[][] arr = {{1,3,4,5,6},{1,3,4,5,6},{1,3,5,6,7}};
        disPlayWaveTraversal(arr);
    }
}
