package basic.algorithim;

import java.util.Scanner;

public class print_n_number {
    public static int printNumberUseingRecusrion( int N){

        if(N>=1){
            printNumberUseingRecusrion(N-1);
            System.out.print(N+" ");

        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printNumberUseingRecusrion(num);

    }
}
