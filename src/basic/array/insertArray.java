package basic.array;

import java.util.Scanner;

public class insertArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfDigit = sc.nextInt();
        int[] arr = new int[noOfDigit-1];
        for (int i = 0 ; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int insertPosition = sc.nextInt();
        int insertNumber = sc.nextInt();
        int[] newArr = new int[noOfDigit];
        for (int i = 0; i < newArr.length; i++){
            if(i == insertPosition){
                newArr[i] = insertNumber;
            } else if (i < insertPosition-1) {
                newArr[i] = arr[i];

            }else {
                System.out.println(i);
                System.out.println(arr[i+1]);
                newArr[i] = arr[i+1];
            }
        }
        System.out.println(newArr.length);
        for (int x: newArr
             ) {
            System.out.print(x + " ");

        }

    }
}
