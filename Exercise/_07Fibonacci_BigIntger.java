//Fibonacci 數列(大整數)

package Exercise;

import java.math.BigInteger;

public class _07Fibonacci_BigIntger {
    public static void main(String[] args) {
        int n = 50;
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;

        System.out.print("Fibonacci 數列: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " , ");
            BigInteger next = a.add(b);
            a = b;
            b = next;
        }
    }
}
