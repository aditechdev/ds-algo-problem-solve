package basic.maths.normal_problem;

import java.util.Scanner;

public class areaOfCircle {
    public static int solveAreaOfCircle(int A) {

        double areaOfCircle = Math.PI * A * A;
        int ab = (int) Math.ceil(areaOfCircle);
        return ab;
    }

    public static int solveVolumeOfSphere(final int A) {

        double volumeOfSphere = (4 * Math.PI * Math.pow(A,3))/3;
        int ceil = (int) Math.ceil(volumeOfSphere);
        return ceil;
    }
    public static int gcd(int A, int B) {
        int gcd = 1;
        for(int i = A; i>0; i--){
            if(A % i == 0 && B % i ==0){
                gcd = i;
                break;
            }
        }

        return gcd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();

        int areaOfCircle = solveAreaOfCircle(radius);
        System.out.println(areaOfCircle);
        int volumeOfSphere = solveVolumeOfSphere(radius);
        System.out.println(volumeOfSphere);
        int gcdOfTwoNumber = gcd(12, 20);
        System.out.println("GCD: "+gcdOfTwoNumber);

    }
}
