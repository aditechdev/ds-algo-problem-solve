package pattern_problem;

import java.util.Scanner;

public class reverse_triangle_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = num; i > 0; i--){

            for(int j = 1; j <=i; j++){
                if(i == j){
                    System.out.print(j);

                }else{
                    System.out.print(j + " ");
                }



            }
            System.out.println();

        }
    }
}
