package hacker_rank_30_days.Day_11;

import java.util.Scanner;

public class Day11BinaryNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int count = 0;
        while (n != 0) {
            n = (n & (n << 1));
            count++;
        }

        System.out.println(count);

        scanner.close();
    }

}
