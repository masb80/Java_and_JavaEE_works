package hacker_rank_30_days.Day_15;

import java.util.Arrays;
import java.util.Scanner;

class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    Difference(int[] elm) {
        this.elements = elm;
    }

    public void computeDifference() {
        Arrays.sort(elements);
        int min = elements[0];
        int diff = 0;

        for (int i = 1; i < elements.length; ++i) {
            if (elements[i] > min) {
                diff = Math.max(elements[i] - min, diff);
            }
            min = Math.min(min, elements[i]);
        }
        maximumDifference = diff;
    }

} // End of Difference class

public class Day15Scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);
        difference.computeDifference();
        System.out.print(difference.maximumDifference);
    }

}
