package normal_problem;

import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        int total = A + B + C + D + E;
        char grade;
        int percentage = (total *100)/500;

        if(percentage >= 90){
            grade = 'A';
            return;
        }else if(percentage >= 80){
            grade = 'B';

        }else if(percentage >= 70){
            grade = 'C';
        }else if(percentage >= 60){
            grade = 'D';

        }else if(percentage >= 40){
            grade = 'E';

        }else{
            grade = 'F';
        }

        // switch(percentage){
        //     case percentage >= 90: grade = 'A';
        //     break;
        //     case percentage >= 80: grade = 'B';
        //     break;
        //     case percentage >= 70: grade = 'C';
        //     break;
        //     case percentage >= 60: grade = 'D';
        //     break;
        //     case percentage >= 40: grade = 'E';
        //     break;
        //     default: grade = 'F';
        // }
        System.out.println(percentage);
        System.out.println(grade);
    }
}
