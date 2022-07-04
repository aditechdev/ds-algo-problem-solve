package normal_problem;

import java.util.Scanner;

public class reverse_of_n_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

//        Using For loop 1
//        for (int i = 1; i <= num; i++) {
//            int myNum = sc.nextInt();
//            int myRevNum = 0;
//            for (; myNum != 0; myNum = myNum / 10) {
//                int k = myNum % 10;
//                myRevNum = (myRevNum * 10) + k;
//            }
//            System.out.println(myRevNum);
//        }

//        Using For loop 2
//        for (int i = 1; i <= num; i++) {
//            int myNum = sc.nextInt();
//            int myRevNum = 0;
//            for (int j = myNum; j != 0; j = j / 10) {
//                int k = j % 10;
//                myRevNum = (myRevNum * 10) + k;
//            }
//            System.out.println(myRevNum);
//        }

//        Using While loop
        while(num >0){
            int myNum = sc.nextInt();
            int reverseNum = 0;
            while (myNum != 0 ){
                int reminder = myNum%10;
                reverseNum = (reverseNum*10) + reminder;
                myNum /=10;
            }
            System.out.println(reverseNum);
            num--;

        }


    }
}
