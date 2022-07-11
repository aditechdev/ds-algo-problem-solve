package basic.maths;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        for(int i = Math.min(A,B); i>=0; i--){
            if(A%i == 0 & B%i ==0){
                int lcm = (A*B)/i;
                System.out.println(lcm);
                break;
            }
        }
    }
}
