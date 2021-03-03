package TwoSum;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] arr;
        arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length-1; j++) {
                if (nums[i] + nums[j] == 9) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int a[] = twoSum(arr, 9);
        System.out.println(Arrays.toString(a));
    }
}
