package basic.algorithim;

public class gcd_euclidean_algorithm {

        public static int gcd(int A, int B) {
            if(B == 0) return A;
            else
                return gcd(B, A%B);
        }


    public static void main(String[] args) {
        /**
        * 🚀Euclid's Algorithm or Euclidean Algorithm
        *
        * 📌 This algorithm will compute Greatest Common Factor/ Highest Common factor
        *
        * 📌GCD of 12 and 33
        * 12: Divisor: 1,2,3,4,5,6,12
        * 33: Divisor: 1, 3, 11, 33
        * Common Divisor: 1,3
        * GCD: 3
        *
        * 📌GCD of 25 and 150
        * 25 :Divisor : 1, 5, 25
        * 150 Divisor: 1,2,3,5,6,10,15,25,30,50,75,150
        * Common Divisor: 1,5,25
        * GCD: 25
        *
        * 📌Important Points:
        * GCD of two prime number will be 1
        * */

        int gcdOfTwoNumber = gcd(69,50);
        System.out.println(gcdOfTwoNumber);


    }

}
