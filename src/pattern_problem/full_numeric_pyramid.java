package pattern_problem;

import java.util.Scanner;

public class full_numeric_pyramid {

    public static void main(String[] args) {
//        0 0 0 0 1 0 0 0 0    number of ZERO = n-1
//        0 0 0 2 3 2 0 0 0     ith = a + (i-1)d
//        0 0 3 4 5 4 3 0 0         = 1 + (i-1)1
//        0 4 5 6 7 6 5 4 0         = i
//        5 6 7 8 9 8 7 6 5     last number  = a + (n-1)*d
//        mid = a +(n-1)d                       = 0 + 2n -2
//        = 1 + (n-1)2
//        = 1 + 2n -2
//            = -1 + 2n

        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        int value = 1;

//        for(int i = 1; i<=num; i++){
//            // Print 0
//            for (int j = 1; j<= num -i; j++){
//                System.out.print("0 ");
//            }
//            // Print Number
//            for (int k = i; k<= value; k++){
//                System.out.print(k+ " ");
//
//            }
//            value =  value +2;
//
//
//            for (int l = value -2; l > i; l--  ){
////                System.out.println("check");
////                System.out.println(value);
////                System.out.println(l);
////                System.out.println("check");
//                System.out.print(l-1 + " ");
//
//            }
//
//            for (int m = 1; m<= num -i; m++){
//                if(m == num -i){
//                    System.out.print("0");
//                }else{
//                    System.out.print("0 ");
//                }
//
//            }
//            System.out.println();
//
//        }
//
//

        for(int i = 1; i<=num; i++){
            // Print 0
            for (int j = 1; j<= num -i; j++){
                System.out.print("0 ");
            }
            // Print Number
            for (int k = i; k<= 2*i -1; k++){
                System.out.print(k+ " ");

            }
//            value =  value +2;


            for (int l = 2*(i-1); l >= i; l--  ){
                System.out.print(l + " ");

            }

            for (int m = 1; m<= num -i; m++){
                if(m == num -i){
                    System.out.print("0");
                }else{
                    System.out.print("0 ");
                }

            }
            System.out.println();

        }



    }
}
