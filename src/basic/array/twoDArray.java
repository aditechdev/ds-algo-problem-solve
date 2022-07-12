package basic.array;

import java.util.Scanner;

public class twoDArray {
    // return index of x in the basic.array, or return -1
    static int linearSearch(int[] arr, int q) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == q) {
                return i;
            }
        }
        return -1;

    }

    //    Multiple occurence of same element(JUGAD Approach)
    static void linearSearchAll(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                System.out.print(i + ", ");
            }
        }

    }

    static int[] linearSearchAllActualApproach(int[] arr, int k) {
        int[] searchList = new int[arr.length + 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {

                searchList[index] = i;
                index = index + 1;
            }
        }
        searchList[index] = -1;
        return searchList;
    }

    //    Binary search
    static int binarySearch(int[] arr, int k) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] > k) {
                e = mid - 1;
            } else if (arr[mid] < k) {
                s = mid + 1;
            } else {
                return mid;
            }
        }
//        element is not found
        return -1;
    }
    static int binarySearchFirstOccurrence(int[] arr, int k){
        int s = 0;
        int e = arr.length-1;
        int ans = -1; // assuming element doesn't exist but I will update once I get an occurrence
        while (s<=e){
            int mid = (s+e)/2;
            if(arr[mid] > k){
                e = mid -1;
            } else if (arr[mid] <k) {
                s = mid +1;

            }else{
                ans = mid;
//                Update the answer and search left
                e = mid -1;
            }
        }
        return ans;

    }

    static int binarySearchLastOccurrence(int[] arr, int k){
        int s = 0;
        int e = arr.length-1;
        int ans = -1; // assuming element doesn't exist but I will update once I get an occurrence
        while (s<=e){
            int mid = (s+e)/2;
            if(arr[mid] > k){
                e = mid -1;
            } else if (arr[mid] <k) {
                s = mid +1;

            }else{
                ans = mid;
//                Update the answer and search left
                s = mid + 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int[] arr = {1, 2, 6, 9, 19, 23, 48};
        int[] arr2 = {1, 2, -1, -1, -3, 23, 48};
        int[] sortedArrayList = {1,2,5,7,9,13,24,34,39,54};
        int[] repeatElementArrayList = {1,2,4,8,11,11, 11, 11,7,9,13,24,34,39,54};
        System.out.println(binarySearchFirstOccurrence(repeatElementArrayList,key));
        System.out.println(binarySearchLastOccurrence(repeatElementArrayList,key));
//        System.out.println(binarySearch(sortedArrayList,key));

//        linearSearchAll(arr2, key);
//        System.out.println(linearSearchAllActualApproach(arr2,key));
//        int[] sortedArray = linearSearchAllActualApproach(arr2, key);
//        for (int x : sortedArray
//        ) {
//            if (x == -1) {
//                return;
//            }
//
//            System.out.println(x + " ");
//
//        }
//        int res =  linearSearch(arr,key);
//        if(res == -1){
//            System.out.println("Element not found");
//        }else {
//            System.out.println("Element is present at index: "+res);
//        }

    }
}
