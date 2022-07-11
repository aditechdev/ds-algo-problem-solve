package basic.array;

import java.util.Scanner;

public class binaryToDecimal {
    public static int binaryToDec(int N){
        int ans = 0;
        int power = 1;
        while(N > 0){
            int lastDigit = N%10;
            ans = ans + lastDigit*power;
            power = power *2;
            N = N/10;
        }
        return ans;
    }

    public static int decimalToBinary(int N){
        int ans = 0;
        int power = 1;
        while(N > 0){
            int lastDigit = N%2;
            ans = ans + lastDigit*power;
            N = N/2;
            power = power *10;
        }
        return ans;
    }

    public static int magicNumber(int N){
        int ans = 0;
        int power = 5;
        while(N > 0){
            int lastDigit = N%2;
            ans = ans + lastDigit*power;
            N = N/2;
            power = power *5;
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        System.out.println(binaryToDec(n));
//        System.out.println(decimalToBinary(n));
//        System.out.println(magicNumber(n));
        for (int i = 0; i<=n;i++){
//            Binary to Decimal
//            System.out.print(binaryToDec(i) + ", ");
//            Decimal to Binary
//        System.out.print(decimalToBinary(i) + ", ");
//            Magic Number
            System.out.print(magicNumber(i) + ", ");

        }
    }
}
