package normal_problem;

import java.util.Scanner;

public class printPrimeByMethod {
//    To Print the Prime
    public static boolean checkPrime(int n) {
        int i = 2;
        while (i <= n-1) {
            if (n % i == 0) {
                return false;
            }
            i = i + 1;
        }
        return true;
    }

//    To Check Prime
    public static void printPrime(int a) {
        for (int i = 2; i <= a; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        printPrime(a);

    }
}
