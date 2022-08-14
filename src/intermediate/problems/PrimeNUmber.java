package intermediate.problems;

import java.util.Scanner;

public class PrimeNUmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // int factors = 0;
        boolean flag = true;
        for(int i = 2; i < number; i++){
            if(number%i == 0){
                // if(factors < 3){
                //     factors++;
                // }else{
                //     return;
                // }
                flag = false;
                break;

            }
            System.out.print(i);
        }
        if(flag == true){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int factors = 0;
//        for(int i = 1; i <= number; i++){
//            if(number%i == 0){
//            if(factors < 3){
//                factors++;
//            }else{
//                break;
//            }
//            }
//        }
//        if(factors == 2){
//            System.out.print("YES");
//        }else{
//            System.out.print("NO");
//        }
    }
}
