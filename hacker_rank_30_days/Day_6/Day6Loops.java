package hacker_rank_30_days.Day_6;

import java.util.Scanner;

public class Day6Loops {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (2 <= n && n <= 20) {
            int i;
            for (i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + n * i);
            }
        }
        scanner.close();
    }
}