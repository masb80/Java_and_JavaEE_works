package hacker_rank_30_days.Day_10;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DayREcursion3 {
    // Complete the factorial function below.
    static int factorial(int n) {
        // int rn = 0;
        return (n == 1) ? 1 : n * factorial(n - 1);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int result = factorial(n);
        System.out.println(result);
        scanner.close();
    }

}
