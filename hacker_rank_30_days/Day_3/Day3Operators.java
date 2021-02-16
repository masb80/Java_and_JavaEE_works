package hacker_rank_30_days.Day_3;

import java.util.Scanner;

public class Day3Operators {
    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double local_tip = (tip_percent / 100.00) * meal_cost;
        double local_tax = (tax_percent / 100.00) * meal_cost;
        double total_cost = meal_cost + local_tip + local_tax;
        System.out.println(Math.round(total_cost));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        solve(meal_cost, tip_percent, tax_percent);
        scanner.close();

    }
}
