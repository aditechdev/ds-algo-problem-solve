package array;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class arrayDemo {
    public static void arrayPractice(){
        int[] arr = {2,4,19,184,37};

//        To print length
        System.out.println("Length of array "+arr.length);
//        To get array at specific index
        System.out.println("array at index 4 "+ arr[4]);
//        enhanced for loop or for each loop
        System.out.println("The array elements are");
        for (int x: arr
             ) {

            System.out.print( x + ", ");

        }
        System.out.println();
//        print last element of array
        System.out.println("Last number of array "+arr[arr.length-1]);
//
    }
//   print an array
    static void printArray(int[] arr){
        for (int x: arr
             ) {
            System.out.println(x + " ");

        }
    }

    public static void main(String[] args) {
//        arrayPractice();
//        Create array using new
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            int element = sc.nextInt();
            arr[i] = element;
        }
        printArray(arr);

    }
}
