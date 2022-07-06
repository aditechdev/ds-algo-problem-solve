package normal_problem;

import java.util.Scanner;

public class areaOfCircle {
    public static int solve(int A) {

        double areaOfCircle = Math.PI * A * A;
        int ab = (int) Math.ceil(areaOfCircle);
        return ab;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ab = solve(sc.nextInt());
        System.out.println(ab);

    }
}
