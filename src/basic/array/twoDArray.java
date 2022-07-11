package basic.array;

import java.util.Scanner;

public class twoDArray {
    // return index of x in the basic.array, or return -1
    static int linearSearch(int[] arr, int q){
        for(int i = 0; i<arr.length; i++){
            if (arr[i] == q){
                return i;
            }
        }
        return  -1;

    }
//    Multiple occurence of same element(JUGAD Approach)
    static void linearSearchAll(int[] arr, int k){
        for (int i = 0; i< arr.length; i++){
            if(arr[i] == k){
                System.out.print(i + ", ");
            }
        }

    }

    static int[] linearSearchAllActualApproach(int[] arr, int k){
        int[] searchList = new int[arr.length + 1];
        int index = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i] == k){

                searchList[index] = i;
                index = index+1;
            }
        }
        searchList[index] = -1;
        return searchList;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int[] arr = {1, 2,6, 9, 19, 23, 48};
        int[] arr2 = {1, 2,-1, -1, -3, 23, 48};

//        linearSearchAll(arr2, key);
//        System.out.println(linearSearchAllActualApproach(arr2,key));
        int[] sortedArray = linearSearchAllActualApproach(arr2,key);
        for (int x:sortedArray
             ) {
            if(x == -1){
                return;
            }

            System.out.println(x+ " ");

        }
//        int res =  linearSearch(arr,key);
//        if(res == -1){
//            System.out.println("Element not found");
//        }else {
//            System.out.println("Element is present at index: "+res);
//        }

    }
}
