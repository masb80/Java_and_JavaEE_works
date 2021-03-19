package MinMaxSum;

import java.math.BigInteger;
import java.util.Arrays;

public class MinMaxSum {
    static void miniMaxSum(int[] arr) {
        BigInteger minsum = BigInteger.valueOf(0);
        BigInteger maxsum = BigInteger.valueOf(0);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            minsum = minsum.add(BigInteger.valueOf(arr[i]));
        }
        for (int i = 1; i < arr.length; i++) {
            maxsum = maxsum.add(BigInteger.valueOf(arr[i]));
        }
        System.out.print(minsum + " " + maxsum);
    }

    public static void main(String[] args) {
        // int[] arr = {1,3,5,7,9}; // test case 1
        int[] arr = { 7, 69, 2, 221, 8974 }; // test case 2
        miniMaxSum(arr);
    }

}
