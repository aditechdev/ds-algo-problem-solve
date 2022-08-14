package intermediate.problems;

import java.util.Scanner;

public class SquareRoot {
    /**
     * SOlving useing BInary Search
     * @param A is the integer value
     * @return the SquareRoot
     */
    public static int solve(int A) {
        long left = 1;
        long right = A;
        int squareRoot = -1;

        while(left <= right){
            long mid = (left+right)/2;
            if(mid*mid < A){
                left = mid +1;
            }else if(mid * mid > A){
                right = mid -1;
            }else{
                return (int)mid;

            }
            // System.out.println(mid + " " + left + " "+ right);
        }

        return squareRoot;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yooo = sc.nextInt();
       int number =   solve(yooo);
        System.out.println(number);
    }
}
