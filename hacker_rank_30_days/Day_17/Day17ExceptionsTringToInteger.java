package hacker_rank_30_days.Day_17;

import java.util.Scanner;

public class Day17ExceptionsTringToInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try {
            int i = Integer.parseInt(S);
            System.out.println(i);
        } catch (NumberFormatException ex) {
            System.out.println("Bad String");
        }
    }

}
