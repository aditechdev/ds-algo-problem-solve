package basic.algorithim;
/**
 *
 * 0, 1, 1, 2, 3, 5, 8, 13 ..... nth Term
 *
 * In Recursion
 * f(n) = f(n-1) + f(n-1); - > Recursive case
 * f(0) = 0 & f(1) = 1; --> Base case
 *
 */
public class fibonacci_series {

    public static int fibonacciRecursion(int N){
        //    base case
        if(N == 0 || N == 1){
            return N;
        }
        //   recursive case
        int f1 = fibonacciRecursion(N-1);
        int f2 = fibonacciRecursion(N-2);
        int ans = f1+f2;
        return ans;
    }
    public static void main(String[] args) {
        // Getting 6 th term from fibonacci series, which is 8.
        int n = 6;
        System.out.println(fibonacciRecursion(n));

    }
}
