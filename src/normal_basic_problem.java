import java.util.Scanner;

public class normal_basic_problem {

    public static void main(String[] args) {
//        Max of a number

        Scanner sc = new Scanner(System.in);
        int numberOfNumber = sc.nextInt();
        int largestNum = Integer.MIN_VALUE;

        for (int i = 1; i<=  numberOfNumber; i++){
            int userNumber = sc.nextInt();
            if (userNumber > largestNum){
                largestNum = userNumber;
            }
        }
        System.out.println(largestNum);
    }
}
