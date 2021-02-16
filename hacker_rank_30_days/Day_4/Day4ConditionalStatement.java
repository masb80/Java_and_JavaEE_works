package hacker_rank_30_days.Day_4;

import java.util.Scanner;

public class Day4ConditionalStatement {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (1 <= N && N <= 100) {
            if (N % 2 != 0) {
                System.out.println("Weird");
            } else if (N % 2 == 0 && (2 <= N && N <= 5)) {
                System.out.println("Not Weird");
            } else if (N % 2 == 0 && (6 <= N && N <= 20)) {
                System.out.println("Weird");
            } else if (N % 2 == 0 && N > 20) {
                System.out.println("Not Weird");
            }
        }
        scanner.close();
    }
}
