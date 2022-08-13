package basic;

import java.math.BigInteger;

public class BigIntDemo {

    public static void main(String[] args) {
        BigInteger a = new
                BigInteger("1");
        for (int i = 1; i <= 100; i++) {
            a = a.multiply(BigInteger.valueOf(i));
        }
        System.out.println(a);
    }
}
