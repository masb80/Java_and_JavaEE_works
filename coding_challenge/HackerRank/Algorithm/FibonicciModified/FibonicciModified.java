package FibonicciModified;

import java.math.BigInteger;

public class FibonicciModified {
    // Complete the fibonacciModified function below.
    static BigInteger fibonacciModified(int t1, int t2, int n) {
        BigInteger[] t = new BigInteger[n + 2];
        t[0] = BigInteger.valueOf(0);
        t[1] = BigInteger.valueOf(t1);
        t[2] = BigInteger.valueOf(t2);
        for (int j = 1; j <= n - 2; j++) {
            t[j + 2] = t[j].add(t[j + 1].multiply(t[j + 1]));
        }
        return t[n];

    }

    public static void main(String[] args) {
        // without function from int to BigInteger it is difficult to cast the int 
        // with this large value
        BigInteger t = fibonacciModified(0, 1, 10);
        System.out.println(t);
    }

}
