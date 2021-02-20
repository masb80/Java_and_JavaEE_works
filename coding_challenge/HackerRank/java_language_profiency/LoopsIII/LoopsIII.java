package LoopsIII;

import java.util.Scanner;

public class LoopsIII {
    /*
     * You are given queries in the form of a, b, and n. For each query, print the
     * series corresponding to the given a,b and n values as a single line of
     * space-separated integers.
     */
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = 0;
            for (int j = 0; j < n; j++) {
                int mathpow = (int) Math.pow(2, j);
                result += mathpow * b;
                int powsum = a + result;
                System.out.print(powsum + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
