package basic.maths.normal_problem;
/*
*
* Given an integer A, determine whether it is palindromic or not.

A palindrome integer is an integer X for which reverse(X) = X where reverse(X) is X with its digits reversed. For e.g., reverse(123) = 321.
* */

import java.util.Scanner;

public class palindrome_check {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNum = sc.nextInt();
        int revNum = 0;
        int j = myNum;
        while(myNum != 0){
            int reminder = myNum%10;
            revNum = (revNum *10)+ reminder;
            myNum /=10;

        }
        if(j == revNum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
