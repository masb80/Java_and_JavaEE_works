package MarksCakewajk;

import java.util.Arrays;

public class MarksCakewajk {
    public static void main(String[] args) {
        int[] calorie = { 1, 3, 2 };
        long res = 0L;
        Arrays.sort(calorie);
        for (int j = calorie.length - 1; j >= 0; j--) {
            res += (long) Math.pow(2, (calorie.length - 1 - j)) * calorie[j];
            System.out.println(res);
        }
    }

}
