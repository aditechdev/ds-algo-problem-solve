package basic.maths.normal_problem;

import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binaryNumber = sc.next();
        int decimal = Integer.parseInt(binaryNumber,2);
        System.out.println(decimal);
    }
}
