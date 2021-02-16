package hacker_rank_30_days.Day_7;

import java.util.Scanner;

public class Day7LetsReview {
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i;
        if (1 <= n && n <= 10) {
            for (i = 0; i < n; i++) {
                String str = scanner.next();
                if (2 <= str.length() && str.length() <= 10000) {
                    StringBuilder stev = new StringBuilder("");
                    StringBuilder stodd = new StringBuilder("");
                    int j;
                    for (j = 0; j < str.length(); j++) {
                        if (j % 2 == 0) {
                            stev.append(str.charAt(j));
                        } else if (j % 2 != 0) {
                            stodd.append(str.charAt(j));
                        }
                    }
                    System.out.println(stev + " " + stodd);
                }
            }

        }
    }
}
