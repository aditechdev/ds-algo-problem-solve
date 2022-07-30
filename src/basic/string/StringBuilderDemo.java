package basic.string;

import java.util.Scanner;

/**
 * String Builder is 
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        StringBuilder stringBuilder = new StringBuilder(s);
        System.out.println(stringBuilder.capacity()); // to know the capacity
        System.out.println(stringBuilder.length());
    }
}
