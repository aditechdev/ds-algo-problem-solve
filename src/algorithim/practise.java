package algorithim;

import java.util.Scanner;

public class practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            int newNumber = sc.nextInt();
            int sum = 0;
            if(newNumber == 0){
                return;
            }else{
                for (int j = newNumber; j >= 1; j = j / 10) {
                    int n = j % 10;
                    sum = sum + n;


                }
                System.out.println(sum);

            }


//            sum = 0;


        }
    }
}
