package normal_problem;

import java.util.Scanner;

public class prime_number_between_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 2; i< num; i++){
            int flag = 0;
            for(int j =2; j<=i; j++){
                if(i%j == 0 && i !=j){
                    flag = 1;
                }

            }
            if(flag == 0){
                System.out.println(i);
            }
        }
    }
}
