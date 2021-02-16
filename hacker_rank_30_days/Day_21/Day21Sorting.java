package hacker_rank_30_days.Day_21;

import java.util.Scanner;

public class Day21Sorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        int numofswaps =0;
        for (int i=0; i<n; i++){            
            for(int j =0; j< n-1; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    numofswaps++;
                }
            }
            if(numofswaps == 0){
                break;
            }
        }
        System.out.println("Array is sorted in " + numofswaps +" swaps.");
        System.out.println("First Element: "+ a[0]);
        System.out.println("Last Element: "+ a[a.length -1]);
        
    }
}
