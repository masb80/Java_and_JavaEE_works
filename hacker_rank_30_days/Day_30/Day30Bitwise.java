package hacker_rank_30_days.Day_30;

import java.util.Scanner;

public class Day30Bitwise {
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
      int t = scanner.nextInt();
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      for (int tItr = 0; tItr < t; tItr++) {
          String[] nk = scanner.nextLine().split(" ");
          int n = Integer.parseInt(nk[0]);
          int k = Integer.parseInt(nk[1]);
          maxbitcalculate(n,k);
      }

      scanner.close();
  }

   static void maxbitcalculate(int n, int k) {
    int max = 0;
    for(int i =0; i< n; i++){
      for(int j =0; j < i; j++){
        int bitval = i & j;
        if((bitval > max) && (bitval < k)){
          max = bitval;
        }
      }
    }
    System.out.println(max+"");
  }

}
