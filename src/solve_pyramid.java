import java.util.Scanner;

public class solve_pyramid {
    public static void main(String[] args) {
        System.out.println("Hello world");
   /*     Hour Glass Problem
        1 2 3 4 5 6 7 8 9
          1 2 4 5 6 7 8
            1 2 3 4 5
              1 2 3
                1
              1 2 3
            1 2 3 4 5
          1 2 3 4 5 6 7
        1 2 3 4 5 6 7 8 9
        spaces: o, 2, 4, 6, 8
        
    */

        Scanner sc = new Scanner(System.in);
        int myNumber = sc.nextInt();
        for (int i = myNumber; i > 0; i--){

            for (int j =  myNumber -i; j>=1; j-- ){
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print(k+" ");
            }
            System.out.println();

        }
    }
}
