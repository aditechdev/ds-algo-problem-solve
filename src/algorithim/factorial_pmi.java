package algorithim;

import java.util.Scanner;

public class factorial_pmi {
    public static  int factorialUseingRecusrsion(int A){
      if(A==0) return 1;

      int factorial = A*factorialUseingRecusrsion(A-1);
      return factorial;
    }
    public static void main(String[] args) {
        /**
         * Recusrion
         * Useing Principle of Mathematical Induction
         *
         * fun(A){
         * base case
         *     if(A = something) return Something;
         *
         * recursive case
         *     else{return fun(A) }
         * }
         */
        Scanner sc = new Scanner(System.in);
        System.out.println(factorialUseingRecusrsion(sc.nextInt()));

    }
}
