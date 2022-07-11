package basic.maths.normal_problem;

import java.util.Scanner;

//Write a program to input T numbers(N) from user and print count of digits of the given numbers.
/*  Input
*   2
    100
    10101
    *
    * Output
    *
    * 3
    * 5
* */
public class number_of_digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            int userNumber = sc.nextInt();
            int value = 0;

            if (userNumber == 0) {
                System.out.println(1);
            } else {
                for (int j = userNumber; j > 0; j = j / 10) {
                    value++;
                }
                System.out.println(value);
            }
        }
    }
}
/*Test Cases
100
*
0
156496
816526
161147
123496
101573
336540
730562
928812
507347
555502
104622
56526
31040
782997
489603
73537
508947
896516
723760
791307
85222
580907
192127
761050
692516
694916
278700
906166
313404
583466
753118
986253
916345
430617
626101
17918
767157
356663
946730
790856
428518
567704
847382
459558
350701
336986
49447
376001
749854
773208
683660
351428
354115
875787
628830
46631
87056
423882
469149
400460
7348
222267
386713
923693
169236
12815
457964
452745
369478
404694
243601
797996
488751
607336
773907
839452
460674
823354
731805
210528
112914
415465
78308
983381
291253
707138
30012
894661
131020
499162
295121
654720
237781
198187
94766
923370
211002
552730
376115

*
*
* */