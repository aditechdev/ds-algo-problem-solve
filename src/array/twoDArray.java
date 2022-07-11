package array;

import java.util.Scanner;

public class twoDArray {
    // return index of x in the array, or return -1
    static int linearSearch(int[] arr, int q){
        for(int i = 0; i<arr.length; i++){
            if (arr[i] == q){
                return i;
            }
        }
        return  -1;

    }
    public static void main(String[] args) {
    int[] arr = {1, 2,6, 9, 19, 23, 48};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int res =  linearSearch(arr,key);
        if(res == -1){
            System.out.println("Element not found");
        }else {
            System.out.println("Element is present at index: "+res);
        }

    }
}
